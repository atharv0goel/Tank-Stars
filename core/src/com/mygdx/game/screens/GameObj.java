package com.mygdx.game.screens;

import com.badlogic.gdx.Game;

public class GameObj extends Game {
//    public static GameObj gameObj;
//    private GameConfig config;
//    private Projectile lastUsedProjectile;
//
//    public GameObj(int modeNumber, Player player1, Player player2) {
//        this.config = new GameConfig(modeNumber, player1, player2);
//    }

    @Override
    public void create() {
        StartScreen homeScreen = new StartScreen(this);
        setScreen(homeScreen);
        homeScreen.render(0);
    }
}
