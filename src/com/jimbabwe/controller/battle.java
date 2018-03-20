package com.jimbabwe.controller;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class battle extends BasicGame{
	
	Image grassBG;
	
	//MAKE CONSTRUCTOR PASSING IN ENEMY TEAM? (and Levels)
	
	public battle() {
		super("battle");
	}
	
	public void startBattle() {
		//ONLY RUN ONCE
		//intro animation
		
		//get enemy sprite
		
		//get ally backsprite
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

	public void render(GameContainer container, Graphics g) throws SlickException {
		grassBG.draw(0,0);
	}

	public void init(GameContainer container) throws SlickException {
		grassBG = new Image("/Images/Gen4/grassBG.png");
	}

	public void update(GameContainer container, int delta) throws SlickException {
		
	}
	
	
}
