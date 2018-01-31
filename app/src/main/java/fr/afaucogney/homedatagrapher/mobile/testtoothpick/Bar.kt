package fr.afaucogney.homedatagrapher.mobile.testtoothpick

import javax.inject.Inject

/**
 * Created by afaucogney on 31/01/2018.
 */
class Bar @Inject constructor() {

    @Inject
    lateinit var mPub: Pub


    fun prout(string: String): Int {
        println("Bar @ " + string)
        return mPub.prout(string)
    }
}