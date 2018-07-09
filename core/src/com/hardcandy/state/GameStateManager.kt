package com.hardcandy.state

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import java.util.*

class GameStateManager(deque: Deque<State> = LinkedList<State>()): Deque<State> by deque {
    fun set(state: State) {
        pop()
        push(state)
    }

    fun update(deltaTime: Float) {
        peek().update(deltaTime)
    }

    fun render(spriteBatch: SpriteBatch) {
        peek().render(spriteBatch)
    }
}
