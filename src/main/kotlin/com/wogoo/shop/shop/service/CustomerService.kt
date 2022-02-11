package com.wogoo.shop.shop.service

import com.wogoo.shop.shop.model.CustomerModel
import com.wogoo.shop.shop.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) {
    fun findById(id: Int): CustomerModel {
      return customerRepository.findById(id).orElseThrow()
    }
    fun getAll(): List<CustomerModel> {
        return customerRepository.findAll().toList()
    }

    fun update(customer: CustomerModel) {
        customerRepository.save(customer)
    }

    fun delete(id: Int) {
        val customer = findById(id)
        customerRepository.delete(customer)
    }
}
