package while_;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m =0 , j = 0;
		System.out.println("요금을 투입 하세요 >>>>");
		m = input.nextInt();
		for(;;) {
			System.out.println("==========커피자판기================\n");
			System.out.println("1.(커피(200)2.코코아(250)3.반환4.종료");
			System.out.println("메뉴를 선택하세요 >>>");
			j = input.nextInt();
			if(j==4)
				break;
			else if(j==1&&m<200||(j==2&&m<250)) {
				System.out.println("요금이 부족합니다.");
			}
			else if(j == 1 ) {
				System.out.println("맛있게 드세요\n");
				m -= 200;
			}
			else if(j==2) {
				System.out.println("맛있게 드세요\n");
				m -= 250;
			}
			else if(j==3) {
				System.out.println("거스름돈 :"+ m);
				m = 0;
			}
			else {
				System.out.println("잘못입력하셨습니다.\n\n");
			}
		}
		System.out.println("프로그램 종료!");
}
}