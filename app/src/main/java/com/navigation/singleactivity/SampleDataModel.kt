package com.navigation.singleactivity

import java.io.Serializable

data class SampleDataModel(
    val name: String,
    val family: String
) : Serializable {

    internal fun getFullName() = "$name $family"

}