# Android data binding extensions 

![](https://github.com/MobileToolkit/databinding-android/workflows/.github/workflows/build-test.yml/badge.svg)
![](https://github.com/MobileToolkit/databinding-android/workflows/.github/workflows/validation.yml/badge.svg)

A set of Android Databinding enabled activities, fragments, etc. (also Dagger variants).



## Installation

To use the library, first include it your project using Gradle

 * Bintray
 
```groovy
repositories {
    maven { url("https://dl.bintray.com/mobiletoolkit/public") }
}
```
      
* GitHub packages

```groovy
repositories {
    maven { url("https://maven.pkg.github.com/MobileToolkit/databinding-android") }
}
```

```groovy
dependencies {
    implementation("org.mobiletoolkit.android.databinding:databinding:{RELEASE_TAG}"
    implementation("org.mobiletoolkit.android.databinding:databinding-dagger:{RELEASE_TAG}")
}
```


## How to use

TODO