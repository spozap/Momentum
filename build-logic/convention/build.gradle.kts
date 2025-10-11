plugins {
    `kotlin-dsl`
}

group = "dev.spozap.Momentum.build_logic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = libs.plugins.momentum.android.application.asProvider().get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.AndroidApplicationConventionPlugin"
        }

        register("androidApplicationCompose") {
            id = libs.plugins.momentum.android.application.compose.get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = libs.plugins.momentum.android.library.asProvider().get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.AndroidLibraryConventionPlugin"
        }

        register("androidLibraryCompose") {
            id = libs.plugins.momentum.android.library.compose.get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.AndroidLibraryComposeConventionPlugin"
        }

        register("hilt") {
            id = libs.plugins.momentum.hilt.get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.HiltConventionPlugin"
        }

        register("androidFeature") {
            id = libs.plugins.momentum.android.feature.get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.AndroidFeatureConventionPlugin"
        }

        register("jvmLibrary") {
            id = libs.plugins.momentum.library.jvm.get().pluginId
            implementationClass =
                "dev.spozap.momentum.convention.JvmLibConventionPlugin"
        }

    }
}

dependencies {
    compileOnly(libs.gradle.api)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.android.tools.common)
}