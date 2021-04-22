package com.example

import io.micrometer.core.instrument.Tag
import io.micrometer.core.instrument.config.MeterFilter
import javax.enterprise.inject.Produces
import javax.inject.Singleton

@Singleton
class MeterConfiguration(val globalTagsProperties: GlobalTagsProperties) {

    companion object {
        val applicationNameTagName = "applicationName"
        val envFoundationTagName = "env-foundation"
        val instanceTagName = "instance"
    }
    @Produces
    @Singleton
    fun configureGlobalTags(): MeterFilter {
        return MeterFilter.commonTags(
            listOf(
                Tag.of(
                    applicationNameTagName,
                    globalTagsProperties.applicationName
                ),
                Tag.of(
                    envFoundationTagName,
                    globalTagsProperties.envFoundation
                ),
                Tag.of(
                    instanceTagName,
                    globalTagsProperties.instance
                )
            )
        )
    }
}
