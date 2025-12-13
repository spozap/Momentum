plugins {
    alias(libs.plugins.momentum.android.feature)
    alias(libs.plugins.momentum.android.library.compose)
}

android {
    namespace = "dev.spozap.momentum.feature.onboarding"
}

dependencies {
    androidTestImplementation(libs.bundles.androidx.compose.ui.test)
}