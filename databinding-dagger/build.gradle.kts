plugins {
    id("com.android.library")
    id("maven-publish")
    kotlin("android")
    kotlin("kapt")
}

android {
    androidLibrary()

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:${Versions.Androidx.APP_COMPAT}")
    implementation("androidx.recyclerview:recyclerview:${Versions.Androidx.RECYCLER_VIEW}")
    implementation("com.google.dagger:dagger:${Versions.DAGGER}")
    implementation("com.google.dagger:dagger-android:${Versions.DAGGER}")
    implementation("com.google.dagger:dagger-android-support:${Versions.DAGGER}")

    androidTestImplementation("androidx.test:runner:1.4.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestUtil("androidx.test:orchestrator:1.4.0")
}

base {
    archivesBaseName = "org.mobiletoolkit.android.databinding.databindingdagger"
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = "${project.extra["groupId"]}"
                artifactId = "databinding-dagger"
                version = "2.3.0"
            }
        }
        repositories {
            maven("https://maven.pkg.github.com/MobileToolkit/databinding-android") {
                credentials {
                    username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USER")
                    password = project.findProperty("gpr.githubToken") as String? ?: System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }
}
