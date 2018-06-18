package org.mobiletoolkit.android.databinding.support

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView

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
        )
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun bind(viewModel: ViewModel)
}
