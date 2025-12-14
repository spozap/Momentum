pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Momentum"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":app")


include(":core:designsystem")
include(":core:ui")
include(":core:model")
include(":feature:home")
include(":feature:onboarding")
include(":core:data")
include(":core:database")
