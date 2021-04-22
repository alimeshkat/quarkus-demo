package com.example

import io.quarkus.arc.config.ConfigProperties

@ConfigProperties(prefix = "global")
class GlobalTagsProperties {
    lateinit var applicationName: String
    lateinit var envFoundation: String
    lateinit var instance: String
}
