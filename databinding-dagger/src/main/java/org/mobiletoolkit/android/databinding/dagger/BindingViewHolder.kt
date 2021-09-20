package org.mobiletoolkit.android.databinding.dagger

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LifecycleOwner
import org.mobiletoolkit.android.databinding.dagger.recyclerview.DaggerViewHolder

/**
 * Created by Sebastian Owodzin on 07/06/2020.
 */
abstract class BindingViewHolder<out Binding : ViewDataBinding, ViewModel>(
    protected val layoutId: Int,
    protected val context: Context?,
    protected val container: ViewGroup?,
    protected val binding: Binding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        layoutId,
        container,
        false
    ),
    protected val viewModelVariableId: Int? = null
) : DaggerViewHolder(binding.root) {

    init {
        (binding.root.context as? LifecycleOwner)?.let {
            binding.lifecycleOwner = it
        }
    }

    open fun bind(viewModel: ViewModel) {
        viewModelVariableId?.let {
            binding.setVariable(viewModelVariableId, viewModel)
            binding.executePendingBindings()
        }
    }
}