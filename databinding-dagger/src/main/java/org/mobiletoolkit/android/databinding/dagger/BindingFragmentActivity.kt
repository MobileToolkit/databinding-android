package org.mobiletoolkit.android.databinding.dagger

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import org.mobiletoolkit.android.databinding.dagger.fragment.DaggerFragmentActivity

/**
 * Created by Sebastian Owodzin on 23/06/2020
 */
abstract class BindingFragmentActivity<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerFragmentActivity() {

    protected lateinit var binding: Binding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}