package org.mobiletoolkit.android.databinding

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Sebastian Owodzin on 11/04/2018.
 */
abstract class BindingViewHolder<out Binding : ViewDataBinding, ViewModel>(
    protected val layoutId: Int,
    protected val context: Context? = null,
    protected val container: ViewGroup? = null,
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
