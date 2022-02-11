package com.wogoo.shop.shop.extension

import com.wogoo.shop.shop.controller.request.PostCustomerRequest
import com.wogoo.shop.shop.controller.request.PutCustomerRequest
import com.wogoo.shop.shop.controller.request.response.CustomerResponse
import com.wogoo.shop.shop.model.CustomerModel

fun CustomerModel.toResponse(): CustomerResponse {
    return CustomerResponse(
        id = this.id,
        name = this.name,
        email = this.email
    )
}
fun PostCustomerRequest.toPersonModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email, zip = this.zip)
}

fun PutCustomerRequest.toPersonModel(previousCustomer: CustomerModel): CustomerModel{
    return CustomerModel(id = previousCustomer.id, name = this.name,  zip = this.zip, email = previousCustomer.email)
}