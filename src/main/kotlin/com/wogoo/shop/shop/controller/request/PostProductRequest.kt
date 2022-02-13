package com.wogoo.shop.shop.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Positive

data class PostProductRequest(
    @JsonAlias("product_name")
    @field:NotEmpty(message = "Nome deve ser informado")
    var productName: String,
    @JsonAlias("product_link")
    @field:NotEmpty(message = "O link deve ser informado")
    var productLink: String,
    @JsonAlias("product_desc")
    @field:NotEmpty(message = "A descrição deve ser informada")
    var productDesc: String,
    @field:NotNull
    @field:Positive
    @JsonAlias("customer_id")
    var customerId: Int
)
