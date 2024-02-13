package day02;

import java.util.Scanner;

public class quiz07 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("숫자를 넣으시오");
	int num1 =input.nextInt();
	System.out.println("숫자를 넣으시오");
	int num2 =input.nextInt();
	String c = (num1>num2&&num1%2==0||num2>num1&&num2%2==0)? "큰수는 짝수입니다" : "아님";
	System.out.println(c);
}
}