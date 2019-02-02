package org.mobiletoolkit.android.databinding.dagger.support

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerAppCompatDialogFragment

/**
 * Created by Sebastian Owodzin on 04/04/2018.
 */
abstract class BindingAppCompatDialogFragment<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerAppCompatDialogFragment() {

    protected var binding: T? = null
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding?.root
    }
}
