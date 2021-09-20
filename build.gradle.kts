buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("digital.wup:android-maven-publish:3.6.2")
        classpath(kotlin("gradle-plugin", "1.4.21"))
    }
}

allprojects {
    val groupId by extra { "org.mobiletoolkit.android.databinding" }
    val vcsUrl by extra { "https://github.com/MobileToolkit/databinding-android.git" }
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
