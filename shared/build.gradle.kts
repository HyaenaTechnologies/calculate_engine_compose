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
            implementation(projects.common)
        }
    }
}

plugins {
    id("com.android.library")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.multiplatform")
}
