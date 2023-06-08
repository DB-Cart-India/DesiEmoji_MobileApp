import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id("kotlin-parcelize")
}

android {

    namespace = "com.desiemoji.keyboard"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.desiemoji.keyboard"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"

        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Declaration build config
//        buildConfigField("String", "DATABASE_NAME", "desiemoji.db")
//        buildConfigField("String", "PREF_NAME", "pref_desiemoji")

        // Naming APK // AAB
        setProperty("archivesBaseName", "desiemoji")

        // Declaration apps name debug mode
        val nameAppDebug = "Desi Emoji Keyboard"
        resourceConfigurations += setOf("en", "id")

        // Inject app name for debug
        resValue("string", "app_name", nameAppDebug)

        // Inject admob id for debug
//        resValue("string", "admob_app_id", AdmobValue.debugAdmobAppId)
//        resValue("string", "admob_banner", AdmobValue.debugAdmobBanner)
//        resValue("string", "admob_interstitial", AdmobValue.debugAdmobInterstitial)
//        resValue("string", "admob_interstitial_video", AdmobValue.debugAdmobInterstitialVideo)
//        resValue("string", "admob_rewarded", AdmobValue.debugAdmobRewarded)
//        resValue("string", "admob_rewarded_interstitial", AdmobValue.debugAdmobRewardedInterstitial)
//        resValue("string", "admob_native_advanced", AdmobValue.debugAdmobNativeAdvanced)
//        resValue("string", "admob_native_advanced_video", AdmobValue.debugAdmobNativeAdvancedVideo)

    }

    signingConfigs {
        create("release") {
            // You need to specify either an absolute path or include the
            // keystore file in the same directory as the build.gradle file.
            // [PROJECT FOLDER NAME/app/[COPY YOUT KEY STORE] .jks in here
            storeFile = file(ProjectSetting.PLAYSTORE_STORE_FILE)
            storePassword = ProjectSetting.PLAYSTORE_STORE_PASSWORD
            keyAlias = ProjectSetting.PLAYSTORE_KEY_ALIAS
            keyPassword = ProjectSetting.PLAYSTORE_KEY_PASSWORD
        }
    }



    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_11.toString()
        }
    }
}

dependencies {

    implementation(Androidx.Work.runtimeKtx)

    implementation(Google.Hilt.android)

    implementation(Frogo.sdk)
    implementation(Frogo.ui)
    implementation(Frogo.recyclerView)
    implementation(Frogo.consumeApi)

    implementation(Androidx.emoji2)

    implementation(Util.FastAdapter.core)
    implementation(Util.FastAdapter.expandable)
    implementation(Util.FastAdapter.binding)
    implementation(Util.FastAdapter.diff)
    implementation(Util.FastAdapter.drag)
    implementation(Util.FastAdapter.paged)
    implementation(Util.FastAdapter.scroll)
    implementation(Util.FastAdapter.swipe)
    implementation(Util.FastAdapter.ui)
    implementation(Util.FastAdapter.utils)
    implementation("io.coil-kt:coil:1.4.0")
    implementation("io.coil-kt:coil-gif:1.4.0")
    implementation("io.coil-kt:coil-video:1.4.0")
    implementation ("com.beust:klaxon:5.5")

    kapt(GitHub.glideCompiler)
    kapt(Google.Hilt.compiler)
    kapt(Androidx.Room.compiler)
    kapt(Androidx.Lifecycle.compiler)

}