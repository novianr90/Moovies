import org.gradle.api.artifacts.dsl.DependencyHandler

object DependenciesImplementation {

    fun DependencyHandler.core() {
        implementation(Dependencies.Core.coreKtx)
        implementation(Dependencies.Core.runtime)
    }

    fun DependencyHandler.compose() {
        implementation(Dependencies.Compose.activity)
        implementation(Dependencies.Compose.ui)
        implementation(Dependencies.Compose.uiGraphics)
        implementation(Dependencies.Compose.uiToolingPreview)
        implementation(Dependencies.Compose.material)
    }

    fun DependencyHandler.hilt() {
        implementation(Dependencies.Hilt.hilt)
        implementation(Dependencies.Hilt.compose)
        kapt(Dependencies.Hilt.compiler)
    }

    fun DependencyHandler.retrofit() {
        implementation(Dependencies.Retrofit.retrofit)
        implementation(Dependencies.Retrofit.gson)
        implementation(Dependencies.Retrofit.gsonConverter)
    }

    fun DependencyHandler.okhttp() {
        implementation(Dependencies.OkHttp.okhttp)
        implementation(Dependencies.OkHttp.interceptor)
    }

    fun DependencyHandler.viewModel() {
        implementation(Dependencies.ViewModel.viewModelKtx)
        implementation(Dependencies.ViewModel.compose)
    }

    fun DependencyHandler.coroutines() {
        implementation(Dependencies.Coroutines.core)
    }

    fun DependencyHandler.room() {
        implementation(Dependencies.Room.roomKtx)
        implementation(Dependencies.Room.roomRuntime)
        kapt(Dependencies.Room.roomCompiler)
    }

    fun DependencyHandler.testImpl() {
        test(Dependencies.UnitTest.junit)
    }

    fun DependencyHandler.androidTestImpl() {
        androidTest(Dependencies.AndroidTest.junit)
        androidTest(Dependencies.AndroidTest.espresso)
        androidTest(Dependencies.AndroidTest.composeUi)
    }

    fun DependencyHandler.debugImpl() {
        debug(Dependencies.DebugImpl.uiTooling)
        debug(Dependencies.DebugImpl.uiTestManifest)
    }

}