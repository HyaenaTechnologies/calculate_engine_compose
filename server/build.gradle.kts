plugins {
    id("org.jetbrains.kotlin.jvm")
    id("io.ktor.plugin")
    application
}

group = "dev.hyaena_technologies"
version = "0.2.0"
application {
    mainClass.set("dev.hyaena_technologies.ApplicationKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["development"] ?: "false"}")
}

dependencies {
    implementation("io.ktor:ktor-client-tests:2.3.7")
    implementation(lib.bundles.ktor)
    implementation(projects.shared)
}