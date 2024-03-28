import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.multiplatform")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(
                TargetFormat.AppImage,
                TargetFormat.Deb,
                TargetFormat.Dmg,
                TargetFormat.Exe,
                TargetFormat.Msi,
                TargetFormat.Pkg,
                TargetFormat.Rpm
            )
            packageName = "dev.hyaena_technologies.calculate_engine"
            packageVersion = "1.0.0"
        }
    }
}

val androidx_compose: String = "1.6.3"
val org_jetbrains_compose: String = "1.6.1"
val jetbrains_kotlin: String = "1.9.23"
val org_jetbrains_kotlinx_coroutines: String = "1.8.0"
val org_jetbrains_kotlinx_io: String = "0.3.2"

kotlin {
    jvm("desktop")

    sourceSets {
        all {
            languageSettings {
                optIn("org.jetbrains.compose.resources.ExperimentalResourceApi")
            }
        }
        val desktopMain by getting {
            dependencies {
                // JetBrains
                implementation("org.jetbrains.compose.animation:animation:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.desktop:desktop:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.foundation:foundation:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.html:html-core:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.material:material:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.material3:material3:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.runtime:runtime:$org_jetbrains_compose")
                implementation("org.jetbrains.compose.ui:ui:$org_jetbrains_compose")
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
                implementation("org.jetbrains.kotlin:kotlin-test:$jetbrains_kotlin")
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$org_jetbrains_kotlinx_coroutines")
                implementation("org.jetbrains.kotlinx:lincheck:2.28.1")
            }
            kotlin.srcDir("src/desktopMain/kotlin")
            resources.srcDir("src/desktopMain/resources")
        }
    }
}
