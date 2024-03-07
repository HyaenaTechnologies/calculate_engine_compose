plugins {
    id("com.android.application")
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
        kotlinCompilerExtensionVersion = "1.5.10"
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

dependencies {
    // Android
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.animation:animation:1.6.3")
    implementation("androidx.compose.compiler:compiler:1.5.10")
    implementation("androidx.compose.foundation:foundation:1.6.3")
    implementation("androidx.compose.material:material:1.6.3")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.runtime:runtime:1.6.3")
    implementation("androidx.compose.ui:ui:1.6.3")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.3")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.paging:paging-compose:3.2.1")
    implementation("com.google.accompanist:accompanist-adaptive:0.35.0-alpha")
    implementation("com.google.accompanist:accompanist-drawablepainter:0.35.0-alpha")
    implementation("com.google.accompanist:accompanist-navigation-material:0.35.0-alpha")
    implementation("com.google.accompanist:accompanist-permissions:0.35.0-alpha")
    implementation("com.google.android.material:compose-theme-adapter:1.2.1")
    implementation("com.google.android.material:compose-theme-adapter-3:1.1.1")
    implementation("com.google.android.material:compose-theme-adapter-core:1.0.1")
    // KTOR
    implementation("io.ktor:ktor-client-auth:2.3.9")
    implementation("io.ktor:ktor-client-core:2.3.9")
    implementation("io.ktor:ktor-client-cio:2.3.9")
    implementation("io.ktor:ktor-client-content-negotiation:2.3.9")
    implementation("io.ktor:ktor-client-encoding:2.3.9")
    implementation("io.ktor:ktor-client-json:2.3.9")
    implementation("io.ktor:ktor-client-logging:2.3.9")
    implementation("io.ktor:ktor-client-resources:2.3.9")
    implementation("io.ktor:ktor-client-serialization:2.3.9")
    implementation("io.ktor:ktor-events:2.3.9")
    implementation("io.ktor:ktor-http:2.3.9")
    implementation("io.ktor:ktor-http-cio:2.3.9")
    implementation("io.ktor:ktor-io:2.3.9")
    implementation("io.ktor:ktor-network:2.3.9")
    implementation("io.ktor:ktor-network-tls:2.3.9")
    implementation("io.ktor:ktor-network-tls-certificates:2.3.9")
    implementation("io.ktor:ktor-resources:2.3.9")
    implementation("io.ktor:ktor-serialization:2.3.9")
    implementation("io.ktor:ktor-serialization-kotlinx:2.3.9")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.9")
    implementation("io.ktor:ktor-utils:2.3.9")
    implementation("io.ktor:ktor-websockets:2.3.9")
    implementation("io.ktor:ktor-websocket-serialization:2.3.9")
    // JetBrains
    implementation("org.jetbrains.compose.animation:animation:1.6.0")
    implementation("org.jetbrains.compose.desktop:desktop:1.6.0")
    implementation("org.jetbrains.compose.foundation:foundation:1.6.0")
    implementation("org.jetbrains.compose.html:html-core:1.6.0")
    implementation("org.jetbrains.compose.material:material:1.6.0")
    implementation("org.jetbrains.compose.material3:material3:1.6.0")
    implementation("org.jetbrains.compose.runtime:runtime:1.6.0")
    implementation("org.jetbrains.compose.ui:ui:1.6.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-io-bytestring:0.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.6.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:1.6.3")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.9.0")
    // Tests
    testImplementation("androidx.compose.ui:ui-test:1.6.3")
    testImplementation("com.google.accompanist:accompanist-testharness:0.35.0-alpha")
    testImplementation("io.ktor:ktor-client-tests:2.3.9")
    testImplementation("io.ktor:ktor-client-content-negotiation-tests:2.3.9")
    testImplementation("io.ktor:ktor-serialization-tests:2.3.9")
    testImplementation("io.ktor:ktor-serialization-kotlinx-tests:2.3.9")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.22")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.0")
    testImplementation("org.jetbrains.kotlinx:lincheck:2.26")
}