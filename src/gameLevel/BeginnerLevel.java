package gameLevel;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump 못 함 ㅠ");
	}

	@Override
	public void turn() {
		System.out.println("turn 못 함 ㅠ");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******* 초보자 레벨입니다 *******");
	}
}
