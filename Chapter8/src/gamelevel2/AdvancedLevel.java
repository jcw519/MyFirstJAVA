﻿package gamelevel2;

public class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("점프 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn 불가능.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=========중급자=========");
		
	}

}
