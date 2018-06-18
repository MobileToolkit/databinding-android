package org.mobiletoolkit.android.databinding.dagger.support

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingAppCompatActivity<T : ViewDataBinding>(
        protected val layoutId: Int
) : DaggerAppCompatActivity() {

    protected lateinit var binding: T
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
