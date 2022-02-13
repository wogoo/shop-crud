package com.wogoo.shop.shop.controller

import com.wogoo.shop.shop.controller.request.PostProductRequest
import com.wogoo.shop.shop.controller.request.PutProductRequest
import com.wogoo.shop.shop.controller.response.PageResponse
import com.wogoo.shop.shop.controller.response.ProductResponse
import com.wogoo.shop.shop.extension.toPageResponse
import com.wogoo.shop.shop.extension.toProductModel
import com.wogoo.shop.shop.extension.toResponse
import com.wogoo.shop.shop.service.CustomerService
import com.wogoo.shop.shop.service.ProductService
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

import javax.validation.Valid

@RestController
@RequestMapping("products")
class ProductController(
    private val productService: ProductService,
    private val customerService: CustomerService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid request: PostProductRequest) {
        val customer = customerService.findById(request.customerId)
        productService.create(request.toProductModel(customer))
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody product: PutProductRequest) {
        val productSaved = productService.findById(id)
        return productService.update(product.toProductModel(productSaved))
    }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): ProductResponse {
        return productService.findById(id).toResponse()
    }
    @GetMapping
    fun findAll(@PageableDefault(page = 0, size = 10)pageable: Pageable): PageResponse<ProductResponse> {
        return productService.findAll(pageable).map { it.toResponse() }.toPageResponse()
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id:Int) {
        productService.delete(id)
    }
}