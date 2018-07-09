package com.hardcandy.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.hardcandy.Game

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.width = Game.WIDTH
        config.height = Game.HEIGHT
        config.title = Game.TITLE
        LwjglApplication(Game(), config)
    }
}
