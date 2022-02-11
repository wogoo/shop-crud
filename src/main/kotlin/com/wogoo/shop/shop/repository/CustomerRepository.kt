package com.wogoo.shop.shop.repository

import com.wogoo.shop.shop.model.CustomerModel
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<CustomerModel, Int> {

}
