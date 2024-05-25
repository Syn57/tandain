package com.zachnr.tandain.routefinder.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.zachnr.tandain.routefinder.databinding.FragmentRouteFinderBinding
import com.zachnr.tandain.uiresources.base.BaseFragment


class RouteFinderFragment : BaseFragment<FragmentRouteFinderBinding>() {
    override fun getBinding(layoutInflater: LayoutInflater): FragmentRouteFinderBinding {
        return FragmentRouteFinderBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

    }
}