package com.jimbabwe.controller;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Controller extends BasicGame{
	
	boolean drawBattle = true;
	
	Image battleBG;
	
	public Controller() {
		super("Pokemon Engine");
	}

	public void start() {
		buildWindow();
	}
	
	public void buildWindow() {
		try {
			AppGameContainer app = new AppGameContainer(new Controller());
			app.setDisplayMode(1280, 720, false);
			app.setVSync(true);
			app.setTargetFrameRate(60);
			app.setShowFPS(false);
			app.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void drawBattle(Graphics g) {
		if(drawBattle) {
			battleBG.draw(0,0);
		}
	}
	
	public void render(GameContainer container, Graphics g) throws SlickException {
		drawBattle(g);
	}

	public void init(GameContainer container) throws SlickException {
		battleBG = new Image("/Images/Gen4/grassBG.png");
	}

	public void update(GameContainer container, int delta) throws SlickException {
		battle fight = new battle();
	}
	
}
