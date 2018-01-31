package fr.afaucogney.homedatagrapher.mobile.testtoothpick

import javax.inject.Inject

/**
 * Created by afaucogney on 31/01/2018.
 */
class Foo @Inject constructor() {

    @Inject
    lateinit var mBar: Bar

    @Inject
    lateinit var mMockable: Mockable

    fun prout(string: String) {
        println("Foo " + string)
        val r = mBar.prout(string)
        mMockable.prout(r)
    }

}