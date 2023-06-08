package com.desiemoji.keyboard.services.worker

import android.content.Context
import android.graphics.Bitmap
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.desiemoji.keyboard.data.local.category.CategoryEntity
import com.desiemoji.keyboard.data.remote.emoji.CategoryResponse
import com.desiemoji.keyboard.data.remote.emoji.CommonRequestData
import com.desiemoji.keyboard.data.remote.emoji.Datum
import com.desiemoji.keyboard.data.remote.emoji.EmojiApi
import com.desiemoji.keyboard.util.Constant
import com.desiemoji.keyboard.util.Constant.LAST_SYNC_TIME
import com.desiemoji.keyboard.util.Constant.REQUEST_TIME
import com.desiemoji.keyboard.util.Utils
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.Executors

class CategoryDownloadWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {
    private lateinit var myCompositeDisposable: CompositeDisposable
    private lateinit var emojiAPI: EmojiApi
    @RequiresApi(Build.VERSION_CODES.M)
    override fun doWork(): Result {
//        val appContext = applicationContext
//
//        val requestTime = inputData.getString(REQUEST_TIME)
//        val lastSyncTime = inputData.getString(LAST_SYNC_TIME)
//
//        return try {
//
//            myCompositeDisposable = CompositeDisposable()
//            emojiAPI=EmojiApi.Creator().newInstance(applicationContext)
//            getAllCategoryFromAPI(lastSyncTime!!)
//
//            Result.success(outputData)
//        } catch (throwable: Throwable) {
//            throwable.printStackTrace()
//            Result.failure()
//        }

      return  Result.success()
    }


//    @RequiresApi(Build.VERSION_CODES.M)
//    fun getAllCategoryFromAPI(lastSyncTime:String){
//
//        GlobalScope.launch {
//            val dateTime=lastSyncTime;
//            val reqData= CommonRequestData(dateTime)
//            myCompositeDisposable.add(
//                emojiAPI.getAllCategory(reqData)
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribeOn(Schedulers.io())
//                    .subscribe({response -> onCategoryResponse(response)}, {t -> onCategoryFailure(t) }))
//        }
//
//
//    }
//
//    private fun onCategoryFailure(t: Throwable) {
//        Log.i("getAllCategoryFromAPI","onFailure "+t.message)
//        Toast.makeText(context,t.message, Toast.LENGTH_SHORT).show()
//    }
//
//    @RequiresApi(Build.VERSION_CODES.M)
//    private fun onCategoryResponse(response: CategoryResponse) {
//        if(response!=null&&!response.error){
//            Log.i("getAllCategoryFromAPI","response!=null&&!response.error........")
////                        Log.i("getAllCategoryFromAPI","result body ........"+response.toJson())
//            Log.i("getAllCategoryFromAPI","Category List Size : "+response.data.size)
//            val listCategory=response.data;
//            val myExecutor = Executors.newSingleThreadExecutor()
//            myExecutor.execute {
//                for(dd in listCategory){
//                    writeCategoryToLocal(dd)
//                    Log.i("getAllCategoryFromAPI","Category List Data : "+dd.categoryID+" "+dd.categoryName)
//                }
//
//                getAllSubCategoryFromAPI(lastSyncTime)
//
//                viewModel.getAllCategoryList {
//                    val myHandler = Handler(Looper.getMainLooper())
//                    myHandler.post {
//                        combineCategoryTabModels(it)
//                    }
//                }
//            }
//
//
//
//
//        }else{
//            Log.i("getAllCategoryFromAPI","else.. response!=null&&!response.error........")
//        }
//    }
//
//    fun writeCategoryToLocal(cr: Datum){
//
//        if(cr.categoryIcon!=null&&cr.categoryIcon.isNotEmpty()){
//            val url= Utils.BASE_URL +cr.categoryIcon
//            var mImage = downloadImage(url)
//            if(mImage!=null){
//                //Write To Files Directory
//                val fDir = File(context.filesDir.absolutePath+"/"+ Constant.FILE_PATH_CATEGORY)
//                if(!fDir.exists()){
//                    fDir.mkdirs();
//                }
//
//                val fileName=cr.categoryID.toString()+".png"
//
//                val f = File(fDir.absolutePath, fileName)
//
//                val bytes = ByteArrayOutputStream()
//                mImage.compress(Bitmap.CompressFormat.PNG, 100, bytes)
//                f.createNewFile()
//
//                // write the bytes in file
//                val fo = FileOutputStream(f)
//                fo.write(bytes.toByteArray())
//                // remember close de FileOutput
//                fo.close()
//
//                Log.i("writeCategoryToLocal","writeCategoryToLocal At : "+f.absolutePath)
//                viewModel.getCategoryByCategoryId(cr.categoryID){
//
//                    if(it!=null&&it.categoryId.toLong()==cr.categoryID){
//                        //Update
//                        val ce= CategoryEntity(it.tableId,cr.categoryID.toInt(),cr.categoryName,cr.categoryIcon,f.absolutePath,cr.createdAt,cr.updatedAt,cr.active)
//                        viewModel.updateCategory(ce)
//                    }else{
//                        //Insert
//                        val ce= CategoryEntity(0,cr.categoryID.toInt(),cr.categoryName,cr.categoryIcon,f.absolutePath,cr.createdAt,cr.updatedAt,cr.active)
//                        viewModel.insertCategory(ce)
//                    }
//                }
//            }
//
//        }
//    }



}