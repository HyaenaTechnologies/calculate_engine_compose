import com.android.build.gradle.ProguardFiles.getDefaultProguardFile
import org.jetbrains.compose.ComposePlugin.CommonComponentsDependencies.resources

plugins {
    id("com.android.application")
    id("org.gradle.android.cache-fix")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.android")
}

android {
    buildFeatures {
        buildConfig = true
        compose = true
    }

    buildToolsVersion = "34.0.0"

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

    compileSdk = 34

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.11"
    }

    defaultConfig {
        applicationId = "dev.hyaena_technologies.calculate_engine"
        minSdk = 21
        targetSdk = 34
        testInstrumentationRunner = "androidx.test.runner"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    namespace = "dev.hyaena_technologies.calculate_engine"

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    ndkVersion = "26.2.11394342"
}

val androidx_compose: String = "1.6.3"
val androidx_lifecycle: String = "2.7.0"
val com_google_accompanist: String = "0.35.0-alpha"
val io_ktor: String = "2.3.9"
val jetbrains_kotlin: String = "1.9.23"
val org_jetbrains_kotlinx_coroutines: String = "1.8.0"
val org_jetbrains_kotlinx_io: String = "0.3.2"

dependencies {
    // Android
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.animation:animation:$androidx_compose")
    implementation("androidx.compose.compiler:compiler:1.5.11")
    implementation("androidx.compose.foundation:foundation:$androidx_compose")
    implementation("androidx.compose.material:material:$androidx_compose")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.runtime:runtime:$androidx_compose")
    implementation("androidx.compose.ui:ui:$androidx_compose")
    implementation("androidx.compose.ui:ui-tooling-preview:$androidx_compose")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:$androidx_lifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$androidx_lifecycle")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.paging:paging-compose:3.2.1")
    implementation("com.google.accompanist:accompanist-adaptive:$com_google_accompanist")
    implementation("com.google.accompanist:accompanist-drawablepainter:$com_google_accompanist")
    implementation("com.google.accompanist:accompanist-navigation-material:$com_google_accompanist")
    implementation("com.google.accompanist:accompanist-permissions:$com_google_accompanist")
    implementation("com.google.android.material:compose-theme-adapter:1.2.1")
    implementation("com.google.android.material:compose-theme-adapter-3:1.1.1")
    implementation("com.google.android.material:compose-theme-adapter-core:1.0.1")
    // KTOR
    implementation("io.ktor:ktor-client-auth:$io_ktor")
    implementation("io.ktor:ktor-client-core:$io_ktor")
    implementation("io.ktor:ktor-client-cio:$io_ktor")
    implementation("io.ktor:ktor-client-content-negotiation:$io_ktor")
    implementation("io.ktor:ktor-client-encoding:$io_ktor")
    implementation("io.ktor:ktor-client-json:$io_ktor")
    implementation("io.ktor:ktor-client-logging:$io_ktor")
    implementation("io.ktor:ktor-client-resources:$io_ktor")
    implementation("io.ktor:ktor-client-serialization:$io_ktor")
    implementation("io.ktor:ktor-events:$io_ktor")
    implementation("io.ktor:ktor-http:$io_ktor")
    implementation("io.ktor:ktor-http-cio:$io_ktor")
    implementation("io.ktor:ktor-io:$io_ktor")
    implementation("io.ktor:ktor-network:$io_ktor")
    implementation("io.ktor:ktor-network-tls:$io_ktor")
    implementation("io.ktor:ktor-network-tls-certificates:$io_ktor")
    implementation("io.ktor:ktor-resources:$io_ktor")
    implementation("io.ktor:ktor-serialization:$io_ktor")
    implementation("io.ktor:ktor-serialization-kotlinx:$io_ktor")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$io_ktor")
    implementation("io.ktor:ktor-utils:$io_ktor")
    implementation("io.ktor:ktor-websockets:$io_ktor")
    implementation("io.ktor:ktor-websocket-serialization:$io_ktor")
    // JetBrains
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$jetbrains_kotlin")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$org_jetbrains_kotlinx_coroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$org_jetbrains_kotlinx_coroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-io-bytestring:$org_jetbrains_kotlinx_io")
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:$org_jetbrains_kotlinx_io")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$androidx_compose")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$androidx_compose")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:$androidx_compose")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.9.0")
    // Tests
    testImplementation("androidx.compose.ui:ui-test:$androidx_compose")
    testImplementation("com.google.accompanist:accompanist-testharness:$com_google_accompanist")
    testImplementation("io.ktor:ktor-client-tests:$io_ktor")
    testImplementation("io.ktor:ktor-client-content-negotiation-tests:$io_ktor")
    testImplementation("io.ktor:ktor-serialization-tests:$io_ktor")
    testImplementation("io.ktor:ktor-serialization-kotlinx-tests:$io_ktor")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$jetbrains_kotlin")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$org_jetbrains_kotlinx_coroutines")
    testImplementation("org.jetbrains.kotlinx:lincheck:2.28.1")
}