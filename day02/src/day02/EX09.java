package day02;

import java.util.Scanner;

public class EX09 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String name;
	int k = 0 , e = 0 , s = 0 , n = 0;
	
	System.out.print("당신의 이름은 무엇입니까 ?");
	 name = input.next();
	System.out.print(name+"님의 국어 점수 :");
	k = input.nextInt();
	System.out.print(name+"님의 영어 점수 :");
	e = input.nextInt();
	System.out.print(name+"님의 수학 점수 :");
	s = input.nextInt();
	n = k+e+s;
	System.out.println("합계 :"+n);
	
	
	System.out.println("=========================");
	System.out.println("이름: "+name);
	System.out.println("=========================");
	System.out.println("국어 :" + k);
	System.out.println("영어 :"+e);
	System.out.println("수학 :"+s);
	System.out.println("=========================");
	System.out.println("합계 :"+n);
	System.out.println("=========================");
	
	
	}
}