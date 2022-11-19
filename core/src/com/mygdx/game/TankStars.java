package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class TankStars extends ApplicationAdapter {

	SpriteBatch batch;

//	Game Screen
	Texture game_screen_sprite;
	TextureRegion gameScreen;
	TextureRegion tenpercent;
	TextureRegion fifteenpercent;
	TextureRegion twentypercent;
	TextureRegion fiftypercent;
	TextureRegion seventypercent;
	TextureRegion hundredpercent;

//	Load Screen
	Texture load_screen_sprite;
	TextureRegion loadScreen;
	TextureRegion loadBar1;
	TextureRegion loadBar2;
	TextureRegion loadBar3;


//	Start Screen

	Texture startScreen_sprite;
	TextureRegion startScreen;
	TextureRegion startButton;
	TextureRegion resumeButton;

//	Home Screen
	Texture homeScreen_sprite;
	TextureRegion homeScreen;
	TextureRegion computerButton;
	TextureRegion playerButton;

//	Saved Games
	Texture savedGames_sprite;
	TextureRegion savedGames;
	TextureRegion savedGame;

//	Pause Screen
	Texture pauseScreen_sprite;
	TextureRegion pauseScreen;
	TextureRegion restartMenuButton;
	TextureRegion resumeMenuButton;
	TextureRegion exitMenuButton;

//	Tank Change
	Texture tankChange_sprite;
	TextureRegion tankChange;
	TextureRegion continueButton;

	@Override
	public void create () {
	batch = new SpriteBatch();
//		Game Screen

	game_screen_sprite = new Texture("GameScreen/gameScreenSprite.png");
	gameScreen = new TextureRegion(game_screen_sprite, 0, 0, 960, 540);

	tenpercent = new TextureRegion(gameScreen, 408, 540, 100 , 100);
	fifteenpercent = new TextureRegion(gameScreen, 0, 540, 100 , 100);
	twentypercent = new TextureRegion(gameScreen, 510, 540, 100 , 100);
	fiftypercent = new TextureRegion(gameScreen, 102, 540, 100 , 100);
	seventypercent = new TextureRegion(gameScreen, 306, 540, 100 , 100);
	hundredpercent = new TextureRegion(gameScreen, 204, 540, 100 , 100);

//	Loading Screen
	load_screen_sprite = new Texture("LoadScreen/loadScreenSprite.png");
	loadScreen = new TextureRegion(load_screen_sprite, 0, 102, 960, 540);
	loadBar1 = new TextureRegion(load_screen_sprite, 0, 0, 300, 100);
	loadBar2 = new TextureRegion(load_screen_sprite, 302, 0, 300, 100);
	loadBar3 = new TextureRegion(load_screen_sprite, 604, 0, 300, 100);

//	Start Screen
	startScreen_sprite = new Texture("StartScreen/startScreenSprite.png");
	startScreen = new TextureRegion(startScreen_sprite, 0, 0, 960, 540);
	startButton = new TextureRegion(startScreen_sprite, 0, 541, 342, 180);
	resumeButton = new TextureRegion(startScreen_sprite, 344, 541, 342, 179);

//	Home Screen
	homeScreen_sprite = new Texture("HomeScreen/homeScreenSprite.png");
	homeScreen = new TextureRegion(homeScreen_sprite, 0, 0, 960, 540);
	computerButton = new TextureRegion(homeScreen_sprite, 0, 541, 342, 180);
	playerButton = new TextureRegion(homeScreen_sprite, 344, 541, 342, 179);

//	Saved Games
	savedGames_sprite = new Texture("SavedGames/savedGamesScreenSprite.png");
	savedGames = new TextureRegion(savedGames_sprite, 0,0, 960, 540);
	savedGame = new TextureRegion(savedGames_sprite, 0, 541, 433, 209);

//  Pause Screen
	pauseScreen_sprite = new Texture("PauseScreen/pauseScreenSprite.png");
	pauseScreen = new TextureRegion(pauseScreen_sprite, 0,0, 960, 540);
	restartMenuButton = new TextureRegion(pauseScreen_sprite, 157, 540, 154, 155);
	resumeMenuButton = new TextureRegion(pauseScreen_sprite, 314, 540, 154, 155);
	exitMenuButton = new TextureRegion(pauseScreen_sprite, 0, 540, 154, 155);

//	Tank Change
	tankChange_sprite = new Texture("TankChange/tankChangeSprite.png");
	tankChange = new TextureRegion(tankChange_sprite, 0, 0, 960, 540);
	continueButton = new TextureRegion(tankChange_sprite, 0, 542, 342, 180);

	}



	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

//		Game Screen
		batch.draw(gameScreen, 0, 0);

//		Remove them one by one
		batch.draw(tenpercent, 841, 22);
		batch.draw(fifteenpercent, 841, 22);
		batch.draw(twentypercent, 841, 22);
		batch.draw(fiftypercent, 841, 22);
		batch.draw(seventypercent, 841, 22);
		batch.draw(hundredpercent, 841, 22);

//		Loading Screen
		batch.draw(loadScreen, 0, 0);
		batch.draw(loadBar1, 325, -5);
		batch.draw(loadBar2, 325, -5);
		batch.draw(loadBar3, 325, -5);

//		Start Screen
		batch.draw(startScreen, 0, 0);
		batch.draw(startButton, (int)(startScreen.getRegionWidth()/(1.6)), (int)(startScreen.getRegionHeight()/2));
		batch.draw(resumeButton, (int)(startScreen.getRegionWidth()/(1.6)), (int)(startScreen.getRegionHeight()/5));

//		Home Screen
		batch.draw(homeScreen, 0, 0);
		batch.draw(computerButton, 595,285);
		batch.draw(playerButton, 595, 120);

//		Saved Games
		batch.draw(savedGames, 0, 0);
		batch.draw(savedGame, 550, 285);
		batch.draw(savedGame, 550, 175);
		batch.draw(savedGame, 550, 65);


//		Pause Screen
		batch.draw(pauseScreen, 0 ,0);
		batch.draw(resumeMenuButton, 340, 30);
		batch.draw(restartMenuButton, 405, 30);
		batch.draw(exitMenuButton, 470, 30);

//		Tank Change
		batch.draw(tankChange, 0, 0);
		batch.draw(tankChange, 551, 0);
		batch.draw(continueButton, 340, -22);

		batch.end();

	}

	@Override
	public void dispose () {
		batch.dispose();
	}

}
