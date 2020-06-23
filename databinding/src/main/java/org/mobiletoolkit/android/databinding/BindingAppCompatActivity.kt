package org.mobiletoolkit.android.databinding

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingAppCompatActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : AppCompatActivity() {

    protected val binding: T by lazy {
        DataBindingUtil.setContentView(this, layoutId) as T
    }
}
