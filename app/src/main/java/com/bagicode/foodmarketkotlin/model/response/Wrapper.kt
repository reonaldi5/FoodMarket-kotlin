package com.bagicode.foodmarketkotlin.model.response

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Wrapper<T>(
        @Expose
    @SerializedName("data")
    val data: @RawValue T?= null,
        @Expose
    @SerializedName("meta")
    val meta: Meta ? = null
) : Parcelable