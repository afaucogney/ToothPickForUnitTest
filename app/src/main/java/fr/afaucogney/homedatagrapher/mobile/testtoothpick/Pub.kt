package fr.afaucogney.homedatagrapher.mobile.testtoothpick

import javax.inject.Inject

/**
 * Created by afaucogney on 31/01/2018.
 */
class Pub @Inject constructor() {

    fun prout(string: String): Int {
        println("Pub @ " + string)
        return string.toInt()
    }

}