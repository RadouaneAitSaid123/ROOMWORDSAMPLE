plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.roomworldsample2"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.roomworldsample2"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("androidx.navigation:navigation-fragment:2.9.0")
    implementation("androidx.navigation:navigation-ui:2.9.0")
    implementation(libs.room.common.jvm)
    implementation(libs.room.runtime.android)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation ("androidx.room:room-runtime:2.6.1")
    // Dépendances pour travailler avec les composants d'architecture
// Vous devrez probablement mettre à jour les numéros de version dans libs.versions.toml

// Composant de base de données Room
    implementation (libs.room.runtime)
    annotationProcessor (libs.room.compiler)
    testImplementation (libs.room.testing)

// Composants de cycle de vie
    implementation (libs.lifecycle.viewmodel)
    implementation (libs.lifecycle.livedata)
    implementation (libs.lifecycle.common.java8)
}