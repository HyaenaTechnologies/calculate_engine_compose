application {
    mainClass.set("dev.hyaena_technologies.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["development"] ?: "false"}")
}

dependencies {
    implementation("io.ktor:ktor-client-tests:2.3.7")
    implementation(lib.bundles.ktor)
    implementation(projects.shared)
}

group = "dev.hyaena_technologies"

kotlin {
    linuxArm64() {

    }

    linuxX64() {

    }

    macosArm64() {

    }

    macosX64() {

    }

    mingwX64(){

    }
}

plugins {
    id("io.ktor.plugin")
    id("org.jetbrains.kotlin.multiplatform")
    application
}

version = "0.2.0"