package com.wilke.jsonpatch.web

import org.slf4j.LoggerFactory
import org.springframework.data.rest.webmvc.json.patch.PatchException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class WebErrorHandler {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @ExceptionHandler(PatchException::class)
    @ResponseStatus(HttpStatus.CONFLICT)
    fun handlePatchException(e: PatchException) {
        log.debug("Patch failed", e)
    }

}
