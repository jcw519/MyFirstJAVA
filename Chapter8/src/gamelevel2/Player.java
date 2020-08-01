package gamelevel2;

public class Player {
	
	PlayerLevel playerLevel;
	
	//player가 생성되면 처음 레벨은 비기너이다.
	public Player() {
		playerLevel = new BeginnerLevel();
		playerLevel.showLevelMessage();
	}
	
	public void play(int count) {
		playerLevel.go(count);
	}

	public PlayerLevel getPlayerlevel() {
		return playerLevel;
	}
	
	public void upgradeLevel(PlayerLevel playerLevel) {
		this.playerLevel = playerLevel;
		playerLevel.showLevelMessage();
	}

	
	
	
}
