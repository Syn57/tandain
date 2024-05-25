package com.zachnr.tandain.finance.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.zachnr.tandain.finance.databinding.FragmentFinanceBinding
import com.zachnr.tandain.uiresources.base.BaseFragment

class FinanceFragment : BaseFragment<FragmentFinanceBinding>() {

    override fun getBinding(layoutInflater: LayoutInflater): FragmentFinanceBinding {
        return FragmentFinanceBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {

    }
}