package com.bagicode.foodmarketkotlin.ui.profile.editprofile

import com.bagicode.foodmarketkotlin.network.HttpClient
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class EditProfilePresenter (private val view:EditProfileContract.View) : EditProfileContract.Presenter {

    private val mCompositeDisposable : CompositeDisposable?
    init {
        this.mCompositeDisposable = CompositeDisposable()
    }

    override fun submitEdit(name: String, email: String) {
        view.showLoading()
        val disposable = HttpClient.getInstance().getApi()!!.edit(name, email)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    view.dismissLoading()

                    if (it.meta?.status.equals("success",true)){
                        it.data?.let { it1 -> view.onEditSuccess(it1) }
                    } else {
                        it.meta?.message?.let { it1 -> view.onEditFailed(it1) }
                    }
                },
                {
                    view.dismissLoading()
                    view.onEditFailed(it.message.toString())
                }
            )
        mCompositeDisposable!!.add(disposable)
    }


    override fun subscribe() {

    }

    override fun unSubscribe() {
        mCompositeDisposable!!.clear()
    }

}