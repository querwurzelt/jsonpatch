package com.wilke.jsonpatch.vendor.domain

import org.springframework.validation.Errors
import org.springframework.validation.ValidationUtils
import org.springframework.validation.Validator

class VendorValidator : Validator {

    override fun validate(instance: Any, errors: Errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyName", "javax.validation.constraints.NotBlank.message", "Must not be blank")
    }

    override fun supports(clazz: Class<*>): Boolean {
        return Vendor::class.java.isAssignableFrom(clazz)
    }

}