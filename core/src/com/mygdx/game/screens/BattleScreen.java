package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BattleScreen extends TankStarsScreen {
    private Texture battleScreenImage;
    private SpriteBatch batch;
    public BattleScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        battleScreenImage = new Texture("BattleScreen/BattleScreen.png");
        batch = new SpriteBatch();
    }
    @Override
    public void render(float delta) {
        batch.begin();
        batch.draw(battleScreenImage, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();
    }
    @Override
    public void hide() {
        batch.dispose();
        battleScreenImage.dispose();
    }
    @Override
    public void dispose() {

    }
}
