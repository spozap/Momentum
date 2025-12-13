plugins {
    alias(libs.plugins.momentum.android.library)
    alias(libs.plugins.momentum.android.library.compose)
}

android {
    namespace = "dev.spozap.momentum.core.ui"

}

dependencies {
    api(projects.core.designsystem)
    api(projects.core.model)
}