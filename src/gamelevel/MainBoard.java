package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		System.out.println(player.getLevel());
		
		PlayerLevel abvancedLevel = new AdvancedLevel();
		player.upgradeLevel(abvancedLevel);
		player.play(2);
		
		PlayerLevel superLevel = new SuperLevel();
		player.upgradeLevel(superLevel);
		player.play(3);
	}

}
