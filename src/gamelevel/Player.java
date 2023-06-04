package gamelevel;

public class Player {
	private PlayerLevel level;  // Player 가 가지는 level 변수 선언
	
	public Player() {
		level = new BeginnerLevel();  // 묵시적 형 변환이 일어난다. 
		level.showLevelMessage();  // 가상 메서드에 의해 인스턴스의 메서드가 실행.
	}
	
	public PlayerLevel getLevel() {  // level 의 getter
		return level;  // ? 여기서 get level 을 하면 PlayerLevel 에 따라서 출력되는 것이 다를 것인데, 어쨌든 참조 값 주소가 나올텐데
	}
	
	public void upgradeLevel(PlayerLevel level) { // 구체적인 모든 Level 들을 받을 수 있도록 상위 클래스인 PlayerLevel 형으로 매개변수를 설정함
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);  // PlayerLevel 의 템플릿 메서드인 go( ) 호출
	}
}