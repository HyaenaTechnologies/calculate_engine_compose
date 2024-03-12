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
    val androidxCompose = "1.6.3"
    val comGoogleAccompanist = "0.35.0-alpha"
    val ioKTOR = "2.3.9"
    val orgJetBrainsCompose = "1.6.0"
    val orgJetBrainsKotlinxCoroutines = "1.8.0"

    // Android
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.animation:animation:$androidxCompose")
    implementation("androidx.compose.compiler:compiler:1.5.10")
    implementation("androidx.compose.foundation:foundation:$androidxCompose")
    implementation("androidx.compose.material:material:$androidxCompose")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.runtime:runtime:$androidxCompose")
    implementation("androidx.compose.ui:ui:$androidxCompose")
    implementation("androidx.compose.ui:ui-tooling-preview:$androidxCompose")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.paging:paging-compose:3.2.1")
    implementation("com.google.accompanist:accompanist-adaptive:$comGoogleAccompanist")
    implementation("com.google.accompanist:accompanist-drawablepainter:$comGoogleAccompanist")
    implementation("com.google.accompanist:accompanist-navigation-material:$comGoogleAccompanist")
    implementation("com.google.accompanist:accompanist-permissions:$comGoogleAccompanist")
    implementation("com.google.android.material:compose-theme-adapter:1.2.1")
    implementation("com.google.android.material:compose-theme-adapter-3:1.1.1")
    implementation("com.google.android.material:compose-theme-adapter-core:1.0.1")
    // KTOR
    implementation("io.ktor:ktor-client-auth:$ioKTOR")
    implementation("io.ktor:ktor-client-core:$ioKTOR")
    implementation("io.ktor:ktor-client-cio:$ioKTOR")
    implementation("io.ktor:ktor-client-content-negotiation:$ioKTOR")
    implementation("io.ktor:ktor-client-encoding:$ioKTOR")
    implementation("io.ktor:ktor-client-json:$ioKTOR")
    implementation("io.ktor:ktor-client-logging:$ioKTOR")
    implementation("io.ktor:ktor-client-resources:$ioKTOR")
    implementation("io.ktor:ktor-client-serialization:$ioKTOR")
    implementation("io.ktor:ktor-events:$ioKTOR")
    implementation("io.ktor:ktor-http:$ioKTOR")
    implementation("io.ktor:ktor-http-cio:$ioKTOR")
    implementation("io.ktor:ktor-io:$ioKTOR")
    implementation("io.ktor:ktor-network:$ioKTOR")
    implementation("io.ktor:ktor-network-tls:$ioKTOR")
    implementation("io.ktor:ktor-network-tls-certificates:$ioKTOR")
    implementation("io.ktor:ktor-resources:$ioKTOR")
    implementation("io.ktor:ktor-serialization:$ioKTOR")
    implementation("io.ktor:ktor-serialization-kotlinx:$ioKTOR")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ioKTOR")
    implementation("io.ktor:ktor-utils:$ioKTOR")
    implementation("io.ktor:ktor-websockets:$ioKTOR")
    implementation("io.ktor:ktor-websocket-serialization:$ioKTOR")
    // JetBrains
    implementation("org.jetbrains.compose.animation:animation:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.desktop:desktop:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.foundation:foundation:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.html:html-core:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.material:material:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.material3:material3:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.runtime:runtime:$orgJetBrainsCompose")
    implementation("org.jetbrains.compose.ui:ui:$orgJetBrainsCompose")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:0.3.7")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$orgJetBrainsKotlinxCoroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$orgJetBrainsKotlinxCoroutines")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.5.0")
    implementation("org.jetbrains.kotlinx:kotlinx-io-bytestring:0.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$androidxCompose")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$androidxCompose")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-properties:$androidxCompose")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.9.0")
    // Tests
    testImplementation("androidx.compose.ui:ui-test:$androidxCompose")
    testImplementation("com.google.accompanist:accompanist-testharness:$comGoogleAccompanist")
    testImplementation("io.ktor:ktor-client-tests:$ioKTOR")
    testImplementation("io.ktor:ktor-client-content-negotiation-tests:$ioKTOR")
    testImplementation("io.ktor:ktor-serialization-tests:$ioKTOR")
    testImplementation("io.ktor:ktor-serialization-kotlinx-tests:$ioKTOR")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.22")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$orgJetBrainsKotlinxCoroutines")
    testImplementation("org.jetbrains.kotlinx:lincheck:2.26")
}