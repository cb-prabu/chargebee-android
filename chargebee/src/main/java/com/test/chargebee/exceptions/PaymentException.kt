package com.test.chargebee.exceptions

import com.test.chargebee.CBErrorDetail

class PaymentException(error: CBErrorDetail) : CBException(error) {

}