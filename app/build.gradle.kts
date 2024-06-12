import com.zachnr.tandain.convention.TandainBuildTypes

plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.jetbrains.kotlin.android)
//    alias(libs.plugins.ksp)
    alias(libs.plugins.tandain.android.application)
    alias(libs.plugins.tandain.android.application.compose)
    alias(libs.plugins.tandain.android.application.flavors)
}

android {
    namespace = "com.zachnr.tandain"

    defaultConfig {
        applicationId = "com.zachnr.tandain"
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }

    buildTypes {

        debug {
            applicationIdSuffix = TandainBuildTypes.DEBUG.applicationIdSuffix
        }


        release {
            isMinifyEnabled = false
            applicationIdSuffix = TandainBuildTypes.RELEASE.applicationIdSuffix
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {

    implementation(projects.core.uiresources)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.navigation.compose)
    debugImplementation(libs.androidx.compose.ui.testManifest)


    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
//    annotationProcessor(libs.androidx.room.compiler)
//    implementation(libs.androidx.room.ktx)
//    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.com.airbnb.android.lottie)
    implementation(libs.com.facebook.shimmer)
    implementation(libs.com.github.bumptech.glide)
    debugImplementation(libs.com.github.chuckerteam.chucker.library)
    releaseImplementation(libs.com.github.chuckerteam.chucker.library.no.op)
    implementation(libs.io.insert.koin.android)
    implementation(libs.io.insert.koin.core)

}