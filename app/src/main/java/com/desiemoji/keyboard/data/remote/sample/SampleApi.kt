package com.desiemoji.keyboard.data.remote.sample

import android.content.Context
import com.desiemoji.keyboard.common.base.BaseResponseModel
import com.desiemoji.keyboard.data.remote.ApiService
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET


interface SampleApi {

    // TODO : Add your code here

    @GET("api/v1/sample/data.json")
    fun getSample() : Observable<BaseResponseModel<List<SampleResponse>>>

    class Creator {
        fun newInstance(context: Context, baseUrl: String): SampleApi {
            return ApiService.create(context, baseUrl)
        }
    }

}