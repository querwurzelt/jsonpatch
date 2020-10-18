package com.wilke.jsonpatch.web

import com.wilke.jsonpatch.vendor.domain.Vendor
import com.wilke.jsonpatch.vendor.domain.VendorValidator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.http.HttpMethod

@Configuration
class RestConfig : RepositoryRestConfigurer {

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        super.configureRepositoryRestConfiguration(config)

        config
                .exposureConfiguration
                .forDomainType(Vendor::class.java)
                // deny deletion
                .withItemExposure { _, httpMethods -> httpMethods.disable(HttpMethod.DELETE) }
    }

    override fun configureValidatingRepositoryEventListener(validatingListener: ValidatingRepositoryEventListener) {
        super.configureValidatingRepositoryEventListener(validatingListener)

        validatingListener.addValidator("beforeCreate", vendorValidator())
        validatingListener.addValidator("beforeSave", vendorValidator())
    }

    protected fun vendorValidator(): VendorValidator {
        return VendorValidator()
    }

}
