package org.mobiletoolkit.android.databinding

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity

/**
 * Created by Sebastian Owodzin on 07/06/2020.
 */
abstract class BindingFragmentActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : FragmentActivity() {

    protected val binding: T by lazy {
        DataBindingUtil.setContentView(this, layoutId) as T
    }
}
