package day02;

import java.util.Scanner;

public class quiz02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("올해의 년도를 4자리로 입력하세요");
	int a = input.nextInt();
	System.out.println("당신이 태어난 년도를4자리로 입력하세요?");
	int b = input.nextInt();
	int c=a-b;
	System.out.println("당신의 나이는"+c+"살 입니다");
	
	}
}
