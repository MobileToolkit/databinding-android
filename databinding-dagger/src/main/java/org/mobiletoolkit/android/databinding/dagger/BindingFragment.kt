package org.mobiletoolkit.android.databinding.dagger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.support.DaggerFragment

/**
 * Created by Sebastian Owodzin on 04/04/2018.
 */
abstract class BindingFragment<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerFragment() {

    protected lateinit var binding: Binding
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding.root
    }
}
