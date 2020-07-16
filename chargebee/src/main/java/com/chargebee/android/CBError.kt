package com.chargebee.android;

internal interface CBError {
    fun toCBError(statusCode: Int): CBErrorDetail
}

data class CBErrorDetail(
    val message: String,
    val type: String? = null,
    val apiErrorCode: String? = null,
    val param: String? = null,
    val httpStatusCode: Int? = null
) : CBError {
    override fun toCBError(statusCode: Int): CBErrorDetail {
        return this
    }
}

internal data class CBInternalErrorWrapper(val errors: Array<CBInternalErrorDetail>): CBError {
    override fun toCBError(statusCode: Int): CBErrorDetail {
        val message = errors.getOrNull(0)?.message ?: ""
        return CBErrorDetail(message, httpStatusCode=statusCode)
    }
}

internal data class CBInternalErrorDetail(val message: String)