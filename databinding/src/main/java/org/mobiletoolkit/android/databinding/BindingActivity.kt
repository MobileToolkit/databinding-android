package org.mobiletoolkit.android.databinding

import android.app.Activity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by Sebastian Owodzin on 02/002/2019.
 */
abstract class BindingActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : Activity() {

    protected val binding: T by lazy {
        DataBindingUtil.setContentView(this, layoutId) as T
    }
}
