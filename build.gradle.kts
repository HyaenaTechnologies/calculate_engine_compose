plugins {
    val orgJetBrainsKotlin = "1.9.22"

    id("com.android.application") version "8.2.2" apply false
    id("com.android.library") version "8.2.2" apply false
    id("io.ktor.plugin") version "2.3.9" apply false
    id("org.gradle.android.cache-fix") version "3.0.1" apply false
    id("org.jetbrains.compose") version "1.6.0" apply false
    id("org.jetbrains.kotlin.android") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.jvm") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.js") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.multiplatform") version "$orgJetBrainsKotlin" apply false
}