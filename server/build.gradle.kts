application {
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["development"] ?: "false"}")
    mainClass.set("dev.hyaena_technologies.ApplicationKt")
}

dependencies {
    implementation(projects.common)
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
    application
    id("io.ktor.plugin")
    id("org.jetbrains.kotlin.multiplatform")
}

version = "0.2.0"