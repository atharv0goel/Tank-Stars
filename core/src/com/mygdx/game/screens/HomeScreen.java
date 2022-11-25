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

public class HomeScreen extends TankStarsScreen {
        private Texture startScreenSprite;
        private Texture exitButton;
        private Texture settings;
        
        private TextureRegion startScreenBackground;
        private TextureRegion startScreenTank;
        private TextureRegion startScreenPlatform;
        private TextureRegion startScreenTree;
        private TextureRegion startScreenMuzzle;
        private TextureRegion tankStarsLogo;
        private TextureRegion startButtonTexture;
        private TextureRegion resumeButtonTexture;

        private Sprite startScreenTankSprite;
        private Sprite startButtonSprite;
        private Sprite resumeButtonSprite;
        private Sprite tankStarsLogoSprite;

        private SpriteBatch batch;

        private Stage stage;
        private ImageButton.ImageButtonStyle startButtonStyle;
        private ImageButton.ImageButtonStyle resumeButtonStyle;
        private ImageButton startButton;
        private ImageButton resumeButton;
        public HomeScreen(Game game) {
            super(game);
        }

        @Override
        public void show() {
            startScreenSprite = new Texture("StartScreen/startScreenSprite.png");
            exitButton = new Texture("StartScreen/Raw/exitButton.png");
            settings = new Texture("StartScreen/Raw/settings.png");
            
            startScreenBackground = new TextureRegion(startScreenSprite, 0, 0, 960, 540);
            startScreenTank = new TextureRegion(startScreenSprite, 146, 542, 190, 290);
            startScreenPlatform = new TextureRegion(startScreenSprite, 338, 542, 567, 136);
            startButtonTexture = new TextureRegion(startScreenSprite, 338, 680,153, 268);
            resumeButtonTexture = new TextureRegion(startScreenSprite, 493, 680, 152, 268);
            startScreenTree = new TextureRegion(startScreenSprite, 647, 680, 207,224);
            startScreenMuzzle = new TextureRegion(startScreenSprite, 0, 851, 135, 77);
            tankStarsLogo = new TextureRegion(startScreenSprite, 0, 542, 144, 307);

            startScreenTankSprite = new Sprite(startScreenTank);
            startScreenTankSprite.setPosition(105, 317);
            startScreenTankSprite.setOrigin(startScreenTankSprite.getWidth()/2, startScreenTankSprite.getHeight()/2);
            startScreenTankSprite.setRotation(270);

            startButtonSprite = new Sprite(startButtonTexture);
            startButtonSprite.setPosition(360, 480);
            startButtonSprite.setOrigin(startButtonSprite.getWidth()/2, startButtonSprite.getHeight()/2);
            startButtonSprite.setRotation(270);

            resumeButtonSprite = new Sprite(resumeButtonTexture);
            resumeButtonSprite.setPosition(360, 480);
            resumeButtonSprite.setOrigin(resumeButtonSprite.getWidth()/2, resumeButtonSprite.getHeight()/2);
            resumeButtonSprite.setRotation(270);

            tankStarsLogoSprite = new Sprite(tankStarsLogo);
            tankStarsLogoSprite.setPosition(350, 480);
            tankStarsLogoSprite.setOrigin(tankStarsLogoSprite.getWidth()/2, tankStarsLogoSprite.getHeight()/2);
            tankStarsLogoSprite.setRotation(270);

            batch = new SpriteBatch();

            stage = new Stage();
            startButtonStyle = new ImageButton.ImageButtonStyle();
            startButtonStyle.up = new TextureRegionDrawable(startButtonSprite);
            startButtonStyle.down = new TextureRegionDrawable(startButtonSprite);
            resumeButtonStyle = new ImageButton.ImageButtonStyle();
            resumeButtonStyle.up = new TextureRegionDrawable(resumeButtonSprite);
            resumeButtonStyle.down = new TextureRegionDrawable(resumeButtonSprite);
            ImageButton startButton = new ImageButton(startButtonStyle);
            startButton.setTransform(true);
            startButton.setPosition(710, 190);
            startButton.setOrigin(startButton.getWidth()/2, startButton.getHeight()/2);
            startButton.setRotation(270);

            startButton.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    game.setScreen(new StartScreen(game));
                }
            });

            stage.addActor(startButton);
            ImageButton resumeButton = new ImageButton(resumeButtonStyle);
            resumeButton.setTransform(true);
            resumeButton.setPosition(710, 58);
            resumeButton.setOrigin(resumeButton.getWidth()/2, resumeButton.getHeight()/2);
            resumeButton.setRotation(270);
            resumeButton.addListener(new ClickListener() {
                @Override
                public void clicked(InputEvent event, float x, float y) {
                    game.setScreen(new SavedGamesScreen(game));
                }
            });
            stage.addActor(resumeButton);
            Gdx.input.setInputProcessor(stage);

        }

        @Override
        public void render(float delta) {
            stage.act(delta);
            batch.begin();

            batch.draw(startScreenBackground, 0, 0);
            batch.draw(startScreenTankSprite, startScreenTankSprite.getX(), startScreenTankSprite.getY(), 0, 0, startScreenTankSprite.getWidth(), startScreenTankSprite.getHeight(), 1, 1, startScreenTankSprite.getRotation());
            batch.draw(startScreenPlatform, 0, 0);
//            batch.draw(startButtonSprite, 650, 400, 0, 0, startButtonSprite.getWidth(), startButtonSprite.getHeight(), 1, 1, startButtonSprite.getRotation());
//            batch.draw(resumeButtonSprite, 650, 280, 0, 0, resumeButtonSprite.getWidth(), resumeButtonSprite.getHeight(), 1, 1, resumeButtonSprite.getRotation());
            batch.draw(startScreenTree, 445, 0);
            batch.draw(startScreenMuzzle, 353, 225);
            batch.draw(tankStarsLogoSprite, tankStarsLogoSprite.getX(), tankStarsLogoSprite.getY(), 0, 0, tankStarsLogoSprite.getWidth(), tankStarsLogoSprite.getHeight(), 1, 1, tankStarsLogoSprite.getRotation());
            batch.draw(settings, 29, 462);
            batch.draw(exitButton, 900, 20);

            batch.end();
            stage.draw();
        }

        @Override
        public void hide() {
            batch.dispose();
            startScreenSprite.dispose();
            exitButton.dispose();
            settings.dispose();
            startScreenTankSprite.getTexture().dispose();
            startButtonSprite.getTexture().dispose();
            resumeButtonSprite.getTexture().dispose();
            tankStarsLogoSprite.getTexture().dispose();
            stage.dispose();
        }

        @Override
        public void dispose() {
        }
}
