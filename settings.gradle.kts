dependencyResolutionManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)

    versionCatalogs {
        create("lib") {
            version("accompanist", "0.33.2-alpha")
            version("coroutines", "1.7.3")
            version("io", "0.3.0")
            version("ktor", "2.3.6")
            version("lifecycle", "2.6.2")
            version("ui", "1.5.4")
            library(
                "accompanist-adaptive",
                "com.google.accompanist",
                "accompanist-adaptive"
            ).versionRef("accompanist")
            library(
                "accompanist-drawablepainter",
                "com.google.accompanist",
                "accompanist-drawablepainter"
            ).versionRef("accompanist")
            library(
                "accompanist-navigation-material",
                "com.google.accompanist",
                "accompanist-navigation-material"
            ).versionRef("accompanist")
            library(
                "accompanist-permissions",
                "com.google.accompanist",
                "accompanist-permissions"
            ).versionRef("accompanist")
            library(
                "kotlinx-coroutines-android",
                "org.jetbrains.kotlinx",
                "kotlinx-coroutines-android"
            ).versionRef("coroutines")
            library(
                "kotlinx-coroutines-core",
                "org.jetbrains.kotlinx",
                "kotlinx-coroutines-core"
            ).versionRef("coroutines")
            library(
                "kotlinx-io-bytestring",
                "org.jetbrains.kotlinx",
                "kotlinx-io-bytestring"
            ).versionRef("io")
            library(
                "kotlinx-io-core",
                "org.jetbrains.kotlinx",
                "kotlinx-io-core"
            ).versionRef("io")
            library(
                "ktor-client-core",
                "io.ktor",
                "ktor-client-core"
            ).versionRef("ktor")
            library(
                "ktor-http",
                "io.ktor",
                "ktor-http"
            ).versionRef("ktor")
            library(
                "lifecycle-runtime-compose",
                "androidx.lifecycle",
                "lifecycle-runtime-compose"
            ).versionRef("lifecycle")
            library(
                "lifecycle-viewmodel-compose",
                "androidx.lifecycle",
                "lifecycle-viewmodel-compose"
            ).versionRef("lifecycle")
            library(
                "ui",
                "androidx.compose.ui",
                "ui"
            ).versionRef("ui")
            library(
                "ui-tooling",
                "androidx.compose.ui",
                "ui-tooling"
            ).versionRef("ui")
            bundle(
                "accompanist",
                listOf(
                    "accompanist-adaptive",
                    "accompanist-drawablepainter",
                    "accompanist-navigation-material",
                    "accompanist-permissions"
                )
            )
            bundle(
                "coroutines",
                listOf(
                    "kotlinx-coroutines-android",
                    "kotlinx-coroutines-core"
                )
            )
            bundle(
                "io",
                listOf(
                    "kotlinx-io-bytestring",
                    "kotlinx-io-core"
                )
            )
            bundle(
                "ktor",
                listOf(
                    "ktor-client-core",
                    "ktor-http"
                )
            )
            bundle(
                "lifecycle",
                listOf(
                    "lifecycle-runtime-compose",
                    "lifecycle-viewmodel-compose"
                )
            )
            bundle(
                "ui",
                listOf(
                    "ui",
                    "ui-tooling"
                )
            )
        }
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(":common")
include(":server")
include(":shared")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "CalculateEngine"