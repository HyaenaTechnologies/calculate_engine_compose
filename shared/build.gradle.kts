import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

android {
    buildToolsVersion = "34.0.0"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    compileSdk = 34

    defaultConfig {
        minSdk = 21
        testOptions.targetSdk = 34
    }

    namespace = "dev.hyaena_technologies.shared"
    ndkVersion = "26.1.10909125"
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    jvm()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
       browser()
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation("androidx.activity:activity-compose:1.8.2")
            implementation("androidx.compose.animation:animation:1.5.4")
            implementation("androidx.compose.foundation:foundation:1.5.4")
            implementation("androidx.compose.material:material:1.5.4")
            implementation("androidx.compose.material3:material3:1.1.2")
            implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
            implementation("androidx.core:core-ktx:1.12.0")
            implementation("androidx.navigation:navigation-compose:2.7.6")
            implementation("androidx.paging:paging-compose:3.2.1")
            implementation("com.google.android.material:compose-theme-adapter:1.2.1")
            implementation("com.google.android.material:compose-theme-adapter-3:1.1.1")
            implementation(lib.bundles.accompanist)
            implementation(lib.bundles.coroutines)
            implementation(lib.bundles.io)
            implementation(lib.bundles.lifecycle)
            implementation(lib.bundles.ui)
            implementation("org.jetbrains.compose.html:html-core:1.5.11")
            implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.21")
            implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
            implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.8.0")
            runtimeOnly("androidx.compose.runtime:runtime:1.5.4")
            runtimeOnly("org.jetbrains.compose.animation:animation:1.5.11")
            runtimeOnly("org.jetbrains.compose.foundation:foundation:1.5.11")
            runtimeOnly("org.jetbrains.compose.material:material:1.5.11")
            runtimeOnly("org.jetbrains.compose.material3:material3:1.5.11")
            runtimeOnly("org.jetbrains.compose.ui:ui:1.5.11")
            implementation("androidx.compose.ui:ui-test:1.5.4")
            implementation("com.google.accompanist:accompanist-testharness:0.33.2-alpha")
            implementation("org.jetbrains.kotlin:kotlin-test:1.9.21")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
            implementation("org.jetbrains.kotlinx:lincheck:2.23")
        }
    }
}

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform")
}
