package com.wogoo.shop.shop.exception

class NotFoundException(override val message: String, val errorCode: String): Exception() {

}