package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("1 : 한 명씩 차례대로 할당");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("3 : 우선수누이가 높은 고객 먼저 할당");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		Scheduler scheduler = null;
		
		switch (num) {
		case 1 : {
			scheduler = new Distribute();
			break;
		} case 2 : {
			scheduler = new Shortline();
			break;
		} case 3 : {
			scheduler = new Priority();
			break;
		}
		default:
			System.out.println("지원되지 않는 기능입니다.");
			break;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
