package gamelevel2;

public  abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	//템플릿 메서드 : 레벨에 따라 진행되는 시나리오
	final public void go(int count) {
		run();
		
		for(int i = 0; i < count ; i++) {
			jump();
			
		}
		turn();
	}
	
	
	
	
}
