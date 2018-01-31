package fr.afaucogney.homedatagrapher.mobile.testtoothpick

import javax.inject.Inject

/**
 * Created by afaucogney on 31/01/2018.
 */
class Mockable @Inject constructor() {

    fun prout(int: Int) {
        println(this.javaClass.simpleName + " -> " + int.toString())
    }
}