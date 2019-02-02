package org.mobiletoolkit.android.databinding.support

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Sebastian Owodzin on 11/04/2018.
 */
abstract class BindingViewHolder<out Binding : ViewDataBinding, ViewModel>(
    protected val context: Context?,
    protected val layoutId: Int,
    protected val container: ViewGroup?,
    protected val binding: Binding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        layoutId,
        container,
        false
    ),
    protected val viewModelVariableId: Int? = null
) : RecyclerView.ViewHolder(binding.root) {

    open fun bind(viewModel: ViewModel) {
        viewModelVariableId?.let {
            binding.setVariable(viewModelVariableId, viewModel)
            binding.executePendingBindings()
        }
    }
}
