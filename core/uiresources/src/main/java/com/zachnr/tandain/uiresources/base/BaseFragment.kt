package com.zachnr.tandain.uiresources.base

import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    private var _binding: VB? = null

    protected val binding: VB get() = _binding!!

    abstract fun getBinding(layoutInflater: LayoutInflater): VB

    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = getBinding(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setStatusBarColor()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    protected fun setStatusBarColor(isLight: Boolean = false) {
        val configuration = resources.configuration
        val isDarkTheme =
            (configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) == Configuration.UI_MODE_NIGHT_YES
        if (isLight) {
            WindowInsetsControllerCompat(
                requireActivity().window,
                binding.root
            ).isAppearanceLightStatusBars = false
        } else {
            WindowInsetsControllerCompat(
                requireActivity().window,
                binding.root
            ).isAppearanceLightStatusBars = !isDarkTheme
        }
    }
}
