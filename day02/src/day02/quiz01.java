package day02;

import java.util.Scanner;

public class quiz01 {
public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.print("수 입력 :");
	int num = input.nextInt();
	String result=(num%2==0)?num+"=짝수"  :num+"=짝수가 아니다";
	String result1=(num%3==0)?num+"=3의 배수이다" : num+"=3의배수가 아니다";
	System.out.println(result);
	System.out.println(result1);
	System.out.print("두 수 입력 :");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	System.out.print("num1 :"+ num1);
	System.out.println(",num2 :"+ num2);
	String result3=(num1>num2)?
			"num1이 num2보다 크다" : "num2가 num1보다 크다";
	System.out.println(result3);
	
		

}
}
