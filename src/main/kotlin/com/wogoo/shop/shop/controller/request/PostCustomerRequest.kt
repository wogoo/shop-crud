package com.wogoo.shop.shop.controller.request

import com.wogoo.shop.shop.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

data class PostCustomerRequest (
    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,
    @field:Email(message = "Email deve ser válido ")
    @EmailAvailable
    var email: String,
    @field:NotEmpty(message = "O rg deve ser informado")
    @Size(max = 9)
    var zip: String
        )
