package com.mahmood.galleryapp.sealed

sealed class DataStates {

    class Data (val images : MutableList<String>) : DataStates()

    class Failure (val message : String) : DataStates()

    object Empty : DataStates()
    object Loading : DataStates()
}