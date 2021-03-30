package org.mobiletoolkit.android.databinding.dagger

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import org.mobiletoolkit.android.databinding.dagger.fragment.DaggerFragmentActivity

/**
 * Created by Sebastian Owodzin on 23/06/2020
 */
abstract class BindingFragmentActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerFragmentActivity() {

    protected var binding: T? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}