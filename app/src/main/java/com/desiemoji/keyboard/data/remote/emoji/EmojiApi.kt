package com.desiemoji.keyboard.data.remote.emoji

import android.content.Context
import com.desiemoji.keyboard.data.remote.ApiService
import com.desiemoji.keyboard.util.Utils
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface EmojiApi {
        @Headers("Content-Type: application/json")
        @POST("categories/getall/date")
        fun getAllCategory(@Body reqData: CommonRequestData) : Observable<CategoryResponse>

        @POST("subcategories/getall/date")
        fun getAllSubCategory(@Body reqData: CommonRequestData) : Observable<SubCategoryResponse>

        @POST("emojis/getall/date")
        fun getAllEmoji(@Body reqData: CommonRequestData) : Observable<EmojiResponse>

        class Creator {
            fun newInstance(context: Context): EmojiApi {
                return ApiService.create(context, Utils.BASE_URL)
            }
        }

}