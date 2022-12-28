package com.mercadolivro.controller.request

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.validation.EmailAvailable
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty

data class PostCustomerRequest(
    @field:NotEmpty(message = "Nome deve ser informado")
    var name: String,

    @field:Email(message = "E-mail em uso")
    @EmailAvailable
    var email: String)