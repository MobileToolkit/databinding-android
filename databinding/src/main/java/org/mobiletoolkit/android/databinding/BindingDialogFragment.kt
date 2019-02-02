package org.mobiletoolkit.android.databinding

import android.app.DialogFragment
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Sebastian Owodzin on 05/04/2018.
 *
 * @deprecated Framework fragments are deprecated in Android P; prefer {@code
 *     org.mobiletoolkit.android.databinding.support.BindingDialogFragment} to use a support-library-friendly
 *     dialog fragment implementation.
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
