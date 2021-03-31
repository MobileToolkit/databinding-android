package org.mobiletoolkit.android.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment

/**
 * Created by Sebastian Owodzin on 18/06/2018.
 */
abstract class BindingDialogFragment<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : DialogFragment() {

    protected lateinit var binding: Binding
        private set

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding.root
    }
}
