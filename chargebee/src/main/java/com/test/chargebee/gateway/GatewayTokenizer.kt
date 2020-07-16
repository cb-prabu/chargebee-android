package com.test.chargebee.gateway

import com.test.chargebee.models.CBGatewayDetail
import com.test.chargebee.models.CBPaymentDetail
import com.test.chargebee.resources.StripeResource

internal class GatewayTokenizer {
    internal suspend fun createToken(detail: CBPaymentDetail, paymentConfig: CBGatewayDetail): String {
        val createToken = StripeResource()
            .createToken(detail, paymentConfig)
        return createToken.getData().id
    }
}