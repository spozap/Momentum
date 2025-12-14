plugins {
    alias(libs.plugins.momentum.android.library)
    alias(libs.plugins.momentum.hilt)
}

android {
    namespace = "dev.spozap.momentum.data"
}

dependencies {
    api(projects.core.database)
}