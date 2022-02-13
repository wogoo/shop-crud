package com.wogoo.shop.shop.controller

import com.wogoo.shop.shop.controller.request.PostCustomerRequest
import com.wogoo.shop.shop.controller.request.PutCustomerRequest
import com.wogoo.shop.shop.controller.request.response.CustomerResponse
import com.wogoo.shop.shop.extension.toCustomerModel
import com.wogoo.shop.shop.extension.toResponse
import com.wogoo.shop.shop.repository.CustomerRepository
import com.wogoo.shop.shop.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")
@CrossOrigin("*")
class CustomerController(private val customerService: CustomerService, private val customerRepository: CustomerRepository) {

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getPerson(@PathVariable id: Int): CustomerResponse {
        return customerService.findById(id).toResponse()
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    fun getAll():List<CustomerResponse> {
        return customerService.getAll().map {it.toResponse()}
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        customerRepository.save(customer.toCustomerModel())
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest) {
        val customerSaved = customerService.findById(id)
        return customerService.update(customer.toCustomerModel(customerSaved))
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id:Int) {
        customerService.delete(id)
    }

}