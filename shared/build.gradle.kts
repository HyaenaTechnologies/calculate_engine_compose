import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
       browser()
    }

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
    
    sourceSets {
        commonMain.dependencies {
            implementation(lib.bundles.coroutines)
            implementation(lib.bundles.io)
            implementation("org.jetbrains.compose.html:html-core:1.5.11")
            implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.21")
            implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
            implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.8.0")
            runtimeOnly("org.jetbrains.compose.animation:animation:1.5.11")
            runtimeOnly("org.jetbrains.compose.foundation:foundation:1.5.11")
            runtimeOnly("org.jetbrains.compose.material:material:1.5.11")
            runtimeOnly("org.jetbrains.compose.material3:material3:1.5.11")
            runtimeOnly("org.jetbrains.compose.ui:ui:1.5.11")
            implementation("org.jetbrains.kotlin:kotlin-test:1.9.21")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
            implementation("org.jetbrains.kotlinx:lincheck:2.23")
        }
    }
}

android {
    namespace = "dev.hyaena_technologies.shared"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
        testOptions.targetSdk = 34
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildToolsVersion = "34.0.0"
    ndkVersion = "26.1.10909125"
}
