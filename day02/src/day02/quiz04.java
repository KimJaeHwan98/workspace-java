package day02;

import java.util.Scanner;

public class quiz04 {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);		
		System.out.print("키를 입력하세요?");
		int a = input.nextInt();
		double b = (a - 100) * 0.9;
		
		System.out.println("표준 체중은"+b+ "입니다");
	}
}
