package com.zachnr.tandain.home.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.zachnr.tandain.home.databinding.FragmentHomeBinding
import com.zachnr.tandain.uiresources.base.BaseFragment
import com.zachnr.tandain.uiresources.utils.StatusBarMode

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getBinding(layoutInflater: LayoutInflater): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setStatusBarColor(StatusBarMode.LIGHT)

    }

    companion object {

    }
}
