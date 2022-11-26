package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class TankChangeScreen extends TankStarsScreen {
    private Texture tankChangePlayer1;
    private Texture tankChangePlayer2;
    private Texture tankChangeTank;
    private Texture tankChangeLeftArrow;
    private Texture tankChangeRightArrow;
    private Texture tankChangeMuzzle;
    private Texture tankChangeContinueButton;
    private Texture tankChangePlatform;
    private Texture startScreenSprite;
    private Texture exitButton;
    private Texture settings;

    private TextureRegion startScreenBackground;
    private TextureRegion tankStarsLogo;

    private Sprite tankStarsLogoSprite;

    private SpriteBatch batch;

    private Stage stage;
    private ImageButton.ImageButtonStyle continueButtonStyle;
    private ImageButton continueButton;

    public TankChangeScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        tankChangePlayer1 = new Texture("TankChange/Raw/player1.png");
        tankChangePlayer2 = new Texture("TankChange/Raw/player2.png");
        tankChangeTank = new Texture("TankChange/Raw/Tank.png");
        tankChangeLeftArrow = new Texture("TankChange/Raw/leftArrow.png");
        tankChangeRightArrow = new Texture("TankChange/Raw/rightArrow.png");
        tankChangeMuzzle = new Texture("TankChange/Raw/muzzle.png");
        tankChangeContinueButton = new Texture("TankChange/Raw/continueButton.png");
        tankChangePlatform = new Texture("TankChange/Raw/Platform.png");
        startScreenSprite = new Texture("StartScreen/startScreenSprite.png");
        exitButton = new Texture("StartScreen/Raw/exitButton.png");
        settings = new Texture("StartScreen/Raw/settings.png");

        startScreenBackground = new TextureRegion(startScreenSprite, 0, 0, 960, 540);
        tankStarsLogo = new TextureRegion(startScreenSprite, 0, 542, 144, 307);

        tankStarsLogoSprite = new Sprite(tankStarsLogo);
        tankStarsLogoSprite.setPosition(350, 480);
        tankStarsLogoSprite.setOrigin(tankStarsLogoSprite.getWidth()/2, tankStarsLogoSprite.getHeight()/2);
        tankStarsLogoSprite.setRotation(270);

        batch = new SpriteBatch();

        stage = new Stage();
        continueButtonStyle = new ImageButton.ImageButtonStyle();
        continueButtonStyle.up = new TextureRegionDrawable(new TextureRegion(tankChangeContinueButton));
        continueButtonStyle.down = new TextureRegionDrawable(new TextureRegion(tankChangeContinueButton));
        continueButton = new ImageButton(continueButtonStyle);
        continueButton.setPosition(400, 30);
        continueButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new BattleScreen(game));
            }
        });
        stage.addActor(continueButton);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        stage.act();
        batch.begin();

        batch.draw(startScreenBackground, 0, 0);
        batch.draw(tankChangePlayer1, 134, 306);
        batch.draw(tankChangePlayer2, 644, 296);
        // 352, 348
        batch.draw(tankStarsLogoSprite, 352, 520, 0, 0, tankStarsLogoSprite.getWidth(), tankStarsLogoSprite.getHeight(), 1, 1, tankStarsLogoSprite.getRotation());
        batch.draw(tankChangeLeftArrow, 40, 186);
        batch.draw(tankChangeLeftArrow, 518, 186);
        batch.draw(tankChangeRightArrow, 410, 186);
        batch.draw(tankChangeRightArrow, 870, 186);
        batch.draw(tankChangeTank, 126, 131);
        batch.draw(tankChangeTank, 625, 131);
        batch.draw(tankChangePlatform, 0, 0);
//        batch.draw(tankChangeContinueButton, 400, 30);
        batch.draw(settings, 29, 462);
        batch.draw(exitButton, 900, 20);

        batch.end();
        stage.draw();
    }

    @Override
    public void hide() {
        batch.dispose();
        tankChangePlayer1.dispose();
        tankChangePlayer2.dispose();
        tankChangeTank.dispose();
        tankChangeLeftArrow.dispose();
        tankChangeRightArrow.dispose();
        tankChangeMuzzle.dispose();
        tankChangeContinueButton.dispose();
        tankChangePlatform.dispose();
        startScreenSprite.dispose();
        exitButton.dispose();
        settings.dispose();

        stage.dispose();
    }

    @Override
    public void dispose() {

    }
}
