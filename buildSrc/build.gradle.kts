plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    maven {
        name = "ajoberstar-backup"
        setUrl("https://ajoberstar.org/bintray-backup/")
    }
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.2")
    implementation("org.ajoberstar.grgit:grgit-core:4.1.0")
}