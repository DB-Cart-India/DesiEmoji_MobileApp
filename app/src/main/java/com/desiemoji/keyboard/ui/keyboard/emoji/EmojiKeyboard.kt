package com.desiemoji.keyboard.ui.keyboard.emoji

import android.content.Context
import android.graphics.*
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.text.format.DateFormat
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.emoji2.text.EmojiCompat
import coil.Coil
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.fetch.VideoFrameFileFetcher
import com.desiemoji.keyboard.R
import com.desiemoji.keyboard.common.base.BaseKeyboard
import com.desiemoji.keyboard.common.ext.applyColorFilter
import com.desiemoji.keyboard.common.ext.onScroll
import com.desiemoji.keyboard.data.local.category.CategoryEntity
import com.desiemoji.keyboard.data.local.category.CustomCategoryModel
import com.desiemoji.keyboard.data.local.emoji.CustomSubCategoryEntity
import com.desiemoji.keyboard.data.local.emoji.EmojiEntity
import com.desiemoji.keyboard.data.local.subcategory.SubCategoryEntity
import com.desiemoji.keyboard.data.remote.emoji.*
import com.desiemoji.keyboard.databinding.KeyboardEmojiBinding
import com.desiemoji.keyboard.model.DefaultEmojiSearchModel
import com.desiemoji.keyboard.ui.keyboard.StickerSender
import com.desiemoji.keyboard.ui.keyboard.emoji.adapter.*
import com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard.Companion.KEYCODE_DELETE
import com.desiemoji.keyboard.ui.keyboard.main.OnKeyboardActionListener
import com.desiemoji.keyboard.util.Cache
import com.desiemoji.keyboard.util.Constant
import com.desiemoji.keyboard.util.Constant.DATE_TIME_FORMAT_SERVER
import com.desiemoji.keyboard.util.Constant.EMOJI_CUSTOM
import com.desiemoji.keyboard.util.Constant.PREF_LASTSYNC_TIME
import com.desiemoji.keyboard.util.Constant.PREF_NAME
import com.desiemoji.keyboard.util.Toaster
import com.desiemoji.keyboard.util.Utils.BASE_URL
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.*
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.*
import java.util.concurrent.Executors
import kotlin.collections.HashMap


//import android.content.Context
//import android.graphics.Paint
//import android.graphics.Typeface
//import android.graphics.drawable.ColorDrawable
//import android.os.Build
//import android.os.Handler
//import android.os.Looper
//import android.util.AttributeSet
//import android.view.LayoutInflater
//import androidx.annotation.RequiresApi
//import androidx.emoji2.text.EmojiCompat
//import com.desiemoji.keyboard.R
//import com.desiemoji.keyboard.common.base.BaseKeyboard
//import com.desiemoji.keyboard.databinding.KeyboardEmojiBinding
//import com.desiemoji.keyboard.common.ext.applyColorFilter
//import com.desiemoji.keyboard.common.ext.onScroll
//import com.desiemoji.keyboard.ui.keyboard.emoji.adapter.AutoGridLayoutManager
//import com.desiemoji.keyboard.ui.keyboard.emoji.adapter.CustomEmojiAdapter
//import com.desiemoji.keyboard.ui.keyboard.emoji.adapter.EmojisAdapter
//import com.desiemoji.keyboard.ui.keyboard.emoji.adapter.parseRawEmojiSpecsFile
//import com.desiemoji.keyboard.ui.keyboard.main.ItemMainKeyboard
//import com.desiemoji.keyboard.ui.keyboard.main.OnKeyboardActionListener
//
//class EmojiKeyboard(
//    context: Context,
//    attrs: AttributeSet?,
//) : BaseKeyboard<KeyboardEmojiBinding>(context, attrs) {
//
//    private var emojiCompatMetadataVersion = 0
//
//    var mOnKeyboardActionListener: OnKeyboardActionListener? = null
//
//    override fun setupViewBinding(): KeyboardEmojiBinding {
//        return KeyboardEmojiBinding.inflate(LayoutInflater.from(context), this, true)
//    }
//
//    override fun onCreate() {
//    }
//
//    @RequiresApi(Build.VERSION_CODES.M)
//    fun setupEmojiPalette(toolbarColor: Int, backgroundColor: Int, textColor: Int) {
//        binding?.apply {
//            emojiPaletteTopBar.background = ColorDrawable(toolbarColor)
//            emojiPaletteHolder.background = ColorDrawable(backgroundColor)
////            emojiPaletteLabel.setTextColor(textColor)
//            emojiPaletteClose.applyColorFilter(textColor)
//            llayPaletteCustom.setOnClickListener(OnClickListener {
//
//            })
//        }
//        setupEmojis()
//    }
//
//    @RequiresApi(Build.VERSION_CODES.M)
//    fun openEmojiPalette() {
//        setupEmojis()
//    }
//
//    @RequiresApi(Build.VERSION_CODES.M)
//    private fun setupEmojis() {
//        ensureBackgroundThread {
//            val fullEmojiList = parseRawEmojiSpecsFile(context, ItemMainKeyboard.EMOJI_SPEC_FILE_PATH)
//            val systemFontPaint = Paint().apply {
//                typeface = Typeface.DEFAULT
//            }
//
//            val emojis = fullEmojiList.filter { emoji ->
//                systemFontPaint.hasGlyph(emoji) || (EmojiCompat.get().loadState == EmojiCompat.LOAD_STATE_SUCCEEDED && EmojiCompat.get()
//                    .getEmojiMatch(emoji, emojiCompatMetadataVersion) == EmojiCompat.EMOJI_SUPPORTED)
//            }
//
//            Handler(Looper.getMainLooper()).post {
//                setupEmojiAdapter(emojis)
//            }
//        }
//    }
//
//    private fun setupEmojiAdapter(emojis: List<String>) {
////        binding?.emojisList?.apply {
////            val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
////            val emojiTopBarElevation =
////                context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()
////
////            layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
////            adapter = EmojisAdapter(context = context, items = emojis) { emoji ->
////                mOnKeyboardActionListener!!.onText(emoji)
////            }
////
////            onScroll {
////                binding!!.emojiPaletteTopBar.elevation =
////                    if (it > 4) emojiTopBarElevation else 0f
////            }
////        }
//
//        binding?.emojisList?.apply {
//            val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
//            val emojiTopBarElevation =
//                context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()
//
//            layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
//            adapter = EmojisAdapter(context = context, items = emojis) { emoji ->
//                mOnKeyboardActionListener!!.onText(emoji)
//            }
//
//            onScroll {
//                binding!!.emojiPaletteTopBar.elevation =
//                    if (it > 4) emojiTopBarElevation else 0f
//            }
//        }
//
//    }
//
//    private fun ensureBackgroundThread(callback: () -> Unit) {
//        if (Looper.myLooper() == Looper.getMainLooper()) {
//            Thread {
//                callback()
//            }.start()
//        } else {
//            callback()
//        }
//    }
//
//}


class EmojiKeyboard(
    context: Context,
    attrs: AttributeSet?,
) : BaseKeyboard<KeyboardEmojiBinding>(context, attrs)  {

    private var emojiCompatMetadataVersion = 0

    var mOnKeyboardActionListener: OnKeyboardActionListener? = null


    private  var  selectedEmoji: CustomCategoryModel? =null

    //    private  var stickerSender: StickerSender?=null
    private lateinit var toaster: Toaster
    private lateinit var internalDir: File
    private lateinit var listRecentEmoji: List<String>
    private lateinit var viewModel: EmojiKeyboardViewModel
    private lateinit var emojiAPI: EmojiApi
    private lateinit var myCompositeDisposable: CompositeDisposable
    private lateinit var listDefaultEmoji: MutableList<CustomCategoryModel>
    private lateinit var listDefaultEmojiSearch: MutableList<DefaultEmojiSearchModel>
    private lateinit var listCategoryTab: MutableList<CustomCategoryModel>
    private  var requestDateTime: String="0"
    private var lastSyncTime: String="0"
    private var isAPILoading: Boolean=false
//    private lateinit var listCategoryEntity: List<CategoryEntity>


//    private var compatCache = Cache()
//    private lateinit var imageLoader: ImageLoader

    override fun setupViewBinding(): KeyboardEmojiBinding {
        return KeyboardEmojiBinding.inflate(LayoutInflater.from(context), this, true)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate() {
        Log.i("EmojiKeyboard","EmojiKeyboard onCreate.......")
            setupData()
    }


    @RequiresApi(Build.VERSION_CODES.M)
    fun setupData() {

        listCategoryTab= mutableListOf<CustomCategoryModel>()

        composeDefaultEmojiCategory()

        viewModel = EmojiKeyboardViewModel(context)
        //Get Recent Emoji
        viewModel.getAllRecentEmoji {
            if(it!=null){
                listRecentEmoji=it
            }

        }

        //Get Category from Database
        viewModel.getAllCategoryList {
            if(it!=null){
                combineCategoryTabModels(it)
            }

        }

        //Get Updated Data's from Server
        loadDataFromAPI()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun loadDataFromAPI(){
        if(!isAPILoading){
            isAPILoading=true
            //Get Updated Data's from Server
            val sharedPreference =  context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE)
            lastSyncTime=sharedPreference.getString(PREF_LASTSYNC_TIME,"0").toString()

            requestDateTime=DateFormat.format(DATE_TIME_FORMAT_SERVER, Date()).toString()
            Log.i("requestTime","requestDateTime: "+requestDateTime)
            emojiAPI=EmojiApi.Creator().newInstance(context)
            myCompositeDisposable = CompositeDisposable()
            getAllCategoryFromAPI(lastSyncTime)
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun combineCategoryTabModels(listCategoryEntity:List<CategoryEntity>){
        listCategoryTab= mutableListOf<CustomCategoryModel>()

        for(de in listDefaultEmoji){
            listCategoryTab.add(de)
        }

        if(listCategoryEntity!=null){
            for(dbe in listCategoryEntity){
                val cc=CustomCategoryModel(dbe.categoryId,dbe.categoryName,"",dbe.categoryIcon,dbe.categoryIconPath,Constant.EMOJI_CUSTOM)
                listCategoryTab.add(cc)
            }
        }


        binding?.apply {

            val layoutInflater=LayoutInflater.from(context)
            llayCategoryTabParent.removeAllViews()
            for(te in listCategoryTab){
                val viewRecent = layoutInflater.inflate(R.layout.item_category_tab_icon,null,false)

                val tvRecent=viewRecent.findViewById<TextView>(R.id.tv_emoji)
                val ivRecent=viewRecent.findViewById<ImageView>(R.id.iv_emoji)
                val viewSelectRecent=viewRecent.findViewById<View>(R.id.view_select)
                viewSelectRecent.tag=te.name

                if(te.emojiType==Constant.EMOJI_CUSTOM){
                    tvRecent.visibility= GONE
                    ivRecent.visibility= VISIBLE
                    if(te.iconLocalPath!=null&&te.iconLocalPath.isNotEmpty()){
                        val imgFile = File(te.iconLocalPath)
                        if (imgFile.exists()) {
                            val myBitmap: Bitmap = BitmapFactory.decodeFile(imgFile.absolutePath)
                            ivRecent.setImageBitmap(myBitmap)
                        }
                    }


                }else{
                    tvRecent.visibility= VISIBLE
                    ivRecent.visibility= GONE

                    tvRecent.text=te.emojiString
                }

                viewRecent.setOnClickListener(OnClickListener {
                    setSelectedEmoji(te)
                })
                llayCategoryTabParent.addView(viewRecent)




            }

            if(listCategoryTab!=null&&listCategoryTab.size>1){
                setSelectedEmoji(listCategoryTab[1])
            }

        }






    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun composeDefaultEmojiCategory(){
        listDefaultEmoji= mutableListOf<CustomCategoryModel>()
//        if(sCategoryName!=null) {
            val defRecent = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_RECENTS],
                "\uD83D\uDD5B",
                "",
                "",
                Constant.EMOJI_RECENTS
            )
            val defSmileys = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_SMILEYS_EMOTION],
                "\uD83D\uDE03",
                "",
                "",
                Constant.EMOJI_SMILEYS_EMOTION
            )
            val defPeopleBody = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_PEOPLE_BODY],
                "\uD83D\uDD90",
                "",
                "",
                Constant.EMOJI_PEOPLE_BODY
            )
            val defAnimalNature = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_ANIMALS_NATURE],
                "\uD83D\uDC3B",
                "",
                "",
                Constant.EMOJI_ANIMALS_NATURE
            )
            val defFoodDrink = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_FOOD_DRINK],
                "\uD83C\uDF54",
                "",
                "",
                Constant.EMOJI_FOOD_DRINK
            )
            val defTravelPlaces = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_TRAVEL_PLACES],
                "\uD83D\uDE80",
                "",
                "",
                Constant.EMOJI_TRAVEL_PLACES
            )
            val defActivities = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_ACTIVITIES],
                "⚽",
                "",
                "",
                Constant.EMOJI_ACTIVITIES
            )
            val defObjects = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_OBJECTS],
                "\uD83D\uDCA1",
                "",
                "",
                Constant.EMOJI_OBJECTS
            )
            val defSymbols = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_SYMBOLS],
                "\uD83D\uDC95",
                "",
                "",
                Constant.EMOJI_SYMBOLS
            )
            val defFlags = CustomCategoryModel(
                0,
                Constant.sCategoryName[Constant.EMOJI_FLAGS],
                "\uD83C\uDF8C",
                "",
                "",
                Constant.EMOJI_FLAGS
            )

            listDefaultEmoji.add(defRecent)
            listDefaultEmoji.add(defSmileys)
            listDefaultEmoji.add(defPeopleBody)
            listDefaultEmoji.add(defAnimalNature)
            listDefaultEmoji.add(defFoodDrink)
            listDefaultEmoji.add(defActivities)
            listDefaultEmoji.add(defTravelPlaces)
            listDefaultEmoji.add(defObjects)
            listDefaultEmoji.add(defSymbols)
            listDefaultEmoji.add(defFlags)
//        }


        listDefaultEmojiSearch= mutableListOf<DefaultEmojiSearchModel>()

        for(dd in Constant.sCategoryName){
            if((!dd.equals(Constant.sCategoryName.first()))&&(!dd.equals(Constant.sCategoryName.last()))){
                var path="media/"+dd+".txt"
                val fullEmojiList = parseRawEmojiSearchSpecsFile(context, path)
                Log.i("ensureBackgroundThread","path : "+path+" fullEmojiList len : "+fullEmojiList.size)
                val systemFontPaint = Paint().apply {
                    typeface = Typeface.DEFAULT
                }



                val emojis = fullEmojiList.filter { emoji ->
                    systemFontPaint.hasGlyph(emoji.emoji) || (EmojiCompat.get().loadState == EmojiCompat.LOAD_STATE_SUCCEEDED && EmojiCompat.get()
                        .getEmojiMatch(emoji.emoji, emojiCompatMetadataVersion) == EmojiCompat.EMOJI_SUPPORTED)
                }

                listDefaultEmojiSearch.addAll(emojis)
            }
        }

    }
//----------------------Category API-------------------------------------------
    @RequiresApi(Build.VERSION_CODES.M)
    fun getAllCategoryFromAPI(lastSyncTime:String){

        GlobalScope.launch {
            val dateTime=lastSyncTime;
            val reqData=CommonRequestData(dateTime)
//            Handler(Looper.getMainLooper()).post {
//                Toast.makeText(context, "Last Time:  "+reqData.toString(), Toast.LENGTH_LONG).show()
//            }
            myCompositeDisposable.add(
                emojiAPI.getAllCategory(reqData)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({response -> onCategoryResponse(response)}, {t -> onCategoryFailure(t) }))
        }


    }

    private fun onCategoryFailure(t: Throwable) {
        Log.i("getAllCategoryFromAPI","onFailure "+t.message)
        isAPILoading=false
        Toast.makeText(context,t.message, Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun onCategoryResponse(response: CategoryResponse) {
                  if(response!=null&&!response.error){
                        Log.i("getAllCategoryFromAPI","response!=null&&!response.error........")
//                        Log.i("getAllCategoryFromAPI","result body ........"+response.toJson())
                        Log.i("getAllCategoryFromAPI","Category List Size : "+response.data.size)
                        val listCategory=response.data;
                      val myExecutor = Executors.newSingleThreadExecutor()
                      myExecutor.execute {
                          for(dd in listCategory){
                              writeCategoryToLocal(dd)
                              Log.i("getAllCategoryFromAPI","Category List Data : "+dd.categoryID+" "+dd.categoryName)
                          }

                          getAllSubCategoryFromAPI(lastSyncTime)
                          
                          viewModel.getAllCategoryList {
                              val myHandler = Handler(Looper.getMainLooper())
                              myHandler.post {
                                  combineCategoryTabModels(it)
                              }
                          }
                      }




                  }else{
                      isAPILoading=false
                      Log.i("getAllCategoryFromAPI","else.. response!=null&&!response.error........")
                    }
    }

    fun writeCategoryToLocal(cr:Datum){

        if(cr.categoryIcon!=null&&cr.categoryIcon.isNotEmpty()){
            val url=BASE_URL+cr.categoryIcon
            var mImage = downloadImage(url)
            if(mImage!=null){
                //Write To Files Directory
                val fDir =File(context.filesDir.absolutePath+"/"+Constant.FILE_PATH_CATEGORY)
                if(!fDir.exists()){
                    fDir.mkdirs();
                }

                val fileName=cr.categoryID.toString()+".png"

                val f =File(fDir.absolutePath, fileName)

                val bytes = ByteArrayOutputStream()
                mImage.compress(Bitmap.CompressFormat.PNG, 100, bytes)
                f.createNewFile()

                // write the bytes in file
                val fo = FileOutputStream(f)
                fo.write(bytes.toByteArray())
                // remember close de FileOutput
                fo.close()

                Log.i("writeCategoryToLocal","writeCategoryToLocal At : "+f.absolutePath)
                viewModel.getCategoryByCategoryId(cr.categoryID){

                    if(it!=null&&it.categoryId.toLong()==cr.categoryID){
                        //Update
                        val ce=CategoryEntity(it.tableId,cr.categoryID.toInt(),cr.categoryName,cr.categoryIcon,f.absolutePath,cr.createdAt,cr.updatedAt,cr.active)
                        viewModel.updateCategory(ce)
                    }else{
                        //Insert
                        val ce=CategoryEntity(0,cr.categoryID.toInt(),cr.categoryName,cr.categoryIcon,f.absolutePath,cr.createdAt,cr.updatedAt,cr.active)
                        viewModel.insertCategory(ce)
                    }
                }
            }

        }
    }

    //----------------------------------------------------------------------

//------------------------Sub Category----------------------------------------------
    @RequiresApi(Build.VERSION_CODES.M)
    fun getAllSubCategoryFromAPI(lastSyncTime:String){

        GlobalScope.launch {
            val dateTime=lastSyncTime;
            val reqData=CommonRequestData(dateTime)
            myCompositeDisposable.add(
                emojiAPI.getAllSubCategory(reqData)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({response -> onSubCategoryResponse(response)}, {t -> onSubCategoryFailure(t) }))
        }


    }

    private fun onSubCategoryFailure(t: Throwable) {
        Log.i("getSubCategoryFromAPI","onFailure "+t.message)
        isAPILoading=false
        Toast.makeText(context,t.message, Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun onSubCategoryResponse(response: SubCategoryResponse) {
        if(response!=null&&!response.error){
            Log.i("getSubCategoryFromAPI","response!=null&&!response.error........")
//                        Log.i("getAllCategoryFromAPI","result body ........"+response.toJson())
            Log.i("getSubCategoryFromAPI","Sub Category List Size : "+response.data.size)
            val listCategory=response.data;
            val myExecutor = Executors.newSingleThreadExecutor()
            myExecutor.execute {
                for(dd in listCategory){
                    writeSubCategoryToLocal(dd)
                    Log.i("getSubCategoryFromAPI","Sub Category List Data : "+dd.subCategoryId+" "+dd.subCategoryName)
                }

                getAllEmojiFromAPI(lastSyncTime)
            }




        }else{
            isAPILoading=false
            Log.i("getSubCategoryFromAPI","else.. response!=null&&!response.error........")
        }
    }

    fun writeSubCategoryToLocal(cr:SubCategoryResponseData){

        if(cr.subCategoryIcon!=null&&cr.subCategoryIcon.isNotEmpty()){
            val url=BASE_URL+cr.subCategoryIcon
            var mImage = downloadImage(url)
            if(mImage!=null){
                //Write To Files Directory
                val fDir =File(context.filesDir.absolutePath+"/"+Constant.FILE_PATH_SUBCATEGORY)
                if(!fDir.exists()){
                    fDir.mkdirs();
                }

                val fileName=cr.subCategoryId.toString()+".png"

                val f =File(fDir.absolutePath, fileName)

                val bytes = ByteArrayOutputStream()
                mImage.compress(Bitmap.CompressFormat.PNG, 100, bytes)
                f.createNewFile()

                // write the bytes in file
                val fo = FileOutputStream(f)
                fo.write(bytes.toByteArray())
                // remember close de FileOutput
                fo.close()

                Log.i("writeSubCategoryToLocal","writeSubCategoryToLocal At : "+f.absolutePath)
                viewModel.getSubCategoryBySubCategoryId(cr.subCategoryId){

                    if(it!=null&&it.subCategoryId.toLong()==cr.subCategoryId){
                        //Update
                        val ce=SubCategoryEntity(it.tableId,cr.subCategoryId.toInt(),cr.subCategoryName,cr.categoryId.toInt(),cr.subCategoryIcon,f.absolutePath,cr.createdAt,cr.updatedAt,cr.active)
                        viewModel.updateSubCategory(ce)
                    }else{
                        //Insert
                        val ce=SubCategoryEntity(0,cr.subCategoryId.toInt(),cr.subCategoryName,cr.categoryId.toInt(),cr.subCategoryIcon,f.absolutePath,cr.createdAt,cr.updatedAt,cr.active)
                        viewModel.insertSubCategory(ce)
                    }
                }
            }

        }else{
            Log.i("writeSubCategoryToLocal","writeSubCategoryWithout Image : "+cr.subCategoryName)
            //Write Sub Category Without Image
            viewModel.getSubCategoryBySubCategoryId(cr.subCategoryId){

                if(it!=null&&it.subCategoryId.toLong()==cr.subCategoryId){
                    //Update
                    val ce=SubCategoryEntity(it.tableId,cr.subCategoryId.toInt(),cr.subCategoryName,cr.categoryId.toInt(),cr.subCategoryIcon,"",cr.createdAt,cr.updatedAt,cr.active)
                    viewModel.updateSubCategory(ce)
                }else{
                    //Insert
                    val ce=SubCategoryEntity(0,cr.subCategoryId.toInt(),cr.subCategoryName,cr.categoryId.toInt(),cr.subCategoryIcon,"",cr.createdAt,cr.updatedAt,cr.active)
                    viewModel.insertSubCategory(ce)
                }
            }
        }
    }
    //--------------------------------------------------------------------------------------



    //------------------------Emoji----------------------------------------------
    @RequiresApi(Build.VERSION_CODES.M)
    fun getAllEmojiFromAPI(lastSyncTime:String){

        GlobalScope.launch {
            val dateTime=lastSyncTime;
            val reqData=CommonRequestData(dateTime)
            myCompositeDisposable.add(
                emojiAPI.getAllEmoji(reqData)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe({response -> onEmojiResponse(response)}, {t -> onEmojiFailure(t) }))
        }


    }

    private fun onEmojiFailure(t: Throwable) {
        isAPILoading=false
        Log.i("getEmojiFromAPI","onFailure "+t.message)
        Toast.makeText(context,t.message, Toast.LENGTH_SHORT).show()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun onEmojiResponse(response: EmojiResponse) {
        isAPILoading=false
        if(response!=null&&!response.error){
            Log.i("getEmojiFromAPI","response!=null&&!response.error........")
//                        Log.i("getAllCategoryFromAPI","result body ........"+response.toJson())
            Log.i("getEmojiFromAPI","Emoji List Size : "+response.data.size)

            val listEmoji=response.data;
            val myExecutor = Executors.newSingleThreadExecutor()
            myExecutor.execute {
                for(dd in listEmoji){
                    writeEmojiToLocal(dd)
                    Log.i("getEmojiFromAPI","Emoji List Data : "+dd.emojiId+" "+dd.emojiSearchKeyword)
                }

                          val sharedPreference =  context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE)
                          var editor = sharedPreference.edit()
                          editor.putString(PREF_LASTSYNC_TIME,requestDateTime)
                          editor.commit()

                    if(selectedEmoji!=null){
                        setSelectedEmoji(selectedEmoji!!)
                    }


//                viewModel.getAllCategoryList {
//                    val myHandler = Handler(Looper.getMainLooper())
//                    myHandler.post {
//                        combineCategoryTabModels(it)
//                    }
//                }
            }




        }else{
            Log.i("getEmojiFromAPI","else.. response!=null&&!response.error........")
        }
    }

    fun writeEmojiToLocal(cr:EmojiResponseData){

        if(cr.emojiLink!=null&&cr.emojiLink.isNotEmpty()){
            val url=BASE_URL+cr.emojiLink
            var mImage = downloadImage(url)
            val urlWebP=url.replace(".png",".webp")
            var mImageWebP = downloadWebImage(urlWebP)
            if(mImage!=null&&mImageWebP!=null){
                //Write To Files Directory
                val fDir =File(context.filesDir.absolutePath+"/"+Constant.FILE_PATH_STICKER)
                if(!fDir.exists()){
                    fDir.mkdirs();
                }

                val fileName=cr.emojiId.toString()+".png"

                val f =File(fDir.absolutePath, fileName)

                val bytes = ByteArrayOutputStream()
                mImage.compress(Bitmap.CompressFormat.PNG, 100, bytes)
                f.createNewFile()

                // write the bytes in file
                val fo = FileOutputStream(f)
                fo.write(bytes.toByteArray())
                // remember close de FileOutput
                fo.close()

                Log.i("writeEmojiToLocal","writeEmojiToLocal At : "+f.absolutePath)

                //Write WebP

                //Write To Files Directory
                val fDirWebP =File(context.filesDir.absolutePath+"/"+Constant.FILE_PATH_STICKER)
                if(!fDirWebP.exists()){
                    fDirWebP.mkdirs();
                }

                val fileNameWebP=cr.emojiId.toString()+".webp"+".wasticker"

//                val fWebP =File(fDirWebP.absolutePath, fileNameWebP)
//                fWebP.createNewFile()
//
//                // write the bytes in file
//                val foWebP = FileOutputStream(fWebP)
//                foWebP.write(readBytes(mImageWebP))
//                // remember close de FileOutput
//                foWebP.close()

                var webpPath="";

                var inp: InputStream? = null
                var outp: OutputStream? = null
                try {
                    inp = mImageWebP
                    val outFile = File(fDirWebP.absolutePath, fileNameWebP)
                    outp = FileOutputStream(outFile)
                    copyFile(inp, outp)
                    webpPath=outFile.absolutePath
                    Log.i("writeEmojiToLocalWebP","writeEmojiToLocalWebP At : "+outFile.absolutePath)
                } catch (e: IOException) {
                    Log.e("tag", "Failed to copy asset file: $fileNameWebP", e)
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







//                val file: File = createTempFile()
//                val inputStream = ByteArrayInputStream(content.toByteArray())
//                inputStream.use { input ->
//                    file.outputStream().use { output ->
//                        input.copyTo(output)
//                    }
//                }



                viewModel.getEmojiByEmojiId(cr.emojiId){

                    if(it!=null&&it.emojiId.toLong()==cr.emojiId){
                        //Update
                        val ce=EmojiEntity(it.tableId,cr.emojiId.toInt(),cr.emojiSearchKeyword,cr.subCategoryId.toInt(),cr.categoryId.toInt(),cr.emojiLink,f.absolutePath,cr.emojiLink.replace(".png",".webp"),webpPath,cr.createdAt,cr.updatedAt,cr.active)
                        viewModel.updateEmoji(ce)
                    }else{
                        //Insert
                        val ce=EmojiEntity(0,cr.emojiId.toInt(),cr.emojiSearchKeyword,cr.subCategoryId.toInt(),cr.categoryId.toInt(),cr.emojiLink,f.absolutePath,cr.emojiLink.replace(".png",".webp"),webpPath,cr.createdAt,cr.updatedAt,cr.active)
                        viewModel.insertEmoji(ce)
                    }
                }
            }

        }
    }
    //--------------------------------------------------------------------------------------


    private fun downloadImage(string: String): Bitmap? {
        val url: URL = mStringToURL(string)!!
        val connection: HttpURLConnection?
        Log.i("downloadImage","downloadImage : "+string)
        try {
            connection = url.openConnection() as HttpURLConnection
            connection.connect()
            val inputStream: InputStream = connection.inputStream
            val bufferedInputStream = BufferedInputStream(inputStream)
            return BitmapFactory.decodeStream(bufferedInputStream)
        } catch (e: IOException) {
            e.printStackTrace()
            Log.i("downloadImage","downloadImage Error : "+string)
            Handler(Looper.getMainLooper()).post {
                Toast.makeText(context, "Error "+string, Toast.LENGTH_LONG).show()
            }

        }
        return null
    }


    private fun downloadWebImage(string: String): InputStream? {
        val url: URL = mStringToURL(string)!!
        val connection: HttpURLConnection?
        try {
            connection = url.openConnection() as HttpURLConnection
            connection.connect()
            val inputStream: InputStream = connection.inputStream
//            val bufferedInputStream = BufferedInputStream(inputStream)
            return inputStream
        } catch (e: IOException) {
            e.printStackTrace()
            Log.i("downloadImage","downloadImage Error : "+string)
            Handler(Looper.getMainLooper()).post {
                Toast.makeText(context, "Error "+string, Toast.LENGTH_LONG).show()
            }
        }
        return null
    }

    @Throws(IOException::class)
    private fun copyFile(inp: InputStream, out: OutputStream) {
        val buffer = ByteArray(1024)
        var read: Int
        while (inp.read(buffer).also { read = it } != -1) {
            out.write(buffer, 0, read)
        }
    }

//    @Throws(IOException::class)
//    fun readBytes(inputStream: InputStream): ByteArray? {
//        // this dynamically extends to take the bytes you read
//        val byteBuffer = ByteArrayOutputStream()
//
//        // this is storage overwritten on each iteration with bytes
//        val bufferSize = 1024
//        val buffer = ByteArray(bufferSize)
//
//        // we need to know how may bytes were read to write them to the byteBuffer
//        var len = 0
//        while (inputStream.read(buffer).also { len = it } != -1) {
//            byteBuffer.write(buffer, 0, len)
//        }
//
//        // and then we can return your byte array.
//        return byteBuffer.toByteArray()
//    }



    // Function to convert string to URL
    private fun mStringToURL(string: String): URL? {
        try {
            return URL(string)
        } catch (e: MalformedURLException) {
            e.printStackTrace()
        }
        return null
    }

    // Function to save image on the device.
    // Refer: https://www.geeksforgeeks.org/circular-crop-an-image-and-save-it-to-the-file-in-android/
    private fun mSaveMediaToStorage(bitmap: Bitmap?) {

    }



    @RequiresApi(Build.VERSION_CODES.M)
    fun setSelectedEmoji(selectedEmojiCategory:CustomCategoryModel){
        selectedEmoji=selectedEmojiCategory
        binding?.apply {

            for (loop in 0 until llayCategoryTabParent.getChildCount()) {
                //this is the code in question and where I want to get the text from
                //all my EditTexts
                val inner: View = llayCategoryTabParent.getChildAt(loop)
                val viewSelectRecent=inner.findViewById<View>(R.id.view_select)
                if(viewSelectRecent.tag== selectedEmoji!!.name){
                    viewSelectRecent.setBackgroundColor(Color.BLUE)
                }else{
                    viewSelectRecent.setBackgroundColor(Color.WHITE)
                }

                if(selectedEmoji!!.emojiType==Constant.EMOJI_CUSTOM){
                    emojiPaletteSearch.visibility= VISIBLE
                }
                else {
                    emojiPaletteSearch.visibility= VISIBLE
                }
            }


//            if(selectedEmoji==Constant.EMOJI_RECENTS){
//                viewSelectRecent.setBackgroundColor(Color.BLUE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//
//            }
//            else if(selectedEmoji==Constant.EMOJI_SMILEYS_EMOTION){
//            viewSelectRecent.setBackgroundColor(Color.WHITE)
//            viewSelectSmiley.setBackgroundColor(Color.BLUE)
//            viewSelectPeople.setBackgroundColor(Color.WHITE)
//            viewSelectAnimals.setBackgroundColor(Color.WHITE)
//            viewSelectFood.setBackgroundColor(Color.WHITE)
//            viewSelectTravel.setBackgroundColor(Color.WHITE)
//            viewSelectActivities.setBackgroundColor(Color.WHITE)
//            viewSelectObjects.setBackgroundColor(Color.WHITE)
//            viewSelectSymbols.setBackgroundColor(Color.WHITE)
//            viewSelectFlags.setBackgroundColor(Color.WHITE)
//            viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//        }
//            else if(selectedEmoji==Constant.EMOJI_PEOPLE_BODY){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.BLUE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_ANIMALS_NATURE){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.BLUE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_FOOD_DRINK){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.BLUE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_TRAVEL_PLACES){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.BLUE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_ACTIVITIES){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.BLUE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_OBJECTS){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.BLUE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_SYMBOLS){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.BLUE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_FLAGS){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.BLUE)
//                viewSelectCustom.setBackgroundColor(Color.WHITE)
//
//                edSearch.visibility= GONE
//            }
//            else if(selectedEmoji==Constant.EMOJI_CUSTOM){
//                viewSelectRecent.setBackgroundColor(Color.WHITE)
//                viewSelectSmiley.setBackgroundColor(Color.WHITE)
//                viewSelectPeople.setBackgroundColor(Color.WHITE)
//                viewSelectAnimals.setBackgroundColor(Color.WHITE)
//                viewSelectFood.setBackgroundColor(Color.WHITE)
//                viewSelectTravel.setBackgroundColor(Color.WHITE)
//                viewSelectActivities.setBackgroundColor(Color.WHITE)
//                viewSelectObjects.setBackgroundColor(Color.WHITE)
//                viewSelectSymbols.setBackgroundColor(Color.WHITE)
//                viewSelectFlags.setBackgroundColor(Color.WHITE)
//                viewSelectCustom.setBackgroundColor(Color.BLUE)
//
//                edSearch.visibility= VISIBLE
//            }
        }

        setupEmojis()

    }


    @RequiresApi(Build.VERSION_CODES.M)
    fun setupEmojiPalette(toolbarColor: Int, backgroundColor: Int, textColor: Int) {
        binding?.apply {
//            emojiPaletteTopBar.background = ColorDrawable(toolbarColor)
//            emojiPaletteHolder.background = ColorDrawable(backgroundColor)
//            emojiPaletteLabel.setTextColor(textColor)
            emojiPaletteClose.applyColorFilter(textColor)

//            tvEmojiRecent.text= EmojiCompat.get().process(tvEmojiRecent.text)
//            tvEmojiSmiley.text= EmojiCompat.get().process(tvEmojiSmiley.text)
//            tvEmojiPeople.text= EmojiCompat.get().process(tvEmojiPeople.text)
//            tvEmojiAnimals.text= EmojiCompat.get().process(tvEmojiAnimals.text)
//            tvEmojiFood.text= EmojiCompat.get().process(tvEmojiFood.text)
//            tvEmojiTravel.text= EmojiCompat.get().process(tvEmojiTravel.text)
//            tvEmojiActivities.text= EmojiCompat.get().process(tvEmojiActivities.text)
//            tvEmojiObjects.text= EmojiCompat.get().process(tvEmojiObjects.text)
//            tvEmojiSymbols.text= EmojiCompat.get().process(tvEmojiSymbols.text)
//            tvEmojiFlags.text= EmojiCompat.get().process(tvEmojiFlags.text)
//            tvEmojiCustom.text= EmojiCompat.get().process(tvEmojiCustom.text)


//            llayEmojiRecent.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_RECENTS)
//            })
//            llayEmojiSmiley.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_SMILEYS_EMOTION)
//            })
//            llayEmojiPeople.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_PEOPLE_BODY)
//            })
//            llayEmojiAnimals.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_ANIMALS_NATURE)
//            })
//            llayEmojiFood.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_FOOD_DRINK)
//            })
//            llayEmojiTravel.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_TRAVEL_PLACES)
//            })
//            llayEmojiActivities.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_ACTIVITIES)
//            })
//            llayEmojiObjects.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_OBJECTS)
//            })
//            llayEmojiSymbols.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_SYMBOLS)
//            })
//            llayEmojiFlags.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_FLAGS)
//            })
//            llayEmojiCustom.setOnClickListener(OnClickListener {
//                setSelectedEmoji(Constant.EMOJI_CUSTOM)
//            })
            edSearch.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                  Log.i("edSearch","edSearch : "+edSearch.text.toString())
                    if(selectedEmoji!!.emojiType== EMOJI_CUSTOM){
                        setupCustomSearchEmojiAdapter(edSearch.text.toString())
                    }else{
                        setupDefaultSearchEmojiAdapter(edSearch.text.toString())
                    }

                }
            })

            emojiPaletteSearch.setOnClickListener(OnClickListener {
                openSearchEvent()
            })

            emojiSearchClose.setOnClickListener(OnClickListener {
              closeSearchEvent()
            })

            emojiPaletteClear.setOnClickListener(OnClickListener {
                mOnKeyboardActionListener!!.onKey(KEYCODE_DELETE)
            })
        }
        setupEmojis()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun openSearchEvent(){

        if(selectedEmoji!!.emojiType==Constant.EMOJI_CUSTOM){
            setupCustomSearchEmojiAdapter("")
        }else{
            setupDefaultSearchEmojiAdapter("")
        }

        binding?.apply {
            llayEmojiPaletteTopSearchBar.visibility=View.VISIBLE
            llayEmojiPaletteTopCategoryBar.visibility=View.GONE
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun closeSearchEvent(){
        binding?.apply {
            edSearch.setText("")
            llayEmojiPaletteTopSearchBar.visibility=View.GONE
            llayEmojiPaletteTopCategoryBar.visibility=View.VISIBLE
            mOnKeyboardActionListener!!.onHideKeyboardOnly()
            setSelectedEmoji(selectedEmoji!!)
        }

    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun resetAllView(){
        binding?.apply {
            edSearch.setText("")
            llayEmojiPaletteTopSearchBar.visibility=View.GONE
            llayEmojiPaletteTopCategoryBar.visibility=View.VISIBLE
            mOnKeyboardActionListener!!.onHideKeyboardOnly()
            setSelectedEmoji(listCategoryTab[1])
//            setSelectedEmoji(selectedEmoji!!)
        }

    }


    @RequiresApi(Build.VERSION_CODES.M)
    fun openEmojiPalette() {
        Log.i("EmojiKeyboard","EmojiKeyboard openEmojiPalette.......")
//        Toast.makeText(context,isAPILoading.toString(),Toast.LENGTH_LONG).show()
        resetAllView()
        loadDataFromAPI()
        //Get Category from Database
        if(viewModel!=null){
            viewModel.getAllCategoryList {
                if(it!=null){
                    combineCategoryTabModels(it)
                }

            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setupEmojis() {



        ensureBackgroundThread {
            if(selectedEmoji!=null){
                if(selectedEmoji!!.emojiType!=Constant.EMOJI_RECENTS&& selectedEmoji!!.emojiType!=Constant.EMOJI_CUSTOM){
                    var path="media/"+Constant.sCategoryName[selectedEmoji!!.emojiType]+".txt"
//                val fullEmojiList = parseRawEmojiSpecsFile(context, ItemMainKeyboard.EMOJI_SPEC_FILE_PATH)
                    val fullEmojiList = parseRawEmojiSpecsFile(context, path)
                    Log.i("ensureBackgroundThread","path : "+path+" fullEmojiList len : "+fullEmojiList.size)
                    val systemFontPaint = Paint().apply {
                        typeface = Typeface.DEFAULT
                    }

                    val emojis = fullEmojiList.filter { emoji ->
                        systemFontPaint.hasGlyph(emoji) || (EmojiCompat.get().loadState == EmojiCompat.LOAD_STATE_SUCCEEDED && EmojiCompat.get()
                            .getEmojiMatch(emoji, emojiCompatMetadataVersion) == EmojiCompat.EMOJI_SUPPORTED)
                    }

                    Handler(Looper.getMainLooper()).post {
                        setupEmojiAdapter(emojis)
                    }
                }else{
                    if(selectedEmoji!!.emojiType==Constant.EMOJI_RECENTS){
//                    val emojisRecentList = mutableListOf<String>()
//                    emojisRecentList.add("\uD83D\uDD5B")
//                    emojisRecentList.add("\uD83D\uDE03")

                        var emojisRecentList = mutableListOf<String>()

                        viewModel.getAllRecentEmoji {
                            listRecentEmoji=it

                            listRecentEmoji.forEach{
                                emojisRecentList.add(it)
                            }

                            Handler(Looper.getMainLooper()).post {
                                setupEmojiAdapter(emojisRecentList)
                            }
                        }


                    }else if(selectedEmoji!!.emojiType==Constant.EMOJI_CUSTOM){
//                        val emojisRecentList = mutableListOf<String>()
//                        emojisRecentList.add("\uD83D\uDD5B")
//                    emojisRecentList.add("\uD83D\uDE03")
                        Handler(Looper.getMainLooper()).post {
                            setupCustomEmojiAdapter()
                        }
                    }
                }

            }
            }

    }

    private fun setupEmojiAdapter(emojis: List<String>) {
//        binding?.emojisList?.apply {
//            val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
//            val emojiTopBarElevation =
//                context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()
//
//            layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
//            adapter = EmojisAdapter(context = context, items = emojis) { emoji ->
//                mOnKeyboardActionListener!!.onText(emoji)
//            }
//
//            onScroll {
//                binding!!.emojiPaletteTopBar.elevation =
//                    if (it > 4) emojiTopBarElevation else 0f
//            }
//        }

//        for (item in emojis) {
//            // body of loop
//            Log.i("Emoji","Emoji : "+item)
//        }

        binding?.apply {
            llayList.visibility=View.GONE
            llayList.removeAllViews()
            emojisList.visibility=View.VISIBLE
        }


        this.toaster = Toaster(context)
        this.internalDir = File(context.filesDir, "stickers")
        var compatCache = Cache()

        val imageLoader =
            ImageLoader.Builder(context)
                .componentRegistry {
                    if (Build.VERSION.SDK_INT >= 28) {
                        add(ImageDecoderDecoder(context))
                    } else {
                        add(GifDecoder())
                    }
                    add(VideoFrameFileFetcher(context))
                }
                .build()
        Coil.setImageLoader(imageLoader)

        var stickerSender = StickerSender(
            this.context,
            this.toaster,
            this.internalDir,
            this.currentInputConnection,
            this.currentInputEditorInfo,
            compatCache,
            imageLoader
        )



        binding?.emojisList?.apply {
            val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
            val emojiTopBarElevation =
                context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()


            if(selectedEmoji!!.emojiType==Constant.EMOJI_CUSTOM){
//                layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
//                adapter = CustomEmojiAdapter(stickerSender=stickerSender,context = context, items = emojis) { emoji ->
//                    mOnKeyboardActionListener!!.onText(emoji)
//                }

            }else{
                layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
                adapter = EmojisAdapter(context = context, items = emojis) { emoji ->
                    mOnKeyboardActionListener!!.onText(emoji)
                    viewModel.insertRecentEmoji(emoji)
                    viewModel.getAllRecentEmoji {
                        listRecentEmoji=it
                    }

                }
            }

            onScroll {
                binding!!.emojiPaletteTopBar.elevation =
                    if (it > 4) emojiTopBarElevation else 0f
            }
        }

    }


    private fun setupCustomEmojiAdapter() {

        binding?.apply {
            llayList.visibility=View.VISIBLE
            llayList.removeAllViews()
            emojisList.visibility=View.GONE
        }

        this.toaster = Toaster(context)
        this.internalDir = File(context.filesDir, Constant.FILE_PATH_STICKER)
        var compatCache = Cache()

        val imageLoader =
            ImageLoader.Builder(context)
                .componentRegistry {
                    if (Build.VERSION.SDK_INT >= 28) {
                        add(ImageDecoderDecoder(context))
                    } else {
                        add(GifDecoder())
                    }
                    add(VideoFrameFileFetcher(context))
                }
                .build()
        Coil.setImageLoader(imageLoader)

        var stickerSender = StickerSender(
            this.context,
            this.toaster,
            this.internalDir,
            this.currentInputConnection,
            this.currentInputEditorInfo,
            compatCache,
            imageLoader
        )

       val layoutInflater = LayoutInflater.from(context)
//        Log.i("getSubCategoryDB","getSubCategoryByCategoryId 1 CategoryId "+selectedEmoji!!.id.toLong())
        viewModel.getSubCategoryByCategoryId(selectedEmoji!!.id.toLong()) {
            if(it!=null){
                val listSubCategory=it

                var subCategoryList= mutableListOf<CustomSubCategoryEntity>()
                var hsmapSubCategory=HashMap<String,List<EmojiEntity>>()
                var count=0
                for(dd in listSubCategory){

                    //Label Data
//                    val el= EmojiEntity(0,0,dd.subCategoryName,0,0,"","","","","","",false)
//                    emojisList.add(el)

                    Log.i("getSubCategoryDB","getSubCategoryDB getSubCategoryByCategoryId "+dd!!.subCategoryId.toLong()+" "+dd.subCategoryName)

                    viewModel.getEmojiBySubCategoryId(dd!!.subCategoryId.toLong()) {
                        count=count+1
                        if(it!=null&&it.isNotEmpty()){
                            val listEm=it
                            var emojisList = mutableListOf<EmojiEntity>()
                            for(ed in listEm){
                                emojisList.add(ed)
                            }

                            val sd=CustomSubCategoryEntity(dd.subCategoryName,emojisList)
                            subCategoryList.add(sd)
                            hsmapSubCategory.put(dd.subCategoryId.toString(),emojisList)

//                            binding?.apply {
//                                val layoutId = R.layout.item_keyboard_category_recyclerview
//                                val view = layoutInflater.inflate(layoutId, null, false)
//
//                                val tvLabel = view.findViewById<TextView>(R.id.tv_label)
//                                val rvList =
//                                    view.findViewById<EmojiKeyboardRecyclerView>(R.id.emojis_sublist)
//                                tvLabel.text = dd.subCategoryName
//                                rvList.apply {
//                                    val emojiItemWidth =
//                                        context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
//                                    val emojiTopBarElevation =
//                                        context.resources.getDimensionPixelSize(R.dimen.dp4)
//                                            .toFloat()
//
//                                    layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
//                                    adapter = CustomEmojiAdapter(
//                                        stickerSender = stickerSender,
//                                        context = context,
//                                        items = emojisList
//                                    ) { emoji ->
//                                        mOnKeyboardActionListener!!.onText(emoji)
//                                    }
//
//                                    llayList.addView(view)
//                                }
//                            }

                        }else{
                            //Empty List
                            var emojisList = mutableListOf<EmojiEntity>()
                            val sd=CustomSubCategoryEntity(dd.subCategoryName,emojisList)
                            subCategoryList.add(sd)
                            hsmapSubCategory.put(dd.subCategoryId.toString(),emojisList)
                        }

                        if(count==listSubCategory.size){
                            for(sss in listSubCategory){
                                var emojisList=hsmapSubCategory.get(sss.subCategoryId.toString())
                                if(emojisList!=null&&emojisList!!.isNotEmpty()){
                                    binding?.apply {
                                        val layoutId = R.layout.item_keyboard_category_recyclerview
                                        val view = layoutInflater.inflate(layoutId, null, false)

                                        val tvLabel = view.findViewById<TextView>(R.id.tv_label)
                                        val rvList =
                                            view.findViewById<EmojiKeyboardRecyclerView>(R.id.emojis_sublist)
                                        tvLabel.text = sss.subCategoryName
                                        rvList.apply {
                                            val emojiItemWidth =
                                                context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
                                            val emojiTopBarElevation =
                                                context.resources.getDimensionPixelSize(R.dimen.dp4)
                                                    .toFloat()

                                            layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
                                            adapter = CustomEmojiAdapter(
                                                stickerSender = stickerSender,
                                                context = context,
                                                items = emojisList!!
                                            ) { emoji ->
                                                mOnKeyboardActionListener!!.onText(emoji)
                                            }

                                            llayList.addView(view)
                                        }
                                    }
                                }

                            }
                        }


                    }
                }






            }

        }




    }


    @RequiresApi(Build.VERSION_CODES.M)
    private fun setupCustomSearchEmojiAdapter(searchText:String) {

        binding?.apply {
            llayList.visibility=View.GONE
            llayList.removeAllViews()
            emojisList.visibility=View.VISIBLE
        }

        this.toaster = Toaster(context)
        this.internalDir = File(context.filesDir, Constant.FILE_PATH_STICKER)
        var compatCache = Cache()

        val imageLoader =
            ImageLoader.Builder(context)
                .componentRegistry {
                    if (Build.VERSION.SDK_INT >= 28) {
                        add(ImageDecoderDecoder(context))
                    } else {
                        add(GifDecoder())
                    }
                    add(VideoFrameFileFetcher(context))
                }
                .build()
        Coil.setImageLoader(imageLoader)

        var stickerSender = StickerSender(
            this.context,
            this.toaster,
            this.internalDir,
            this.currentInputConnection,
            this.currentInputEditorInfo,
            compatCache,
            imageLoader
        )


        if(searchText.length>0){
            viewModel.getEmojiBySearch(searchText) {
                if(it!=null) {
                    Log.i("searchText","searchText Size : "+it.size)
                    val listEm = it
                    var emojisList = mutableListOf<EmojiEntity>()
                    for (ed in listEm) {
                        emojisList.add(ed)
                    }

                    binding?.emojisList?.apply {
                        val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
                        val emojiTopBarElevation =
                            context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()

                        layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
                        adapter = CustomEmojiAdapter(stickerSender=stickerSender,context = context, items = emojisList) { emoji ->
                            closeSearchEvent()
                        }

                        onScroll {
                            binding!!.emojiPaletteTopBar.elevation =
                                if (it > 4) emojiTopBarElevation else 0f
                        }
                    }
                }
            }
        }else{
            var emojisList = mutableListOf<EmojiEntity>()
            binding?.emojisList?.apply {
                val emojiItemWidth = context.resources.getDimensionPixelSize(R.dimen.emoji_item_size)
                val emojiTopBarElevation =
                    context.resources.getDimensionPixelSize(R.dimen.dp4).toFloat()

                layoutManager = AutoGridLayoutManager(context, emojiItemWidth)
                adapter = CustomEmojiAdapter(stickerSender=stickerSender,context = context, items = emojisList) { emoji ->
                    mOnKeyboardActionListener!!.onText(emoji)
                }

                onScroll {
                    binding!!.emojiPaletteTopBar.elevation =
                        if (it > 4) emojiTopBarElevation else 0f
                }
            }
        }



    }


    @RequiresApi(Build.VERSION_CODES.M)
    private fun setupDefaultSearchEmojiAdapter(searchText:String) {

        if(searchText.length>0){

            val listSearchEmojis = mutableListOf<String>()
            val searchTextLower=searchText.lowercase()

            for( dd in listDefaultEmojiSearch){
                if(dd.keyword.contains(searchTextLower)){
                        listSearchEmojis.add(dd.emoji)
                }
            }

            setupEmojiAdapter(listSearchEmojis)

        }else{
            var emojisList = mutableListOf<String>()
            setupEmojiAdapter(emojisList)
        }



    }

    private fun ensureBackgroundThread(callback: () -> Unit) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Thread {
                callback()
            }.start()
        } else {
            callback()
        }
    }

    fun parseRawEmojiSpecsFile(context: Context, path: String): MutableList<String> {


        val emojis = mutableListOf<String>()
        var emojiEditorList: MutableList<String>? = null
        var currentEmojiCategory=""

        fun commitEmojiEditorList() {
//            Log.i("parseRawEmojiSpecsFile","commitEmojiEditorList....")
            emojiEditorList?.let {
                // add only the base emoji for now, ignore the variations
                emojis.add(it.first())
            }
            emojiEditorList = null
        }

        context.assets.open(path).bufferedReader().useLines { lines ->
            for (line in lines) {
//                Log.i("parseRawEmojiSpecsFile","for (line in lines) ....")
                if (line.startsWith("#")) {
                    // Comment line
//                    Log.i("parseRawEmojiSpecsFile","line.startsWith(\"#\") ....")
                } else if (line.startsWith("[")) {
//                    Log.i("parseRawEmojiSpecsFile","line.startsWith(\"[\") ....")
                    commitEmojiEditorList()
                } else if (line.trim().isEmpty()) {
                    // Empty line
//                    Log.i("parseRawEmojiSpecsFile","line.trim().isEmpty() ....")
                    continue
                } else {
                    if (!line.startsWith("\t")) {
//                        Log.i("parseRawEmojiSpecsFile","else !line.startsWith(\"\\t\") ....")
                        commitEmojiEditorList()
                    }

                    // Assume it is a data line
                    val data = line.split(";")
                    if (data.size == 3) {
                        val emoji = data[0].trim()
                        if (emojiEditorList != null) {
//                            Log.i("parseRawEmojiSpecsFile","else emojiEditorList != null ....")
                            emojiEditorList!!.add(emoji)
                        } else {
//                            Log.i("parseRawEmojiSpecsFile","else else ....")
                            emojiEditorList = mutableListOf(emoji)
                        }
                    }
                }
            }
//            Log.i("parseRawEmojiSpecsFile","for completed ....")
            commitEmojiEditorList()
        }

        return emojis
    }


    fun parseRawEmojiSearchSpecsFile(context: Context, path: String): MutableList<DefaultEmojiSearchModel> {


        val emojis = mutableListOf<DefaultEmojiSearchModel>()
        var emojiEditorList: MutableList<DefaultEmojiSearchModel>? = null
        var currentEmojiCategory=""

        fun commitEmojiEditorList() {
//            Log.i("parseRawEmojiSpecsFile","commitEmojiEditorList....")
            emojiEditorList?.let {
                // add only the base emoji for now, ignore the variations
                emojis.add(it.first())
            }
            emojiEditorList = null
        }


        context.assets.open(path).bufferedReader().useLines { lines ->
            for (line in lines) {
//                Log.i("parseRawEmojiSpecsFile","for (line in lines) ....")
                if (line.startsWith("#")) {
                    // Comment line
//                    Log.i("parseRawEmojiSpecsFile","line.startsWith(\"#\") ....")
                } else if (line.startsWith("[")) {
//                    Log.i("parseRawEmojiSpecsFile","line.startsWith(\"[\") ....")
                    commitEmojiEditorList()
                } else if (line.trim().isEmpty()) {
                    // Empty line
//                    Log.i("parseRawEmojiSpecsFile","line.trim().isEmpty() ....")
                    continue
                } else {
                    if (!line.startsWith("\t")) {
//                        Log.i("parseRawEmojiSpecsFile","else !line.startsWith(\"\\t\") ....")
                        commitEmojiEditorList()
                    }

                    // Assume it is a data line
                    val data = line.split(";")
                    if (data.size == 3) {
                        try {
                            val emoji = data[0].trim()

                            if (emojiEditorList != null) {
//                            Log.i("parseRawEmojiSpecsFile","else emojiEditorList != null ....")
                                if(data[1]!=null&&data[1].isNotEmpty()){
                                    val emojiKeyword = data[1].trim().lowercase()
                                    val defData= DefaultEmojiSearchModel(emoji,emojiKeyword)
                                    emojiEditorList!!.add(defData)
                                }

                            } else {
//                            Log.i("parseRawEmojiSpecsFile","else else ....")
                                if(data[1]!=null&&data[1].isNotEmpty()){
                                    val emojiKeyword = data[1].trim().lowercase()
                                    val defData= DefaultEmojiSearchModel(emoji,emojiKeyword)
                                    emojiEditorList = mutableListOf(defData)
                                }

                            }
                        }catch (e:Exception){
                            e.printStackTrace()
                        }

                    }
                }
            }
//            Log.i("parseRawEmojiSpecsFile","for completed ....")
            commitEmojiEditorList()
        }

        return emojis
    }

}