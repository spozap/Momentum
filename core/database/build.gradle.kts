plugins {
    alias(libs.plugins.momentum.android.library)
    alias(libs.plugins.momentum.room)
    alias(libs.plugins.momentum.hilt)
}

android {
    namespace = "dev.spozap.momentum.database"
}

dependencies {
    api(projects.core.model)
}