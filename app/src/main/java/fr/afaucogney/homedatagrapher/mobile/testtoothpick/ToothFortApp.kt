package fr.afaucogney.homedatagrapher.mobile.testtoothpick

import android.app.Application
import toothpick.Toothpick
import toothpick.smoothie.module.SmoothieApplicationModule

/**
 * Created by afaucogney on 31/01/2018.
 */
class ToothFortApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val appScope = Toothpick.openScope(this)
        appScope.installModules(SmoothieApplicationModule(this))
    }
}