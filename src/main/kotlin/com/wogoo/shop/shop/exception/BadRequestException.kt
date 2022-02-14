package com.wogoo.shop.shop.exception

class BadRequestException( override val message: String, val errorCode: String): Exception() {

}