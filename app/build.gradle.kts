plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "dev.hyaena_technologies.calculate_engine"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.hyaena_technologies.calculate_engine"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "0.2.0"

        testInstrumentationRunner = "androidx.test.runner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "+"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    ndkVersion = "26.1.10909125"
    buildToolsVersion = "34.0.0"
}

dependencies {
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.animation:animation:1.5.4")
    implementation("androidx.compose.foundation:foundation:1.5.4")
    implementation("androidx.compose.material:material:1.5.4")
    implementation("androidx.compose.material3:material3:1.1.2")
    implementation("androidx.compose.runtime:runtime:1.5.4")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.navigation:navigation-compose:2.7.6")
    implementation("androidx.paging:paging-compose:3.2.1")
    implementation("com.google.android.material:compose-theme-adapter:1.2.1")
    implementation("com.google.android.material:compose-theme-adapter-3:1.1.1")
    implementation(lib.bundles.accompanist)
    implementation(lib.bundles.coroutines)
    implementation(lib.bundles.io)
    implementation(lib.bundles.ktor)
    implementation(lib.bundles.lifecycle)
    implementation(lib.bundles.ui)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.21")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.8.0")
    testImplementation("androidx.compose.ui:ui-test:1.5.4")
    testImplementation("com.google.accompanist:accompanist-testharness:0.33.2-alpha")
    testImplementation("io.ktor:ktor-client-tests:2.3.7")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.21")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
    testImplementation("org.jetbrains.kotlinx:lincheck:2.23")
}