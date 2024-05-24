package com.zachnr.tandain.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.zachnr.tandain.R
import com.zachnr.tandain.databinding.FragmentMainBinding
import com.zachnr.tandain.uiresources.base.BaseFragment


class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun getBinding(layoutInflater: LayoutInflater): FragmentMainBinding {
        return FragmentMainBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBottomNaviation()
    }

    private fun setupBottomNaviation() {
        // Navigation Setup
        val navHostFragment =
            this.childFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        val navController = navHostFragment.findNavController()
        binding.bnMain.setupWithNavController(navController)
    }

    companion object {

    }
}