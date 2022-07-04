package com.bagicode.foodmarketkotlin.ui.profile.account

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bagicode.foodmarketkotlin.R
import com.bagicode.foodmarketkotlin.model.dummy.ProfileMenuModel
import com.bagicode.foodmarketkotlin.ui.auth.AuthActivity
import com.bagicode.foodmarketkotlin.ui.profile.ProfileMenuAdapter
import kotlinx.android.synthetic.main.fragment_profile_account.*

class ProfileAccountFragment : Fragment(), ProfileMenuAdapter.ItemAdapterCallback {

    var bundle:Bundle ?= null

    private var menuArrayList: ArrayList<ProfileMenuModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_account, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()

        var adapter = ProfileMenuAdapter(menuArrayList, this)
        var layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter

//        btnEdit.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.fmEditProfile, bundle)
//        }

    }

    fun initDataDummy() {
        menuArrayList = ArrayList()
        menuArrayList.add(ProfileMenuModel("Edit Profile"))

    }

    override fun onClick(v: View, data: ProfileMenuModel) {
//        btnEdit.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.fmEditProfile, bundle)
//        }
    }


}