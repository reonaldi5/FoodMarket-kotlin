package com.bagicode.foodmarketkotlin.model.response.transaction


import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Link(
        @Expose
    @SerializedName("active")
    val active: Boolean,
        @Expose
    @SerializedName("label")
    val label: @RawValue Any,
        @Expose
    @SerializedName("url")
    val url: @RawValue Any
) : Parcelable