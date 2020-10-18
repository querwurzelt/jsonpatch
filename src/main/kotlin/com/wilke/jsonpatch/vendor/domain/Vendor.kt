package com.wilke.jsonpatch.vendor.domain

import javax.persistence.*

@Entity
@Table(name = "vendors")
data class Vendor (
        @Column(nullable = false)
        var companyName: String,
        @Column(nullable = false)
        var taxNumber: String,
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0
)