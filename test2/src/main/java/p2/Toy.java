package p2;

import java.util.Scanner;

public class Toy {
	
	private Battery battery;
	private String text;
	private Scanner sc;
	
	// Toy 함수에서는 battery 객체가 먼저 준비되어 있어야  실행이 된다.
	// 따라서 Toy 함수는 battery에 의존성을 가지고 있다.
	
	public Toy(Battery battery) {
	      this.battery = battery;
	      text = "삐약삐약 병아리 음매음매 송아지\n" +
	            "따당따당 사냥꾼 뒤뚱뒤뚱 물오리\n" +
	            "푸푸 개구리 집게집게집게 가재\n" +
	            "푸르르르르르 풀풀\n" +
	            "따단따단딴 소라!\n";
	      sc = new Scanner(text);
	   }
	
	public void run() {
		if(sc.hasNextLine() == false) {
			System.out.println();
			sc = new Scanner(text);
		}
		if (sc.hasNextLine() && battery.getEnergy() >= 10) {
			String line = sc.nextLine();
			System.out.println(line);
			battery.useEnergy();
		}
		else {
			System.err.println("에너지가 없습니다.");
		}
	}
	
}
