import org.jetbrains.compose.ExperimentalComposeLibrary
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

        }
        commonMain.dependencies {
            @OptIn(ExperimentalComposeLibrary::class)
            implementation(projects.shared)
        }
        desktopMain.dependencies {
            implementation("org.jetbrains.compose.desktop:desktop:1.5.11")
        }
    }
}

plugins {
    id("com.android.application")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.multiplatform")
}