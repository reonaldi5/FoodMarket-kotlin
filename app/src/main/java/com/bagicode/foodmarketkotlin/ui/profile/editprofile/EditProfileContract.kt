package com.bagicode.foodmarketkotlin.ui.profile.editprofile

import com.bagicode.foodmarketkotlin.base.BasePresenter
import com.bagicode.foodmarketkotlin.base.BaseView
import com.bagicode.foodmarketkotlin.model.response.login.LoginResponse

interface EditProfileContract {

    interface View: BaseView {
        fun onEditSuccess(loginResponse: LoginResponse)
        fun onEditFailed(message:String)

    }

    interface Presenter : EditProfileContract, BasePresenter {
        fun submitEdit(name:String, email:String)
    }
}