package dev.spozap.momentum.convention

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.apply

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            apply(plugin = "dev.spozap.momentum.library")
            apply(plugin = "dev.spozap.momentum.hilt")
        }
    }
}