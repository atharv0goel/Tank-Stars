package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.screens.HomeScreen;

public class TankStars extends Game {
	@Override
	public void create() {
		HomeScreen homeScreen = new HomeScreen(this);
		setScreen(homeScreen);
		homeScreen.render(0);
	}
}
