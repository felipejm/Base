
private object Versions {
    const val KOTLIN = "1.3.61"
    const val APPCOMPAT = "1.1.0"
    const val MATERIAL = "1.1.0-beta01"
    const val COROUTINES = "1.3.3"
    const val RECYCLE_VIEW = "1.1.0"
    const val NAVIGATION = "2.1.0"
    const val LIFECYCLE = "2.1.0"
    const val CORE_KTX = "1.1.0"
    const val FRAGMENT_KTX = "1.2.0-alpha02"
    const val CONSTRAIN_LAYOUT = "1.1.3"
    const val SWIPE_REFRESH_LAYOUT = "1.1.0-alpha02"
    const val TIMBER = "4.7.1"
    const val RETROFIT = "2.7.0"
    const val LOGGING = "4.2.2"
    const val MOSHI = "1.9.2"
    const val COIL = "0.8.0"

    // Tests
    const val TEST = "1.2.0"
    const val EXT = "1.1.1"
    const val ARCH_CORE = "2.1.0"
    const val JUNIT = "4.12"
    const val MOCKK = "1.9.3"
    const val ESPRESSO = "3.2.0"
    const val FRAGMENT_TEST = "1.2.0-alpha02"
    const val MOCK_WEB_SERVER = "4.2.2"
}

object Dependencies {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val RECYCLE_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLE_VIEW}"
    const val CONSTRAIN_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAIN_LAYOUT}"
    const val SWIPE_REFRESH_LAYOUT = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SWIPE_REFRESH_LAYOUT}"

    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"

    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"

    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val LOGGING = "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING}"
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"
    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
}

object TestDependencies {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
    const val EXT = "androidx.test.ext:junit:${Versions.EXT}"
    const val CORE = "androidx.test:core:${Versions.TEST}"
    const val RUNNER = "androidx.test:runner:${Versions.TEST}"
    const val RULES = "androidx.test:rules:${Versions.TEST}"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"
    const val ARCH_CORE = "androidx.arch.core:core-testing:${Versions.ARCH_CORE}"
    const val FRAGMENT_TEST = "androidx.fragment:fragment-testing:${Versions.FRAGMENT_TEST}"
    const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:${Versions.MOCK_WEB_SERVER}"
}

