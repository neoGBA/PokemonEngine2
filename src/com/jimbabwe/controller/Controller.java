package com.jimbabwe.controller;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import com.jimbabwe.pokemon.*;

public class Controller extends BasicGame{
	
	//DONT USE SLICK
	
	boolean drawBattle = true;
	boolean battleBeginning = true;
	
	Image grassBG, textbox;
	
	Image Opponent, Ally;
	
	Object [] myTeam;
	Object [] enemyTeam;
	
	public Controller() {
		super("Pokemon Engine");
	}

	public void start() {
		buildWindow();
	}
	
	public void buildWindow() {
		try {
			AppGameContainer app = new AppGameContainer(new Controller());
			app.setDisplayMode(1280, 954, false);
			app.setVSync(true);
			app.setTargetFrameRate(60);
			app.setShowFPS(false);
			app.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void startBattle() {
		if(battleBeginning) {
			//ONLY RUN ONCE
				createMyTeam();
				createEnemyTeam();
			//intro animation
			
			//get enemy sprite
				
			//get ally backsprite
				
				battleBeginning = false;
		}else {
			inBattle();
		}
		
	}
	
	public void inBattle() {
		//choose action
		//check speed 
		//run through attacks
		//check if either hp is 0, if not, start from the top again
	}
	
	public void endBattle() {
		//only called by inBattle() if either you or trainer is out of pokemon
		
		//finishing trainer statement, award prizeMoney, award EXP
	}
	
	public void createMyTeam() {
		myTeam[0] = new Bulbasaur(5);
	}
	
	public void createEnemyTeam() {
		enemyTeam[0] = new Bulbasaur(5);
	}
	
	public void drawBattle() {
		if(drawBattle) {
			grassBG.draw(0,0);
			textbox.draw(0,721);
		}
	}

	public void render(GameContainer container, Graphics g) throws SlickException {
		drawBattle();
	}

	public void init(GameContainer container) throws SlickException {
		grassBG = new Image("/Images/Gen4/grassBG.png");
		textbox = new Image("/Images/Gen4/textBox.png");
	}

	public void update(GameContainer container, int delta) throws SlickException {
		startBattle();
	}
}
