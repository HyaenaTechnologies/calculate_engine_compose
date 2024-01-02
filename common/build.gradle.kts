import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

android {
    buildFeatures {
        compose = true
    }

    buildToolsVersion = "34.0.0"

    buildTypes {
        getByName("release") {
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

    compileSdk = 34

    composeOptions {
        kotlinCompilerExtensionVersion = "+"
    }

    defaultConfig {
        applicationId = "dev.hyaena_technologies"
        minSdk = 21
        targetSdk = 34

        testInstrumentationRunner = "androidx.test.runner"
        vectorDrawables {
            useSupportLibrary = true
        }

        versionCode = 1
        versionName = "0.2.0"
    }

    dependencies {
        implementation(projects.common)
    }

    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }

    namespace = "dev.hyaena_technologies"
    ndkVersion = "26.1.10909125"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            packageName = "dev.hyaena_technologies"
            packageVersion = "1.0.0"
            targetFormats(
                TargetFormat.AppImage,
                TargetFormat.Deb,
                TargetFormat.Dmg,
                TargetFormat.Exe,
                TargetFormat.Msi,
                TargetFormat.Pkg,
                TargetFormat.Rpm,
            )
        }
    }
}

compose.experimental {
    web.application {}
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }

    jvm("desktop")

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        moduleName = "CalculateEngine"
        browser {
            commonWebpackConfig {
                outputFileName = "calculate_engine.js"
            }
        }
        binaries.executable()
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "CalculateEngine"
            isStatic = true
        }
    }

    sourceSets {
        val desktopMain by getting

        androidMain.dependencies {
            implementation(projects.common)
        }
        commonMain.dependencies {
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
            implementation("org.jetbrains.compose.animation:animation:1.5.11")
            implementation("org.jetbrains.compose.desktop:desktop:1.5.11")
            implementation("org.jetbrains.compose.foundation:foundation:1.5.11")
            implementation("org.jetbrains.compose.html:html-core:1.5.11")
            implementation("org.jetbrains.compose.material:material:1.5.11")
            implementation("org.jetbrains.compose.material3:material3:1.5.11")
            implementation("org.jetbrains.compose.ui:ui:1.5.11")
            implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.21")
            implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
            implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.2")
            implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.8.0")
            implementation("androidx.compose.ui:ui-test:1.5.4")
            implementation("com.google.accompanist:accompanist-testharness:0.33.2-alpha")
            implementation("io.ktor:ktor-client-tests:2.3.7")
            implementation("org.jetbrains.kotlin:kotlin-test:1.9.21")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.7.3")
            implementation("org.jetbrains.kotlinx:lincheck:2.23")
        }
        desktopMain.dependencies {
            implementation(projects.common)
        }
        iosMain.dependencies {
            implementation(projects.common)
        }
    }
}

plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.multiplatform")
}
