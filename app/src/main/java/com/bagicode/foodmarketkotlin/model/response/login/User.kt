package com.bagicode.foodmarketkotlin.model.response.login

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class User(
        @Expose
    @SerializedName("address")
    val address: String,
        @Expose
    @SerializedName("city")
    val city: String,
        @Expose
    @SerializedName("created_at")
    val created_at: Long,
        @Expose
    @SerializedName("current_team_id")
    val current_team_id: @RawValue Any,
        @Expose
    @SerializedName("email")
    val email: String,
        @Expose
    @SerializedName("email_verified_at")
    val email_verified_at: @RawValue Any,
        @Expose
    @SerializedName("houseNumber")
    val houseNumber: String,
        @Expose
    @SerializedName("id")
    val id: Int,
        @Expose
    @SerializedName("name")
    val name: String,
        @Expose
    @SerializedName("phoneNumber")
    val phoneNumber: String,
        @Expose
    @SerializedName("profile_photo_path")
    val profile_photo_path: String?,
        @Expose
    @SerializedName("profile_photo_url")
    val profile_photo_url: String?,
        @Expose
    @SerializedName("roles")
    val roles: String,
        @Expose
    @SerializedName("updated_at")
    val updated_at: Long
) : Parcelable