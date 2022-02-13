package com.wogoo.shop.shop.controller.response

import com.wogoo.shop.shop.model.CustomerModel


data class ProductResponse (
    var id: Int? = null,
    var productName: String,
    var productDesc: String,
    var productLink: String,
    var customer: CustomerModel? = null
        )
