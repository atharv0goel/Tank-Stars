package com.mygdx.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class StartScreen extends TankStarsScreen {
    private TextureRegion startScreenBackground;
    private TextureRegion startScreenTank;
    private TextureRegion startScreenPlatform;
    private TextureRegion startScreenTree;
    private TextureRegion startScreenMuzzle;
    private TextureRegion tankStarsLogo;

    private Texture startScreenSprite;
    private Texture playerButton;
    private Texture computerButton;
    private Texture settings;
    private Texture exitButton;

    private Sprite startScreenTankSprite;
    private Sprite tankStarsLogoSprite;

    private SpriteBatch batch;
    private float time = 0;

    private Stage stage;
    private ImageButton.ImageButtonStyle playerButtonStyle;
    private ImageButton.ImageButtonStyle computerButtonStyle;

    public StartScreen(Game game) {
        super(game);
    }

    @Override
    public void show() {
        startScreenSprite = new Texture("StartScreen/startScreenSprite.png");
        playerButton = new Texture("HomeScreen/humanButton.png");
        computerButton = new Texture("HomeScreen/computerButton.png");
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
        startScreenTankSprite.setOrigin(startScreenTankSprite.getWidth() / 2, startScreenTankSprite.getHeight() / 2);
        startScreenTankSprite.setRotation(270);

        tankStarsLogoSprite = new Sprite(tankStarsLogo);
        tankStarsLogoSprite.setPosition(350, 480);
        tankStarsLogoSprite.setOrigin(tankStarsLogoSprite.getWidth()/2, tankStarsLogoSprite.getHeight()/2);
        tankStarsLogoSprite.setRotation(270);

        batch = new SpriteBatch();

        stage = new Stage();
        playerButtonStyle = new ImageButton.ImageButtonStyle();
        playerButtonStyle.up = new TextureRegionDrawable(new TextureRegion(playerButton));
        playerButtonStyle.down = new TextureRegionDrawable(new TextureRegion(playerButton));
        computerButtonStyle = new ImageButton.ImageButtonStyle();
        computerButtonStyle.up = new TextureRegionDrawable(new TextureRegion(computerButton));
        computerButtonStyle.down = new TextureRegionDrawable(new TextureRegion(computerButton));

        ImageButton playerButton = new ImageButton(playerButtonStyle);
        playerButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new TankChangeScreen(game));
            }
        });
        playerButton.setPosition(620, 210);
        stage.addActor(playerButton);
        ImageButton computerButton = new ImageButton(computerButtonStyle);
        computerButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new TankChangeScreen(game));
            }
        });
        computerButton.setPosition(620, 58);
        stage.addActor(computerButton);

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(delta);

        batch.begin();

		batch.draw(startScreenBackground, 0, 0);
		batch.draw(startScreenTankSprite, startScreenTankSprite.getX(), startScreenTankSprite.getY(), 0, 0, startScreenTankSprite.getWidth(), startScreenTankSprite.getHeight(), 1, 1, startScreenTankSprite.getRotation());
		batch.draw(startScreenPlatform, 0, 0);
		batch.draw(startScreenTree, 445, 0);
		batch.draw(startScreenMuzzle, 353, 225);
		batch.draw(tankStarsLogoSprite, tankStarsLogoSprite.getX(), tankStarsLogoSprite.getY(), 0, 0, tankStarsLogoSprite.getWidth(), tankStarsLogoSprite.getHeight(), 1, 1, tankStarsLogoSprite.getRotation());
//		batch.draw(playerButton, 620, 210);
//		batch.draw(computerButton, 620, 58);
		batch.draw(settings, 29, 462);
		batch.draw(exitButton, 900, 20);
        batch.end();
        stage.draw();
    }

    @Override
    public void hide() {
        batch.dispose();
        startScreenSprite.dispose();
        playerButton.dispose();
        computerButton.dispose();
        settings.dispose();
        exitButton.dispose();

        stage.dispose();
    }

    @Override
    public void dispose() {
    }
}
