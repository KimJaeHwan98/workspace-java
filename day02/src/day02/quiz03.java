package day02;

import java.util.Scanner;

public class quiz03 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("첫 번째 물건의 무게를 입력 하시오?");
	double a = input.nextDouble();
	System.out.print("두 번째 물건의 무게를 입력 하시오?");
	double b = input.nextDouble();
	
	 double c = 600-(a+b);
	System.out.println("현재 엘레베이터에 허용 무게는"+c+ "kg 입니다.");
	
}

}
