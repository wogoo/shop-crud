package com.wogoo.shop.shop.repository

import com.wogoo.shop.shop.model.ProductModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<ProductModel, Int> {

}
