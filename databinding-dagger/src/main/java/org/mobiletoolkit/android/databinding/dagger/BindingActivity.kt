package org.mobiletoolkit.android.databinding.dagger

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import dagger.android.DaggerActivity

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerActivity() {

    protected var binding: T? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
