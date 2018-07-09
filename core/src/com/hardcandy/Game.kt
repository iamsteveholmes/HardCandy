package com.hardcandy

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.hardcandy.state.GameStateManager
import com.hardcandy.state.MenuState

class Game : ApplicationAdapter() {
    companion object {
        val WIDTH = 480
        val HEIGHT = 800
        val TITLE = "Hard Candy"
    }
    private val gameStateManager by lazy { GameStateManager() }
    private val spriteBatch by lazy { SpriteBatch() }
    private val runningAtlas by lazy { TextureAtlas("running.txt") }
    private val rollJumpAtlas by lazy { TextureAtlas("roll_jump.txt")}
    private val runningAnimation by lazy { Animation<TextureRegion>(0.0166f, runningAtlas.regions, Animation.PlayMode.LOOP) }
    private val rollJumpAnimation by lazy { Animation<TextureRegion>(0.033f, rollJumpAtlas.regions, Animation.PlayMode.LOOP) }
    private var stateTime = 0f

    override fun create() {
        super.create()
//        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
//        gameStateManager.push(MenuState(gameStateManager))
    }

    override fun render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        stateTime += Gdx.graphics.deltaTime

        spriteBatch.begin()
        spriteBatch.draw(runningAnimation.getKeyFrame(stateTime,true), 50f, 50f)
        spriteBatch.end()
//        gameStateManager.update(Gdx.graphics.deltaTime)
//        gameStateManager.render(spriteBatch)
    }

    override fun dispose() {
        spriteBatch.dispose()
    }
}
