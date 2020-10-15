package com.wilke.jsonpatch.creditnote.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "creditnotes")
data class CreditNote (
        @Column(nullable = false)
        var dateCreated: LocalDateTime = LocalDateTime.now(),
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0
) {



}