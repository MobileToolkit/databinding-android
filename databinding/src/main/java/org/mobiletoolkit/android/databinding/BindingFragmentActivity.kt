package org.mobiletoolkit.android.databinding

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity

/**
 * Created by Sebastian Owodzin on 07/06/2020.
 */
abstract class BindingFragmentActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : FragmentActivity() {

    protected var binding: T? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
