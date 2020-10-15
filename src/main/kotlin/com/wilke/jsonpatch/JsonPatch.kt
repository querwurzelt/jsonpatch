package com.wilke.jsonpatch

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class JsonPatch

fun main(args: Array<String>) {
    SpringApplication.run(JsonPatch::class.java, *args)
}