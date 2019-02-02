package org.mobiletoolkit.android.databinding

import android.app.Activity
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle

/**
 * Created by Sebastian Owodzin on 02/002/2019.
 */
abstract class BindingActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : Activity() {

    protected var binding: T? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
