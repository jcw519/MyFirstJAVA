package gamelevel2;

public class Player {
	
	PlayerLevel playerLevel;
	
	//player�� �����Ǹ� ó�� ������ �����̴�.
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
