package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TankStars extends ApplicationAdapter {

	SpriteBatch batch;

//	Game Screen
	Texture game_screen_image;
	TextureRegion gameScreen;
	TextureRegion tenpercent;
	TextureRegion fifteenpercent;
	TextureRegion twentypercent;
	TextureRegion fiftypercent;
	TextureRegion seventypercent;
	TextureRegion hundredpercent;

//	Load Screen
	TextureRegion loadBar;

	@Override
	public void create () {

//		Game Screen
	batch = new SpriteBatch();
	game_screen_image = new Texture("GameScreen/sprites.png");
	gameScreen = new TextureRegion(game_screen_image, 0, 0, 960, 540);

	tenpercent = new TextureRegion(gameScreen, 408, 540, 100 , 100);
	fifteenpercent = new TextureRegion(gameScreen, 0, 540, 100 , 100);
	twentypercent = new TextureRegion(gameScreen, 510, 540, 100 , 100);
	fiftypercent = new TextureRegion(gameScreen, 102, 540, 100 , 100);
	seventypercent = new TextureRegion(gameScreen, 306, 540, 100 , 100);
	hundredpercent = new TextureRegion(gameScreen, 204, 540, 100 , 100);

//	Loading Screen
	loadBar = new TextureRegion(new Texture("LoadScreen/gamescreen.png"), 0, 540, 391, 147);


	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
//		Game Screen
		batch.draw(gameScreen, 0, 0);

		batch.draw(tenpercent, gameScreen.getRegionWidth() - 100, 0);
		batch.draw(fifteenpercent, gameScreen.getRegionWidth() - 100, 0);
		batch.draw(twentypercent, gameScreen.getRegionWidth() - 100, 0);
		batch.draw(fiftypercent, gameScreen.getRegionWidth() - 100, 0);
		batch.draw(seventypercent, gameScreen.getRegionWidth() - 100, 0);
		batch.draw(hundredpercent, gameScreen.getRegionWidth() - 100, 0);

//		Loading Screen
//		batch.draw(loadBar, 0, 0);

		batch.end();

	}

	@Override
	public void dispose () {
		batch.dispose();
		game_screen_image.dispose();
	}

}
