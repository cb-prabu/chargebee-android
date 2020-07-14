package com.test.chargebee.service

import com.test.chargebee.CBEnvironment
import com.test.chargebee.models.CBMerchantPaymentConfig
import com.test.chargebee.models.PlanWrapper
import okhttp3.Credentials
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path

interface TokenService {

    @Headers("X-Requested-With: XMLHttpRequest")
    @GET("internal/component/retrieve_config")
    fun retrieveConfig(
        @Header("Authorization") token: String = "Basic ${CBEnvironment.apiKey}"
    ): Call<CBMerchantPaymentConfig?>?
}