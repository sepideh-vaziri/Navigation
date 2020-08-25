package com.navigation.singleactivity

import androidx.annotation.Keep
import java.io.Serializable

@Keep
data class SampleDataModel(
    val name: String,
    val family: String
) : Serializable {

    internal fun getFullName() = "$name $family"

}