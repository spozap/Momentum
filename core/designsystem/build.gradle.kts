plugins {
    alias(libs.plugins.momentum.android.feature)
    alias(libs.plugins.momentum.android.library.compose)
}

android {
    namespace = "dev.spozap.momentum.core.designsystem"
}

dependencies {
    api(libs.androidx.compose.material3)
}