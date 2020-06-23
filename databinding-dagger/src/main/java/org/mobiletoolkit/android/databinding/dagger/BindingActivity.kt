package org.mobiletoolkit.android.databinding.dagger

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.DaggerActivity

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerActivity() {

    protected val binding: T by lazy {
        DataBindingUtil.setContentView(this, layoutId) as T
    }
}
