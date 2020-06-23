# Android data binding extensions 

![Build / test](https://github.com/MobileToolkit/databinding-android/workflows/Build%20/%20test/badge.svg)
![Validation](https://github.com/MobileToolkit/databinding-android/workflows/Validation/badge.svg)

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
    implementation("org.mobiletoolkit.android.databinding:databinding:{RELEASE_TAG}")
    implementation("org.mobiletoolkit.android.databinding:databinding-dagger:{RELEASE_TAG}")
}
```


## How to use

### databinding

* BindingActivity

```kotlin
class FooActivity : BindingActivity<FooBarActivityBinding>(R.layout.activity_foo)
```

* BindingAppCompatActivity

```kotlin
class FooActivity : BindingAppCompatActivity<FooBarActivityBinding>(R.layout.activity_foo)
```

* BindingAppCompatDialogFragment

```kotlin
class FooDialog : BindingAppCompatDialogFragment<FooBarActivityBinding>(R.layout.dialog_foo)
```

* BindingDialogFragment

```kotlin
class FooDialog : BindingDialogFragment<FooBarActivityBinding>(R.layout.dialog_foo)
```

* BindingFragment

```kotlin
class FooFragment : BindingFragment<FooBarActivityBinding>(R.layout.fragment_foo)
```

* BindingFragmentActivity

```kotlin
class FooFragment : BindingFragmentActivity<FooBarActivityBinding>(R.layout.fragment_foo)
```

* BindingViewHolder

```kotlin
data class FooViewModel(val bar: Int)

class FooBarViewHolder(
    context: Context?,
    container: ViewGroup?
) : BindingViewHolder<FooBarViewHolderBinding, FooViewModel>(
    R.layout.layout_foobar,
    context,
    container,
    viewModelVariableId = BR.viewModel
)
```

### databinding-dagger

Same as for databinding, just includes Dagger 2 injections.