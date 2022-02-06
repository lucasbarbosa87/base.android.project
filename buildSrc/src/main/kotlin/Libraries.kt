object Libraries {

    //RoomDb
    const val roomDb = "androidx.room:room-runtime:${Versions.roomDb}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomDb}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomDb}"
    const val roomGuava = "androidx.room:room-guava:${Versions.roomDb}"
    const val roomTesting = "androidx.room:room-testing:${Versions.roomDb}"

    //Koin
    const val koin = "io.insert-koin:koin-android:${Versions.koin}"

    //    const val koinViewModel = "io.insert-koin:koin-androidx-viewmodel:${Versions.koinViewModel}"
    const val koinTest = "io.insert-koin:koin-test:${Versions.koin}"

    //ViewPager
    const val viewPager2 = "androidx.viewpager2:viewpager2:${Versions.viewPager2}"

    //TimeLine
    const val timeLine = "com.github.vipulasri:timelineview:${Versions.timeLine}"

    //LifeCycle
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"

    //Navigation
    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationFragmentUiKtx =
        "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val jodaTime = "joda-time:joda-time:${Versions.jodaTime}"

    const val workManager = "androidx.work:work-runtime-ktx:${Versions.workVersion}"

    //AppCenter
    const val appCenterAnalytics =
        "com.microsoft.appcenter:appcenter-analytics:${Versions.appCenterSdkVersion}"
    const val appCenterCrashes =
        "com.microsoft.appcenter:appcenter-crashes:${Versions.appCenterSdkVersion}"

    //Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    //Guava
    const val guava = "com.google.guava:guava:${Versions.guava}"

    //Data binding validator
    const val dataBindingValidator =
        "com.github.Ilhasoft:data-binding-validator:${Versions.dataBindingValidator}"

    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    //Paginator
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"
    const val pagingGuava = "androidx.paging:paging-guava:${Versions.paging}"
    const val paging2 = "androidx.paging:paging-runtime-ktx:3.1.0"

    const val firebaseAuth = "com.google.firebase:firebase-auth-ktx:21.0.1"
    const val firebaseAuthSignInGoogle = "com.google.android.gms:play-services-auth:20.0.1"

    //Hilt
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltAndroidCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
    const val hiltGradlePlugin =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    const val hiltCompose = "androidx.hilt:hilt-navigation-compose:${Versions.hiltComposeVersion}"
    const val hiltAndroidGoogle = "androidx.hilt:hilt:1.0.0"
    const val hiltAndroidXCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltVersion}"

}

object Versions {
    const val hiltComposeVersion = "1.0.0"
    const val hiltVersion = "2.40.5"
    const val dataBindingValidator = "2.0.0"
    const val roomDb = "2.4.1"
    const val koin = "3.1.5"
    const val koinViewModel = "2.2.3"
    const val viewPager2 = "1.0.0"
    const val timeLine = "1.1.5"
    const val lifecycle = "2.2.0"
    const val navigation = "2.4.0-rc01"
    const val jodaTime = "2.10.13"
    const val appCenterSdkVersion = "4.0.0"
    const val retrofit = "2.9.0"
    const val guava = "31.0.1-jre"
    const val workVersion = "2.4.0"
    const val gsonVersion = "2.8.9"
    const val paging = "3.0.0-beta01"
}