package org.mobiletoolkit.android.databinding

import android.app.Fragment
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Sebastian Owodzin on 04/04/2018.
 *
 * @deprecated Framework fragments are deprecated in Android P; prefer {@code
 *     org.mobiletoolkit.android.databinding.support.BindingFragment} to use a support-library-friendly
 *     fragment implementation.
 */
abstract class BindingFragment<T : ViewDataBinding>(
    protected val layoutId: Int
) : Fragment() {

    protected var binding: T? = null
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding?.root
    }
}
