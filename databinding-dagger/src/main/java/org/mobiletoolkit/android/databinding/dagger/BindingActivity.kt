package org.mobiletoolkit.android.databinding.dagger

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.DaggerActivity

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingActivity<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerActivity() {

    protected lateinit var binding: Binding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
