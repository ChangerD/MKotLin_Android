import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(28)
    defaultConfig {
        applicationId = "org.gradle.kotlin.dsl.samples.androidstudio"
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    implementation("androidx.appcompat:appcompat:1.0.0-beta01")
    implementation("androidx.core:core-ktx:1.1.0-alpha03")
    implementation("com.google.android.material:material:1.0.0-beta01")
    implementation("androidx.constraintlayout:constraintlayout:1.1.2")
    implementation("androidx.vectordrawable:vectordrawable:1.0.0-beta01")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.0-alpha4")
}