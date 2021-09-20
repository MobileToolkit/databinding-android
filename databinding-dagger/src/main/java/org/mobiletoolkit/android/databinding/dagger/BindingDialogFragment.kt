package org.mobiletoolkit.android.databinding.dagger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import dagger.android.support.DaggerDialogFragment

/**
 * Created by Sebastian Owodzin on 05/04/2018.
 */
abstract class BindingDialogFragment<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerDialogFragment() {

    private var _binding: Binding? = null

    protected val binding: Binding
        get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding
    }
}
