package org.mobiletoolkit.android.databinding.dagger.support

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerDialogFragment

/**
 * Created by Sebastian Owodzin on 05/04/2018.
 */
abstract class BindingDialogFragment<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerDialogFragment() {

    protected lateinit var binding: T
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding.root
    }
}
