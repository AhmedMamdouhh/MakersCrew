plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    kotlin(Plugins.KOTLIN_KAPT)
    id(Plugins.HILT_LIBRARY)

}

android {
    namespace = "com.example.makerscrew"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.makerscrew"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    Dependencies.uiDependencies.forEach { implementation(it) }
    Dependencies.composeDependency.forEach { implementation(it) }
    Dependencies.junitDependency.forEach { testImplementation(it) }
    Dependencies.androidTestDependencies.forEach { androidTestImplementation(it) }
    implementation(libs.androidx.activity)
    implementation(platform(Dependencies.composePlatformBom))
    androidTestImplementation(platform(Dependencies.composePlatformBomAndroidTest))
    //retrofit
    Dependencies.retrofitDependencies.forEach { implementation(it) }
    //Coroutine
    implementation(Dependencies.coroutinesDependency)
    //Navigation
    Dependencies.navigationDependencies.forEach { implementation(it) }
    //Hilt
    kapt(Dependencies.hiltCompiler)
    kapt (libs.hilt.android.compiler)
    implementation(Dependencies.hiltDependency)
    //retrofit
    Dependencies.retrofitDependencies.forEach { implementation(it) }
    //Room
    Dependencies.roomDependencies.forEach { implementation(it) }
    kapt(Dependencies.roomCompiler)

}