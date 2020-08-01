﻿package gamelevel2;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("엄청 높이 점프 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돌 수 있습니다.");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=========고급자=========");
	}

}
