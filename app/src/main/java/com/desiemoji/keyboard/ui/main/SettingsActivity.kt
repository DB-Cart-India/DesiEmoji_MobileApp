package com.desiemoji.keyboard.ui.main

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import com.desiemoji.keyboard.R
import com.desiemoji.keyboard.ui.detail.DetailActivity
import com.desiemoji.keyboard.util.Constant
import com.frogobox.sdk.ext.startActivityExt


class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        supportActionBar!!.title = "Settings"
//        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val simpleSwitch = findViewById<View>(R.id.simpleSwitch) as Switch

        val sharedPreference = getSharedPreferences(Constant.PREF_NAME, Context.MODE_PRIVATE)
        val isVibrate=sharedPreference.getBoolean(Constant.PREF_VIBRATE,false)

        simpleSwitch.isChecked=isVibrate

        simpleSwitch.setOnClickListener {
            val switchState = simpleSwitch.isChecked
            var editor = sharedPreference.edit()
            editor.putBoolean(Constant.PREF_VIBRATE,switchState)
            editor.commit()

            Log.i("Settngs","Switch "+switchState.toString())
        }




    }
}