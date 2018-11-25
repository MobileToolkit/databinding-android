package org.mobiletoolkit.android.databinding.support

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingAppCompatActivity<T : ViewDataBinding>(
    protected val layoutId: Int
) : AppCompatActivity() {

    protected lateinit var binding: T
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
