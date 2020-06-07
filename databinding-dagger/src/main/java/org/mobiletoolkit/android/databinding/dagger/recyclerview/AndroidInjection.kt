package org.mobiletoolkit.android.databinding.dagger.recyclerview

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import dagger.android.HasAndroidInjector
import dagger.internal.Preconditions

/**
 * Created by Sebastian Owodzin on 07/06/2020.
 */
object AndroidInjection {
    private const val TAG = "dagger.android"

    fun inject(holder: RecyclerView.ViewHolder) = with(findHasAndroidInjector(holder)) {
        if (Log.isLoggable(TAG, Log.DEBUG)) {
            Log.d(
                TAG,
                "An injector for %s was found in %s".format(
                    holder.javaClass.canonicalName,
                    javaClass.canonicalName
                )
            )
        }

        inject(holder, this)
    }

    private fun findHasAndroidInjector(holder: RecyclerView.ViewHolder) =
        with(holder.itemView.context) {
            this as? HasAndroidInjector ?: applicationContext as? HasAndroidInjector
            ?: throw IllegalArgumentException("No injector was found for ${holder.javaClass.canonicalName}")
        }

    private fun inject(target: Any, hasAndroidInjector: HasAndroidInjector) =
        with(hasAndroidInjector.androidInjector()) {
            Preconditions.checkNotNull(
                this, "%s.androidInjector() returned null", hasAndroidInjector.javaClass
            )

            inject(target)
        }
}