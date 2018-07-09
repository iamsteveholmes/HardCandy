package com.hardcandy.state

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3

abstract class State(val gameStateManager: GameStateManager) {

    val camera: OrthographicCamera by lazy { OrthographicCamera() }
    val mouse: Vector3 by lazy { Vector3() }

    abstract fun handleInput()
    abstract fun update(deltaTime: Float)
    abstract fun render(spriteBatch: SpriteBatch)
}
