plugins {
    val com_android = "8.3.1"
    val org_jetbrains_kotlin = "1.9.22"

    id("com.android.application") version "$com_android" apply false
    id("com.android.library") version "$com_android" apply false
    id("io.ktor.plugin") version "2.3.9" apply false
    id("org.gradle.android.cache-fix") version "3.0.1" apply false
    id("org.jetbrains.compose") version "1.6.1" apply false
    id("org.jetbrains.kotlin.android") version "$org_jetbrains_kotlin" apply false
    id("org.jetbrains.kotlin.jvm") version "$org_jetbrains_kotlin" apply false
    id("org.jetbrains.kotlin.js") version "$org_jetbrains_kotlin" apply false
    id("org.jetbrains.kotlin.multiplatform") version "$org_jetbrains_kotlin" apply false
}