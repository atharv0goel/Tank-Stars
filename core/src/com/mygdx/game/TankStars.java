package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import org.w3c.dom.Text;

public class TankStars extends ApplicationAdapter {

	SpriteBatch batch;

//	Game Screen
	Texture GameScreenSprite;
	TextureRegion gameScreen;
	TextureRegion tenPercent;
	TextureRegion fifteenPercent;
	TextureRegion twentyPercent;
	TextureRegion fiftyPercent;
	TextureRegion seventyPercent;
	TextureRegion hundredPercent;

//	Load Screen
	Texture LoadScreenSprite;
	TextureRegion loadScreen;
	TextureRegion loadBar1;
	TextureRegion loadBar2;
	TextureRegion loadBar3;


//	Start Screen

	Texture StartScreenSprite;
	TextureRegion startScreenBackground;
	TextureRegion startScreenTank;
	TextureRegion startScreenPlatform;
	TextureRegion startScreenTree;
	TextureRegion startScreenMuzzle;
	TextureRegion tankStarsLogo;
	TextureRegion startButton;
	TextureRegion resumeButton;
	Texture exitButton;
	Texture settings;


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
	Texture PauseScreenSprite;
	TextureRegion pauseScreen;
	TextureRegion restartMenuButton;
	TextureRegion resumeMenuButton;
	TextureRegion exitMenuButton;

//	Tank Change
//	Copied some assets from Start Screen
	Texture TankChangePlayer1;
	Texture TankChangePlayer2;
	Texture TankChangeTank;
	Texture TankChangeLeftArrow;
	Texture TankChangeRightArrow;
	Texture TankChangeMuzzle;
	Texture TankChangeContinueButton;
	Texture TankChangePlatform;

//	Battle Screen
	Texture BattleScreenSprite;
	TextureRegion battleScreenBackground;
	TextureRegion battleScreenPlatform;
	TextureRegion tank1;
	TextureRegion tank2;
	TextureRegion earth;
	TextureRegion whitePlanet;
	TextureRegion redPlanet;
	TextureRegion rock;
	TextureRegion superNova;
	TextureRegion healthBar;
	TextureRegion logo;
	TextureRegion player1Text;
	TextureRegion player2Text;



	@Override
	public void create () {
	batch = new SpriteBatch();

//	Game Screen
//		Remove the percentage elements using a timer
	GameScreenSprite = new Texture("GameScreen/gameScreenSprite.png");
	gameScreen = new TextureRegion(GameScreenSprite, 0, 0, 960, 540);

	tenPercent = new TextureRegion(gameScreen, 408, 540, 100 , 100);
	fifteenPercent = new TextureRegion(gameScreen, 0, 540, 100 , 100);
	twentyPercent = new TextureRegion(gameScreen, 510, 540, 100 , 100);
	fiftyPercent = new TextureRegion(gameScreen, 102, 540, 100 , 100);
	seventyPercent = new TextureRegion(gameScreen, 306, 540, 100 , 100);
	hundredPercent = new TextureRegion(gameScreen, 204, 540, 100 , 100);

//	Loading Screen
//		Change ProgressBar, Remove the progress Bar using a timer
	LoadScreenSprite = new Texture("LoadScreen/loadScreenSprite.png");
	loadScreen = new TextureRegion(LoadScreenSprite, 0, 65, 960, 540);
	loadBar1 = new TextureRegion(LoadScreenSprite, 0, 0, 60, 65);
	loadBar2 = new TextureRegion(LoadScreenSprite, 67, 0, 64, 62);
	loadBar3 = new TextureRegion(LoadScreenSprite, 133, 0, 63, 65);

//	Start Screen
//		Rotate Tank, Logo, Buttons
	StartScreenSprite = new Texture("StartScreen/startScreenSprite.png");
	startScreenBackground = new TextureRegion(StartScreenSprite, 0, 0, 960, 540);
	startScreenTank = new TextureRegion(StartScreenSprite, 146, 542, 190, 290);
	startScreenPlatform = new TextureRegion(StartScreenSprite, 338, 542, 567, 136);
	startButton = new TextureRegion(StartScreenSprite, 338, 680,153, 268);
	resumeButton = new TextureRegion(StartScreenSprite, 493, 680, 152, 268);
	startScreenTree = new TextureRegion(StartScreenSprite, 647, 680, 207,224);
	startScreenMuzzle = new TextureRegion(StartScreenSprite, 0, 851, 135, 77);
	tankStarsLogo = new TextureRegion(StartScreenSprite, 0, 542, 144, 307);
	exitButton = new Texture("StartScreen/Raw/exitButton.png");
	settings = new Texture("StartScreen/Raw/settings.png");

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
	PauseScreenSprite = new Texture("PauseScreen/pauseScreenSprite.png");
	pauseScreen = new TextureRegion(PauseScreenSprite, 0,0, 960, 540);
	restartMenuButton = new TextureRegion(PauseScreenSprite, 157, 540, 154, 155);
	resumeMenuButton = new TextureRegion(PauseScreenSprite, 314, 540, 154, 155);
	exitMenuButton = new TextureRegion(PauseScreenSprite, 0, 540, 154, 155);

//	Tank Change
//		Overlay muzzle, fix logo
	TankChangePlayer1 = new Texture("TankChange/Raw/player1.png");
	TankChangePlayer2 = new Texture("TankChange/Raw/player2.png");
	TankChangeTank = new Texture("TankChange/Raw/Tank.png");
	TankChangeLeftArrow = new Texture("TankChange/Raw/leftArrow.png");
	TankChangeRightArrow = new Texture("TankChange/Raw/rightArrow.png");
	TankChangeMuzzle = new Texture("TankChange/Raw/muzzle.png");
	TankChangeContinueButton = new Texture("TankChange/Raw/continueButton.png");
	TankChangePlatform = new Texture("TankChange/Raw/Platform.png");

//	Battle Screen
	BattleScreenSprite = new Texture("BattleScreen/BattleScreenSprite.png");
	battleScreenBackground = new TextureRegion(BattleScreenSprite, 0, 0, 960, 540);
	battleScreenPlatform = new TextureRegion(BattleScreenSprite, 0, 542, 960, 119);
	tank1 = new TextureRegion(BattleScreenSprite, 0, 663, 203, 283);
	tank2 = new TextureRegion(BattleScreenSprite, 205, 663, 307, 161);
	earth = new TextureRegion(BattleScreenSprite, 763, 773, 153, 156);
	whitePlanet = new TextureRegion(BattleScreenSprite, 484, 826, 128, 86);
	redPlanet = new TextureRegion(BattleScreenSprite, 205, 873, 81, 67);
	rock = new TextureRegion(BattleScreenSprite, 514, 663, 223, 138);
	superNova = new TextureRegion(BattleScreenSprite, 739, 663, 108, 99);
	healthBar = new TextureRegion(BattleScreenSprite, 205, 826, 277, 45);
	logo = new TextureRegion(BattleScreenSprite, 612, 803, 149, 147);
	player1Text = new TextureRegion(BattleScreenSprite, 288, 873, 26, 77);
	player2Text = new TextureRegion(BattleScreenSprite, 316, 873, 19, 73);

	}



	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

//		Game Screen
		batch.draw(gameScreen, 0, 0);
		batch.draw(tenPercent, 841, 22);
		batch.draw(fifteenPercent, 841, 22);
		batch.draw(twentyPercent, 841, 22);
		batch.draw(fiftyPercent, 841, 22);
		batch.draw(seventyPercent, 841, 22);
		batch.draw(hundredPercent, 841, 22);

//		Loading Screen
		batch.draw(loadScreen, 0, 0);
		batch.draw(loadBar1, 870, 20);
		batch.draw(loadBar2, 870, 20);
		batch.draw(loadBar3, 870, 20);

//		Start Screen
		batch.draw(startScreenBackground, 0, 0);
		batch.draw(startScreenTank, 155, 137);
		batch.draw(startScreenPlatform, 0, 0);
		batch.draw(startButton, 639, 210);
		batch.draw(resumeButton, 639, 58);
		batch.draw(startScreenTree, 445, 0);
		batch.draw(startScreenMuzzle, 413, 232);
		batch.draw(tankStarsLogo, 394, 349);
		batch.draw(settings, 29, 462);
		batch.draw(exitButton, 900, 20);


//		Home Screen
		batch.draw(startScreenBackground, 0, 0);
		batch.draw(startScreenTank, 155, 137);
		batch.draw(startScreenPlatform, 0, 0);
		batch.draw(startScreenTree, 445, 0);
		batch.draw(startScreenMuzzle, 413, 232);
		batch.draw(tankStarsLogo, 394, 349);
		batch.draw(playerButton, 620, 210);
		batch.draw(computerButton, 620, 58);
		batch.draw(settings, 29, 462);
		batch.draw(exitButton, 900, 20);


//		Saved Games
//		Fix tank, logo rotation
		batch.draw(startScreenBackground, 0, 0);
		batch.draw(startScreenTank, 155, 137);
		batch.draw(startScreenPlatform, 0, 0);
		batch.draw(startScreenTree, 445, 0);
		batch.draw(startScreenMuzzle, 413, 232);
		batch.draw(tankStarsLogo, 394, 349);
		batch.draw(savedGame1, 639, 238);
		batch.draw(savedGame2, 639, 140);
		batch.draw(savedGame3, 639, 43);
		batch.draw(settings, 29, 462);
		batch.draw(exitButton, 900, 20);


//		Tank Change
		batch.draw(startScreenBackground, 0, 0);
		batch.draw(TankChangePlayer1, 134, 306);
		batch.draw(TankChangePlayer2, 644, 296);
		batch.draw(tankStarsLogo, 352, 348);
		batch.draw(TankChangeLeftArrow, 40, 186);
		batch.draw(TankChangeLeftArrow, 518, 186);
		batch.draw(TankChangeRightArrow, 410, 186);
		batch.draw(TankChangeRightArrow, 870, 186);
		batch.draw(TankChangeTank, 126, 131);
		batch.draw(TankChangeTank, 625, 131);
		batch.draw(TankChangePlatform, 0, 0);
		batch.draw(TankChangeContinueButton, 400, 30);
		batch.draw(settings, 29, 462);
		batch.draw(exitButton, 900, 20);


//		Pause Screen
		batch.draw(pauseScreen, 0 ,0);
		batch.draw(resumeMenuButton, 340, 30);
		batch.draw(restartMenuButton, 405, 30);
		batch.draw(exitMenuButton, 470, 30);

//		Battle Screen
		batch.draw(battleScreenBackground, 0, 0);
		batch.draw(rock, 373, 80);
		batch.draw(rock, -61, 80);
		batch.draw(rock, 800, 41);
		batch.draw(battleScreenPlatform, 0, 0);

		batch.draw(tank1, 75, 110);
		batch.draw(tank2, 607, 110);
		batch.draw(earth, 783, 299);
		batch.draw(whitePlanet, 75, 303);
		batch.draw(redPlanet, 523, 299);
		batch.draw(superNova, 304, 299);
		batch.draw(healthBar, 215, 448);
		batch.draw(healthBar, 492, 448);
		batch.draw(logo, 412, 381);
		batch.draw(player1Text, 286, 455);
		batch.draw(player2Text, 620, 455);




		batch.end();

	}

	@Override
	public void dispose () {
		batch.dispose();


		GameScreenSprite.dispose();

		LoadScreenSprite.dispose();

		StartScreenSprite.dispose();
		exitButton.dispose();
		settings.dispose();

		computerButton.dispose();
		playerButton.dispose();

		savedGame1.dispose();
		savedGame2.dispose();
		savedGame3.dispose();

		PauseScreenSprite.dispose();

		TankChangePlayer1.dispose();
		TankChangePlayer2.dispose();
		TankChangeTank.dispose();
		TankChangeLeftArrow.dispose();
		TankChangeRightArrow.dispose();
		TankChangeMuzzle.dispose();
		TankChangeContinueButton.dispose();
		TankChangePlatform.dispose();

	}

}
