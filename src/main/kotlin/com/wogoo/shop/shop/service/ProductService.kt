package com.wogoo.shop.shop.service

import com.wogoo.shop.shop.model.ProductModel
import com.wogoo.shop.shop.repository.ProductRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service



@Service
class ProductService(private val productRepository: ProductRepository) {
    fun create(product: ProductModel) {
        productRepository.save(product)
    }

    fun findById(id: Int): ProductModel {
        return productRepository.findById(id).orElseThrow()
    }

    fun findAll(pageable: Pageable): Page<ProductModel> {
        return productRepository.findAll(pageable)
    }

    fun delete(id: Int) {
        val product = findById(id)
        productRepository.delete(product)
    }

    fun update(product: ProductModel) {
        productRepository.save(product)
    }

}
