package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import org.w3c.dom.Text;

public class TankStars extends ApplicationAdapter {
	SpriteBatch batch;

//		Game Screen
	Texture gameScreen;
	Texture loader;

//		Home Screen
	Texture homeScreen;
	Texture computerButton;
	Texture humanButton;
	Texture exitButton;

//		Load Screen
	Texture loadScreen;
	Texture loadBar;

//		Pause Screen
	Texture pauseScreen;
	Texture exitMenuButton;
	Texture restartMenuButton;
	Texture resumeMenuButton;

//		Battle Screen
	Texture battleScreen;
	Texture blueDotButton;
	Texture fireButton;
	Texture pauseButton;

//		Start Screen
	Texture startScreen;
	Texture startButton;
	Texture resumeButton;

//		TankChange
	Texture tankChange;


//		Saved Games
	Texture savedGames;
	Texture savedGame1;
	Texture savedGame2;
	Texture savedGame3;


	@Override
	public void create () {
		batch = new SpriteBatch();

//		Game Screen
		gameScreen = new Texture("GameScreen/gameScreen.png");
		loader = new Texture("GameScreen/loader.png");

//		Home Screen
		homeScreen = new Texture("HomeScreen/homeScreen.png");
		humanButton = new Texture("HomeScreen/humanButton.png");
		computerButton = new Texture("HomeScreen/computerButton.png");
		exitButton = new Texture("HomeScreen/exitButton.png");

//		Load Screen
		loadScreen = new Texture("LoadScreen/loadScreen.png");
		loadBar = new Texture("LoadScreen/loadBar.png");

//		Pause Screen
		pauseScreen = new Texture("PauseScreen/pauseScreen.png");
		resumeMenuButton = new Texture("PauseScreen/resumeMenuButton.png");
		restartMenuButton = new Texture("PauseScreen/restartMenuButton.png");
		exitMenuButton = new Texture("PauseScreen/exitMenuButton.png");

//		Battle Screen
		battleScreen = new Texture("BattleScreen/battleScreen.png");
		fireButton = new Texture("BattleScreen/fireButton.png");
		pauseButton = new Texture("BattleScreen/pauseButton.png");
		blueDotButton = new Texture("BattleScreen/blueDotButton.png");

//		Start Screen
		startScreen = new Texture("StartScreen/startScreen.png");
		resumeButton = new Texture("StartScreen/resumeButton.png");
		startButton = new Texture("StartScreen/startButton.png");

//		TankChange
		tankChange = new Texture("TankChange/tankChange.png");

//		Saved Games
		savedGames = new Texture("SavedGames/savedGames.png");
		savedGame1 = new Texture("SavedGames/savedGame1.png");
		savedGame2 = new Texture("SavedGames/savedGame2.png");
		savedGame3 = new Texture("SavedGames/savedGame3.png");

	}

	@Override
	public void render () {

//		Game Screen
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(gameScreen, 0, 0);
		batch.draw(loader, gameScreen.getWidth()/2 - 90, 25);
		batch.end();

//		Home Screen
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(homeScreen, 0, 0);
		batch.draw(humanButton, homeScreen.getWidth()/2 + 120, homeScreen.getHeight()/2);
		batch.draw(computerButton, homeScreen.getWidth()/2 + 120, homeScreen.getHeight()/3 - 50);
		batch.draw(exitButton, (int)(homeScreen.getWidth()/(1.215)), 0);
		batch.end();

//		Load Screen
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(loadScreen, 0, 0);
		batch.draw(loadBar, loadScreen.getWidth()/2 - 185, 25);
		batch.end();

//		Pause Screen
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		batch.draw(pauseScreen, 11, 0);
		batch.draw(resumeMenuButton, loadScreen.getWidth()/2 - 140, loadScreen.getHeight()/2 - 250);
		batch.draw(restartMenuButton, loadScreen.getWidth()/2 - 74, loadScreen.getHeight()/2 - 250);
		batch.draw(exitMenuButton, loadScreen.getWidth()/2 - 8, loadScreen.getHeight()/2 - 250);
		batch.end();

//		Battle Screen (One element remaining)
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(battleScreen, 0, 0);
		batch.draw(fireButton, (int)(battleScreen.getWidth()/(2.9)), battleScreen.getHeight()/33);
		batch.draw(pauseButton, battleScreen.getWidth()/40, (int)(battleScreen.getHeight()/(1.334)));
		batch.draw(blueDotButton, battleScreen.getWidth()/9, battleScreen.getHeight()/8);
		batch.end();

//		Start Screen
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(startScreen, 0, 0);
		batch.draw(resumeButton, homeScreen.getWidth()/2 + 120, homeScreen.getHeight()/2);
		batch.draw(startButton, homeScreen.getWidth()/2 + 120, homeScreen.getHeight()/3 - 50);
		batch.draw(exitButton, (int)(homeScreen.getWidth()/(1.215)), 0);
		batch.end();

//		Tank Change
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(tankChange, 0, 0);
		batch.draw(resumeButton, homeScreen.getWidth()/2 + 120, homeScreen.getHeight()/2);
		batch.draw(startButton, homeScreen.getWidth()/2 + 120, homeScreen.getHeight()/3 - 50);
		batch.draw(exitButton, (int)(homeScreen.getWidth()/(1.215)), 0);
		batch.end();

//		Saved Games
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(savedGames, 0, 0);
		batch.draw(savedGame1, homeScreen.getWidth()/2 + 70, homeScreen.getHeight()/2);
		batch.draw(savedGame2, homeScreen.getWidth()/2 + 70, homeScreen.getHeight()/3 - 5);
		batch.draw(savedGame3, homeScreen.getWidth()/2 + 70, homeScreen.getHeight()/7);
		batch.draw(exitButton, (int)(homeScreen.getWidth()/(1.215)), 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

//		Game Screen
		gameScreen.dispose();
		loader.dispose();

//		Home Screen
		homeScreen.dispose();
		humanButton.dispose();
		computerButton.dispose();
		exitButton.dispose();

//		Load Screen
		loadScreen.dispose();
		loadBar.dispose();

//		Pause Screen
		pauseScreen.dispose();
		resumeMenuButton.dispose();
		restartMenuButton.dispose();
		exitMenuButton.dispose();


//		Battle Screen
		battleScreen.dispose();
		fireButton.dispose();
		pauseButton.dispose();
		blueDotButton.dispose();

//		Start Screen
		startScreen.dispose();
		resumeButton.dispose();
		startButton.dispose();

//		TankChange
		tankChange.dispose();

//		Saved Games
		savedGames.dispose();
		savedGame1.dispose();
		savedGame2.dispose();
		savedGame3.dispose();

	}
}
