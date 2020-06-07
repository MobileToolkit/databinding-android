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
abstract class BindingDialogFragment<T : ViewDataBinding>(
    protected val layoutId: Int
) : DialogFragment() {

    protected var binding: T? = null
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activity?.layoutInflater?.let {
            binding = DataBindingUtil.inflate(it, layoutId, null, false)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = binding?.root
}
