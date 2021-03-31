package org.mobiletoolkit.android.databinding

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by Sebastian Owodzin on 02/002/2019.
 */
abstract class BindingActivity<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : Activity() {

    protected lateinit var binding: Binding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
