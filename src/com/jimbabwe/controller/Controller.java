package com.jimbabwe.controller;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Controller extends BasicGame{
	
	boolean battle = false;
	
	public Controller() {
		super("Pokemon Engine");
	}

	public void start() {
		buildWindow();
		battle fight = new battle();
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
	
	public void render(GameContainer container, Graphics g) throws SlickException {
		
	}

	public void init(GameContainer container) throws SlickException {
		
	}

	public void update(GameContainer container, int delta) throws SlickException {
		
	}
	
}
