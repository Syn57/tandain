package com.zachnr.tandain.routefinder.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.zachnr.tandain.routefinder.R
import com.zachnr.tandain.routefinder.databinding.FragmentRouteFinderBinding
import com.zachnr.tandain.uiresources.base.BaseFragment


class RouteFinderFragment : BaseFragment<FragmentRouteFinderBinding>(), OnMapReadyCallback {
    override fun getBinding(layoutInflater: LayoutInflater): FragmentRouteFinderBinding {
        return FragmentRouteFinderBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
        BottomSheetDialogFragment()
    }

    override fun onMapReady(p0: GoogleMap) {

    }
    companion object {

    }
}
