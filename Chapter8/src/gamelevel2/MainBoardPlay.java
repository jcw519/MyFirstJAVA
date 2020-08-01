package gamelevel2;

public class MainBoardPlay {

	public static void main(String[] args) {
		
		//player 인스턴스 생성
		Player player = new Player();
		player.play(1);
		
		PlayerLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}
