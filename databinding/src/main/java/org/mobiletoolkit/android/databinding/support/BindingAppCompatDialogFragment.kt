package org.mobiletoolkit.android.databinding.support

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatDialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Sebastian Owodzin on 04/04/2018.
 */
abstract class BindingAppCompatDialogFragment<T : ViewDataBinding>(
    protected val layoutId: Int
) : AppCompatDialogFragment() {

    protected lateinit var binding: T
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding.root
    }
}
