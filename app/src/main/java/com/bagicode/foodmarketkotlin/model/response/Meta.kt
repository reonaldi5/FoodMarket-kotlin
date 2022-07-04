package com.bagicode.foodmarketkotlin.model.response

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Meta(
    @Expose
    @SerializedName("code")
    val code: Int,
    @Expose
    @SerializedName("message")
    val message: String,
    @Expose
    @SerializedName("status")
    val status: String
) : Parcelable