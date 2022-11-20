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
	TextureRegion startScreen_background;
	TextureRegion startScreen_tank;
	TextureRegion startScreen_platform;
	TextureRegion startButton;
	TextureRegion resumeButton;
	TextureRegion startScreen_tree;
	TextureRegion startScreen_muzzle;
	TextureRegion tankStarsLogo;


//	Home Screen
//	Copied some assets from Start Screen
	Texture computerButton;
	Texture playerButton;

//	Saved Games
//	Copied some assets from Start Screen
	Texture savedGame1;
	Texture savedGame2;
	Texture savedGame3;

//	Pause Screen
//	Copied some assets from Start Screen
	Texture pauseScreen_sprite;
	TextureRegion pauseScreen;
	TextureRegion restartMenuButton;
	TextureRegion resumeMenuButton;
	TextureRegion exitMenuButton;

//	Tank Change
//	Copied some assets from Start Screen
	Texture tankChange_sprite;
	Texture tankChange_platform;
	TextureRegion tankChange_tank;
	TextureRegion tankChange_leftArrow;
	TextureRegion tankChange_rightArrow;
	TextureRegion continueButton;


	@Override
	public void create () {
	batch = new SpriteBatch();

//	Game Screen
//		Remove the percentage elements using a timer
	game_screen_sprite = new Texture("GameScreen/gameScreenSprite.png");
	gameScreen = new TextureRegion(game_screen_sprite, 0, 0, 960, 540);

	tenpercent = new TextureRegion(gameScreen, 408, 540, 100 , 100);
	fifteenpercent = new TextureRegion(gameScreen, 0, 540, 100 , 100);
	twentypercent = new TextureRegion(gameScreen, 510, 540, 100 , 100);
	fiftypercent = new TextureRegion(gameScreen, 102, 540, 100 , 100);
	seventypercent = new TextureRegion(gameScreen, 306, 540, 100 , 100);
	hundredpercent = new TextureRegion(gameScreen, 204, 540, 100 , 100);

//	Loading Screen
//		Change ProgressBar, Remove the progress Bar using a timer
	load_screen_sprite = new Texture("LoadScreen/loadScreenSprite.png");
	loadScreen = new TextureRegion(load_screen_sprite, 0, 65, 960, 540);
	loadBar1 = new TextureRegion(load_screen_sprite, 0, 0, 60, 65);
	loadBar2 = new TextureRegion(load_screen_sprite, 67, 0, 64, 62);
	loadBar3 = new TextureRegion(load_screen_sprite, 133, 0, 63, 65);

//	Start Screen
//		Rotate Tank, Logo, Buttons
	startScreen_sprite = new Texture("StartScreen/startScreenSprite.png");
	startScreen_background = new TextureRegion(startScreen_sprite, 0, 0, 960, 540);
	startScreen_tank = new TextureRegion(startScreen_sprite, 146, 542, 190, 290);
	startScreen_platform = new TextureRegion(startScreen_sprite, 338, 542, 567, 136);
	startButton = new TextureRegion(startScreen_sprite, 338, 680,153, 268);
	resumeButton = new TextureRegion(startScreen_sprite, 493, 680, 152, 268);
	startScreen_tree = new TextureRegion(startScreen_sprite, 647, 680, 207,224);
	startScreen_muzzle = new TextureRegion(startScreen_sprite, 0, 851, 135, 77);
	tankStarsLogo = new TextureRegion(startScreen_sprite, 0, 542, 144, 307);

//	Home Screen
//		Rotate Tank and Logo
	computerButton = new Texture("HomeScreen/computerButton.png");
	playerButton = new Texture("HomeScreen/humanButton.png");

//	Saved Games
	savedGame1 = new Texture("SavedGames/savedGame1.png");
	savedGame2 = new Texture("SavedGames/savedGame2.png");
	savedGame3 = new Texture("SavedGames/savedGame3.png");

//  Pause Screen
//		Rotate Icons
	pauseScreen_sprite = new Texture("PauseScreen/pauseScreenSprite.png");
	pauseScreen = new TextureRegion(pauseScreen_sprite, 0,0, 960, 540);
	restartMenuButton = new TextureRegion(pauseScreen_sprite, 157, 540, 154, 155);
	resumeMenuButton = new TextureRegion(pauseScreen_sprite, 314, 540, 154, 155);
	exitMenuButton = new TextureRegion(pauseScreen_sprite, 0, 540, 154, 155);

//	Tank Change
//		Overlay muzzle, fix logo
	tankChange_sprite = new Texture("TankChange/tankChangeSprite.png");
	tankChange_tank = new TextureRegion(tankChange_sprite, 0, 542, 345, 197);
	tankChange_platform = new Texture("TankChange/platform.png");
	tankChange_leftArrow = new TextureRegion(tankChange_sprite, 731, 636, 56, 78);
	tankChange_rightArrow = new TextureRegion(tankChange_sprite, 789, 636, 56, 78);
	continueButton = new TextureRegion(tankChange_sprite, 731, 542, 212, 92);

	}



	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

//		Game Screen
		batch.draw(gameScreen, 0, 0);
		batch.draw(tenpercent, 841, 22);
		batch.draw(fifteenpercent, 841, 22);
		batch.draw(twentypercent, 841, 22);
		batch.draw(fiftypercent, 841, 22);
		batch.draw(seventypercent, 841, 22);
		batch.draw(hundredpercent, 841, 22);

//		Loading Screen
		batch.draw(loadScreen, 0, 0);
		batch.draw(loadBar1, 870, 20);
		batch.draw(loadBar2, 870, 20);
		batch.draw(loadBar3, 870, 20);

//		Start Screen
		batch.draw(startScreen_background, 0, 0);
		batch.draw(startScreen_tank, 155, 137);
		batch.draw(startScreen_platform, 0, 0);
		batch.draw(startButton, 639, 210);
		batch.draw(resumeButton, 639, 58);
		batch.draw(startScreen_tree, 445, 0);
		batch.draw(startScreen_muzzle, 413, 232);
		batch.draw(tankStarsLogo, 394, 349);


//		Home Screen
		batch.draw(startScreen_background, 0, 0);
		batch.draw(startScreen_tank, 155, 137);
		batch.draw(startScreen_platform, 0, 0);
		batch.draw(startScreen_tree, 445, 0);
		batch.draw(startScreen_muzzle, 413, 232);
		batch.draw(tankStarsLogo, 394, 349);
		batch.draw(playerButton, 639, 210);
		batch.draw(computerButton, 639, 58);

//		Saved Games
//		Fix tank, logo rotation
		batch.draw(startScreen_background, 0, 0);
		batch.draw(startScreen_tank, 155, 137);
		batch.draw(startScreen_platform, 0, 0);
		batch.draw(startScreen_tree, 445, 0);
		batch.draw(startScreen_muzzle, 413, 232);
		batch.draw(tankStarsLogo, 394, 349);
		batch.draw(savedGame1, 639, 210);
		batch.draw(savedGame2, 639, 140);
		batch.draw(savedGame3, 639, 70);

//		Tank Change
		batch.draw(startScreen_background, 0, 0);
		batch.draw(tankChange_platform, 0, 0);
		batch.draw(startScreen_muzzle, 610, 214);
		batch.draw(tankStarsLogo, 331, 355);
		batch.draw(tankChange_tank, 324, 116);
		batch.draw(tankChange_leftArrow, 230,200);
		batch.draw(tankChange_rightArrow, 777, 200);
		batch.draw(continueButton, 379, 0);

//		Pause Screen
		batch.draw(pauseScreen, 0 ,0);
		batch.draw(resumeMenuButton, 340, 30);
		batch.draw(restartMenuButton, 405, 30);
		batch.draw(exitMenuButton, 470, 30);

		batch.end();

	}

	@Override
	public void dispose () {
		batch.dispose();
	}

}
