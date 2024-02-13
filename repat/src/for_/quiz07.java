package for_;

import java.util.Random;
import java.util.Scanner;

public class quiz07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int end=1;
	while(true) {
		System.out.println("윳 던지기-모(X X X X)가 나올 때까지 계속됩니다.");
		System.out.println("1.윷 던지기");
		System.out.println("2.게임 종료하기");
		
		int choice = input.nextInt();
		
		if(choice ==1) {
			end=throwYut();
		}else if (choice == 2) {
			System.out.println("게임을 종료합니다.");
			break;
		}else {
			System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
		}
		if(end==0) {
			System.out.println("    ['모'가 나왔습니다! 게임 종료!!!");
			System.out.println("==================================");
			break;
		}
	}
}
private static int throwYut() {
	Random random = new Random();
	int result=0;
	int sumFront = 0;
	
	for(int i=0;i<4;i++) {
		result = random.nextInt(2);
		if(result ==1)
			System.out.print("X");
		else
			System.out.print("O");
		sumFront += result;
	}
	switch (sumFront) {
	case 0 :
		System.out.println("=>'윳'");
		System.out.println();
		break;
	case 1 :
		System.out.println("=>'걸'");
		System.out.println();
		break;
	case 2 :
		System.out.println("=>'개'");
		System.out.println();
		break;
	case 3 :
		System.out.println("=>'도'");
		System.out.println();
		break;
	case 4 :
		System.out.println("=>'모'");
		System.out.println();
		break;
	
		default:
			
		break;
		}
	if(sumFront==4) {
		return 0;
	}else return 1;
	
	
}
}


