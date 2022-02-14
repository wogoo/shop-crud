package com.wogoo.shop.shop.enums

enum class Errors(val code: String, val message: String) {
    SP0001("SP-0001", "Acess Denied"),
    SP1001("SP-1001","Invalid Request"),
    SP2001("SP-2001", "Product [%s] not exist"),
    SP2002("SP-2101", "Cannot update product with status [%s]"),
    SP3001("SP-3001", "Customer [%s] not exist")
}