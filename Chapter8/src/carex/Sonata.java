﻿package carex;

public class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("시동을 켭니다.");
		
	}

	@Override
	public void drive() {
		System.out.println("달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("멈춥니다.");		
	}

	@Override
	public void turnoff() {
		System.out.println("시동을 끕니다.");		
	}

}
