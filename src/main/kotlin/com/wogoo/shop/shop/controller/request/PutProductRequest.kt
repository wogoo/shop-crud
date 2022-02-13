package com.wogoo.shop.shop.controller.request

data class PutProductRequest (
    val productName: String,
    var productDesc: String,
    var productLink: String
        )