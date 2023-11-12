
object Dependencies {

    object Core {
        const val coreKtx = "androidx.core:core-ktx:${Versions.Core.ktxVersion}"
        const val runtime= "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Core.runtimeVersion}"
    }

    object Compose {
        const val activity = "androidx.activity:activity-compose:${Versions.Compose.activityComposeVersion}"
        const val composeBom = "androidx.compose:compose-bom:${Versions.Compose.bomVersion}"
        const val ui = "androidx.compose.ui:ui"
        const val uiGraphics = "androidx.compose.ui:ui-graphics"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
        const val material = "androidx.compose.material3:material3"
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.Hilt.version}"
        const val compiler = "com.google.dagger:hilt-android-compiler:${Versions.Hilt.version}"

        const val compose = "androidx.hilt:hilt-navigation-compose:${Versions.Hilt.compose}"

        const val plugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.Hilt.version}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.version}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.Retrofit.version}"
        const val gson = "com.google.code.gson:gson:${Versions.Retrofit.version}"
    }

    object OkHttp {
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.OkHttp.version}"
        const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.OkHttp.version}"
    }

    object ViewModel {
        const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ViewModel.version}"
        const val compose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.ViewModel.version}"
    }

    object Coroutines {
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines.version}"
    }

    object Room {
        const val roomRuntime = "androidx.room:room-runtime:${Versions.Room.version}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.Room.version}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.Room.version}"
    }

    object UnitTest {
        const val junit = "junit:junit:${Versions.UnitTest.jUnitVersion}"
    }

    object AndroidTest {
        const val junit = "androidx.test.ext:junit:${Versions.UITest.jUnitVersion}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.UITest.espressoVersion}"
        const val composeBom = "androidx.compose:compose-bom:${Versions.UITest.composeBom}"
        const val composeUi = "androidx.compose.ui:ui-test-junit4"
    }

    object DebugImpl {
        const val uiTooling = "androidx.compose.ui:ui-tooling"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
    }
}