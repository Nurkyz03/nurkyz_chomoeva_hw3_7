// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val navVersions by extra("2.7.7")

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersions")

    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}