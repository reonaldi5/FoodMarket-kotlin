package com.bagicode.foodmarketkotlin.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.bagicode.foodmarketkotlin.model.response.home.Data
import com.bagicode.foodmarketkotlin.ui.home.recommended.HomeRecomendedFragment

class SectionPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

    var recommendedList:ArrayList<Data>? = ArrayList()

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Recommeded"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 1
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position) {
            0 -> {
                fragment = HomeRecomendedFragment()
                val bundle = Bundle()
                bundle.putParcelableArrayList("data", recommendedList)
                fragment.arguments = bundle
                return fragment
            }
            else -> {
                fragment = HomeRecomendedFragment()
                val bundle = Bundle()
                bundle.putParcelableArrayList("data", recommendedList)
                fragment.arguments = bundle
                return fragment
            }
        }
    }

    fun setData(newTasteListParms : ArrayList<Data>?, popularListParms : ArrayList<Data>?, recomendedListParms : ArrayList<Data>?) {
        recommendedList = recomendedListParms

    }
}