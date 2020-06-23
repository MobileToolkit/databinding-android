package org.mobiletoolkit.android.databinding.dagger.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

/**
 * Created by Sebastian Owodzin on 07/06/2020.
 */
abstract class DaggerViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    init {
        handleInjection()
    }

    private fun handleInjection() {
        AndroidInjection.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}