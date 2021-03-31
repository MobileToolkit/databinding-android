package org.mobiletoolkit.android.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * Created by Sebastian Owodzin on 29/03/2018.
 */
abstract class BindingAppCompatActivity<Binding : ViewDataBinding>(
    protected val layoutId: Int
) : AppCompatActivity() {

    protected lateinit var binding: Binding
        private set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}
