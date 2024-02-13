package array;

import java.util.Scanner;

public class quiz02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int arr[] = new int[] {10,54,13,17,25,30};
	String odd_even=null;
	System.out.println("짝수,홀수 입력 :");
	odd_even = input.next();
	for (int i = 0;i<arr.length;i++) {
		if(odd_even.equals("짝수")) {//문자를 비교하는 문법 equals
			if(arr[i]%2==0) { //나머지값이 0 == 짝수
			
			System.out.println("찍수 :"+ arr[i]);
		}
	}else
		if(arr[i]% 2 != 0) // 나머지값이 0이 아니다 라는 표현 != 홀수
		System.out.println("홀수 :"+arr[i]);
	
	
}
}
}