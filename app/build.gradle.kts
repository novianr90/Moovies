import DependenciesImplementation.androidTestImpl
import DependenciesImplementation.compose
import DependenciesImplementation.core
import DependenciesImplementation.coroutines
import DependenciesImplementation.debugImpl
import DependenciesImplementation.hilt
import DependenciesImplementation.okhttp
import DependenciesImplementation.retrofit
import DependenciesImplementation.room
import DependenciesImplementation.testImpl
import DependenciesImplementation.viewModel

plugins {
    id(ProjectPlugin.androidApp)
    id(ProjectPlugin.kotlinAndroid)
    kotlin(ProjectPlugin.kapt)
    id(ProjectPlugin.hilt)
}

android {
    namespace = AppConfig.appPackage
    compileSdk = AppConfig.compileAndTargetSdk

    defaultConfig {
        applicationId = AppConfig.appPackage
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.compileAndTargetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.testRunner
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    core()
    compose()
    hilt()
    retrofit()
    okhttp()
    viewModel()
    coroutines()
    room()
    testImpl()
    androidTestImpl()
    debugImpl()

    implementation(platform(Dependencies.Compose.composeBom))
    androidTestImplementation(platform(Dependencies.AndroidTest.composeBom))
}