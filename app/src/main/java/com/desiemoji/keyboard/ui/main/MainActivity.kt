package com.desiemoji.keyboard.ui.main


import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.desiemoji.keyboard.R
import com.desiemoji.keyboard.common.ext.isDarkThemeOn
import com.desiemoji.keyboard.databinding.ActivityMainBinding
import com.desiemoji.keyboard.ui.detail.DetailActivity
import com.frogobox.sdk.ext.showLogDebug
import com.frogobox.sdk.ext.startActivityExt
import dagger.hilt.android.AndroidEntryPoint
import java.io.*


@AndroidEntryPoint
class MainActivity : BaseMainActivity<ActivityMainBinding>() {

    private val NONE = 0
    private val PICKING = 1
    private val CHOSEN = 2

    private var mState = 0

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }

    private val viewModel: MainViewModel by viewModels()

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
        super.setupViewModel()
        viewModel.apply {

        }
    }

    override fun onCreateExt(savedInstanceState: Bundle?) {
        super.onCreateExt(savedInstanceState)
        if (savedInstanceState == null) {
            // Call View Model Here
            Log.d(TAG, "View Model : ${viewModel::class.java.simpleName}")
        }
        // TODO : Add your code here

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        Log.d(TAG, "isDarkThemeOn : ${isDarkThemeOn()}")
        try {
            val largeIcon = BitmapFactory.decodeResource(resources, R.drawable.ic_error)

            val fDir =File(filesDir.absolutePath+"/stickers")
            if(!fDir.exists()){
                fDir.mkdir();
            }

            val f =File(filesDir.absolutePath+"/stickers", "test.png")
            if(!f.exists()){
                val bytes = ByteArrayOutputStream()
                largeIcon.compress(Bitmap.CompressFormat.PNG, 40, bytes)
                f.createNewFile()
                // write the bytes in file
                val fo = FileOutputStream(f)
                fo.write(bytes.toByteArray())
                // remember close de FileOutput
                fo.close()
            }

            val assetManager = assets
            var files: Array<String>? = null
            try {
                files = assetManager.list("")
            } catch (e: IOException) {
                Log.e("tag", "Failed to get asset file list.", e)
            }
            if (files != null) for (filename in files) {
                if (filename.contains("custom.webp")){
                var inp: InputStream? = null
                var outp: OutputStream? = null
                try {
                    inp = assetManager.open(filename)
                    val outFile = File(filesDir.absolutePath + "/stickers", filename+".wasticker")
                    outp = FileOutputStream(outFile)
                    copyFile(inp, outp)
                } catch (e: IOException) {
                    Log.e("tag", "Failed to copy asset file: $filename", e)
                } finally {
                    if (inp != null) {
                        try {
                            inp.close()
                        } catch (e: IOException) {
                            // NOOP
                        }
                    }
                    if (outp != null) {
                        try {
                            outp.close()
                        } catch (e: IOException) {
                            // NOOP
                        }
                    }
                }
            }
            }


        } catch (e: IOException) {
            // TODO Auto-generated catch block
            e.printStackTrace()
        }
        initView()
    }

    @Throws(IOException::class)
    private fun copyFile(inp: InputStream, out: OutputStream) {
        val buffer = ByteArray(1024)
        var read: Int
        while (inp.read(buffer).also { read = it } != -1) {
            out.write(buffer, 0, read)
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (mState === PICKING) {
            mState = CHOSEN
        } else if (mState === CHOSEN) {
            handlingState()
        }
    }

    override fun onResume() {
        super.onResume()
        handlingState()
    }

    override fun initView() {
        super.initView()
        binding.apply {
            handlingState()

            btnChangeKeyboard.setOnClickListener {
                (getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager).showInputMethodPicker()
                mState = PICKING
            }

            btnGoToSetting.setOnClickListener {
                Intent(Settings.ACTION_INPUT_METHOD_SETTINGS).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(this)
                }
            }

            btnDoSomeTest.setOnClickListener {
                startActivityExt<DetailActivity>()
            }

//            btnAutoText.setOnClickListener {
//                startActivityExt<AutoTextActivity>()
//            }

        }
    }

    private fun isUsingKeyboard(): Boolean {
        val currentKeyboard =
            Settings.Secure.getString(contentResolver, Settings.Secure.DEFAULT_INPUT_METHOD)
        val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        val enabledKeyboards = inputMethodManager.enabledInputMethodList
        val check = enabledKeyboards.find {
            it.settingsActivity == MainActivity::class.java.canonicalName
        }
        return if (isKeyboardEnabled()) {
            check?.id == currentKeyboard
        } else {
            false
        }
    }

    private fun isKeyboardEnabled(): Boolean {
        val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        val enabledKeyboards = inputMethodManager.enabledInputMethodList
        return enabledKeyboards.any {
            it.settingsActivity == MainActivity::class.java.canonicalName
        }
    }

    private fun checkKeyboard() {
        val currentKeyboard =
            Settings.Secure.getString(contentResolver, Settings.Secure.DEFAULT_INPUT_METHOD)
        val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        val enabledKeyboards = inputMethodManager.inputMethodList
        showLogDebug("Enabled Keyboards         : $currentKeyboard")
        enabledKeyboards.forEachIndexed { index, it ->
            showLogDebug("Index                     : $index")
            showLogDebug("ID                        : ${it.id}")
            showLogDebug("Class name                : ${it.component.className}")
            showLogDebug("Package Name              : ${it.component.packageName}")
            showLogDebug("Short Class Name          : ${it.component.shortClassName}")
            showLogDebug("Settings Activity         : ${it.settingsActivity}")
            showLogDebug("Service Name              : ${it.serviceName}")
            showLogDebug("Service Info Name         : ${it.serviceInfo.name}")
            showLogDebug("Service Info Package Name : ${it.serviceInfo.packageName}")
            showLogDebug("Service Info Package Flag : ${it.serviceInfo.flags}")
            showLogDebug("-----------------------------------------------------")
        }
    }

    private fun handlingState() {
        checkKeyboard()
        binding.titleState.apply {
            if (!isKeyboardEnabled()) {
                text = "Desi-Emoji Keyboard Not Active"
                setTextColor(ContextCompat.getColor(this@MainActivity, R.color.redSecondary))
            } else {
                if (isUsingKeyboard()) {
                    text = "Desi-Emoji Keyboard Active"
                    setTextColor(ContextCompat.getColor(this@MainActivity, R.color.color_success))
                } else {
                    text = "Not Using Desi-Emoji Keyboard"
                    setTextColor(ContextCompat.getColor(this@MainActivity, R.color.color_primary))
                }
            }
        }
    }

}