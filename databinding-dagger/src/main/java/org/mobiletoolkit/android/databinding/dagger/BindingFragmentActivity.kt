package org.mobiletoolkit.android.databinding.dagger

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import org.mobiletoolkit.android.databinding.dagger.fragment.DaggerFragmentActivity

/**
 * Created by Sebastian Owodzin on 23/06/2020
 */
abstract class BindingFragmentActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerFragmentActivity() {

    protected val binding: T by lazy {
        DataBindingUtil.setContentView(this, layoutId) as T
    }
}