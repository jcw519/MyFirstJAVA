﻿package template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("차가 스스로 움직입니다.");
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다.");
		
	}

	@Override
	public void washCar() {
		System.out.println("자동 세차합니다.");
	}
	
	
	
}
