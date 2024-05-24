plugins {
    alias(libs.plugins.tandain.android.library)
}

android {
    namespace = "com.zachnr.tandain.routefinder"
}

dependencies {
    implementation(projects.core.uiresources)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}