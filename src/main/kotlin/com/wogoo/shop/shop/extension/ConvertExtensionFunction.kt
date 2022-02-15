package com.wogoo.shop.shop.extension

import com.wogoo.shop.shop.controller.request.PostCustomerRequest
import com.wogoo.shop.shop.controller.request.PostProductRequest
import com.wogoo.shop.shop.controller.request.PutCustomerRequest
import com.wogoo.shop.shop.controller.request.PutProductRequest
import com.wogoo.shop.shop.controller.response.CustomerResponse
import com.wogoo.shop.shop.controller.response.PageResponse
import com.wogoo.shop.shop.controller.response.ProductResponse
import com.wogoo.shop.shop.model.CustomerModel
import com.wogoo.shop.shop.model.ProductModel
import org.springframework.data.domain.Page

fun CustomerModel.toResponse(): CustomerResponse {
    return CustomerResponse(
        id = this.id,
        name = this.name,
        email = this.email
    )
}
fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email, zip = this.zip)
}

fun PutCustomerRequest.toCustomerModel(previousCustomer: CustomerModel): CustomerModel{
    return CustomerModel(id = previousCustomer.id, name = this.name,  zip = this.zip, email = previousCustomer.email)
}

fun PostProductRequest.toProductModel(customer: CustomerModel): ProductModel {
    return ProductModel(
        productName = this.productName,
        productDesc = this.productDesc,
        productLink = this.productLink,
        customer = customer
    )
}

fun ProductModel.toResponse(): ProductResponse {
    return ProductResponse(
        id = this.id,
        productName = this.productName,
        productDesc = this.productDesc,
        productLink = this.productLink,
        customer = this.customer
    )
}

fun PutProductRequest.toProductModel(previousProduct: ProductModel): ProductModel {
    return ProductModel(id = previousProduct.id, productName = this.productName, productDesc = this.productDesc,
        productLink = this.productLink, createdAt = previousProduct.createdAt, customer = previousProduct.customer)
}

fun <T> Page<T>.toPageResponse(): PageResponse<T> {
    return PageResponse(this.content, this.number, this.totalElements, this.totalPages  )
}