buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
//        classpath("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5")
        classpath("digital.wup:android-maven-publish:3.6.2")
        classpath(kotlin("gradle-plugin", "1.4.21"))
    }
}

allprojects {
    val groupId by extra { "org.mobiletoolkit.android.databinding" }
    val vcsUrl by extra { "https://github.com/MobileToolkit/databinding-android.git" }
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
