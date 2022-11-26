package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

public class SavedGamesScreen extends TankStarsScreen {
    private Texture savedGame1;
    private Texture savedGame2;
    private Texture savedGame3;
    private Texture startScreenSprite;
    private Texture exitButton;
    private Texture settings;

    private TextureRegion startScreenBackground;
    private TextureRegion startScreenTank;
    private TextureRegion startScreenPlatform;
    private TextureRegion startScreenTree;
    private TextureRegion startScreenMuzzle;
    private TextureRegion tankStarsLogo;

    private Sprite startScreenTankSprite;
    private Sprite tankStarsLogoSprite;

    private SpriteBatch batch;
    private ImageButton.ImageButtonStyle savedGame1Style;
    private ImageButton.ImageButtonStyle savedGame2Style;
    private ImageButton.ImageButtonStyle savedGame3Style;
    private ImageButton savedGame1Button;
    private ImageButton savedGame2Button;
    private ImageButton savedGame3Button;

    public SavedGamesScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        savedGame1 = new Texture("SavedGames/savedGame1.png");
        savedGame2 = new Texture("SavedGames/savedGame2.png");
        savedGame3 = new Texture("SavedGames/savedGame3.png");
        startScreenSprite = new Texture("StartScreen/startScreenSprite.png");
        exitButton = new Texture("StartScreen/Raw/exitButton.png");
        settings = new Texture("StartScreen/Raw/settings.png");

        startScreenBackground = new TextureRegion(startScreenSprite, 0, 0, 960, 540);
        startScreenTank = new TextureRegion(startScreenSprite, 146, 542, 190, 290);
        startScreenPlatform = new TextureRegion(startScreenSprite, 338, 542, 567, 136);
        startScreenTree = new TextureRegion(startScreenSprite, 647, 680, 207,224);
        startScreenMuzzle = new TextureRegion(startScreenSprite, 0, 851, 135, 77);
        tankStarsLogo = new TextureRegion(startScreenSprite, 0, 542, 144, 307);

        startScreenTankSprite = new Sprite(startScreenTank);
        startScreenTankSprite.setPosition(105, 317);
        startScreenTankSprite.setOrigin(startScreenTankSprite.getWidth()/2, startScreenTankSprite.getHeight()/2);
        startScreenTankSprite.setRotation(270);

        tankStarsLogoSprite = new Sprite(tankStarsLogo);
        tankStarsLogoSprite.setPosition(350, 480);
        tankStarsLogoSprite.setOrigin(tankStarsLogoSprite.getWidth()/2, tankStarsLogoSprite.getHeight()/2);
        tankStarsLogoSprite.setRotation(270);

        batch = new SpriteBatch();
    }
    public void render(float delta) {
        batch.begin();

        batch.draw(startScreenBackground, 0, 0);
        batch.draw(startScreenTankSprite, startScreenTankSprite.getX(), startScreenTankSprite.getY(), 0, 0, startScreenTankSprite.getWidth(), startScreenTankSprite.getHeight(), 1, 1, startScreenTankSprite.getRotation());
        batch.draw(startScreenPlatform, 0, 0);
        batch.draw(startScreenTree, 445, 0);
        batch.draw(startScreenMuzzle, 353, 225);
        batch.draw(tankStarsLogoSprite, tankStarsLogoSprite.getX(), tankStarsLogoSprite.getY(), 0, 0, tankStarsLogoSprite.getWidth(), tankStarsLogoSprite.getHeight(), 1, 1, tankStarsLogoSprite.getRotation());
        batch.draw(savedGame1, 639, 238);
        batch.draw(savedGame2, 639, 140);
        batch.draw(savedGame3, 639, 43);
        batch.draw(settings, 29, 462);
        batch.draw(exitButton, 900, 20);

        batch.end();
    }
    @Override
    public void hide() {
        batch.dispose();
        savedGame1.dispose();
        savedGame2.dispose();
        savedGame3.dispose();
        startScreenSprite.dispose();
        exitButton.dispose();
        settings.dispose();
    }
    @Override
    public void dispose() {
    }
}
