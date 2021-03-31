package org.mobiletoolkit.android.databinding.dagger

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingAppCompatActivity<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerAppCompatActivity() {

    protected lateinit var binding: Binding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
