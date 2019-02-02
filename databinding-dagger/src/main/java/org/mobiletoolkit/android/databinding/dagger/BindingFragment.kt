package org.mobiletoolkit.android.databinding.dagger

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.DaggerFragment

/**
 * Created by Sebastian Owodzin on 04/04/2018.
 *
 * @deprecated Framework fragments are deprecated in Android P; prefer {@code
 *     org.mobiletoolkit.android.databinding.dagger.support.BindingFragment} to use a support-library-friendly
 *     dialog fragment implementation.
 */
abstract class BindingFragment<T : ViewDataBinding>(
    protected val layoutId: Int
) : DaggerFragment() {

    protected var binding: T? = null
        private set

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)

        return binding?.root
    }
}
