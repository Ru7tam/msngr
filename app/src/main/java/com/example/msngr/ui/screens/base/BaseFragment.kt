package com.example.msngr.ui.screens.base

import androidx.fragment.app.Fragment
import com.example.msngr.utilits.APP_ACTIVITY

open class BaseFragment(layout: Int) : Fragment(layout) {
    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()
    }
}