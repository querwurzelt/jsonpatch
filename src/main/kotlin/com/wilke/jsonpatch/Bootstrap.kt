package com.wilke.jsonpatch

import com.wilke.jsonpatch.creditnote.domain.CreditNote
import com.wilke.jsonpatch.creditnote.domain.CreditNoteRepository
import com.wilke.jsonpatch.vendor.domain.Vendor
import com.wilke.jsonpatch.vendor.domain.VendorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
private class Bootstrap @Autowired constructor(
        private val vendorRepository: VendorRepository,
        private val creditNoteRepository: CreditNoteRepository
) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        for (count in 1..9) {
            val vendor = Vendor("Vendor${count}", "${count}4711")
            vendorRepository.save(vendor)
        }

        creditNoteRepository.save(CreditNote())

        println("Bootstrap complete")
    }
}