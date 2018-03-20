package com.jimbabwe.controller;

public class battle {
	
	//MAKE CONSTRUCTOR PASSING IN ENEMY TEAM? (and Levels)
	
	public battle() {
		startBattle();
		inBattle();
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
	
	
}
