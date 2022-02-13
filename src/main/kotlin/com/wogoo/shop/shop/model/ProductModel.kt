package com.wogoo.shop.shop.model


import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity(name = "products")
data class ProductModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "product_name")
    var productName: String,

    @Column(name = "product_desc")
    var productDesc: String,

    @Column(name = "product_link")
    var productLink: String,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: CustomerModel? = null
        ) {

}
