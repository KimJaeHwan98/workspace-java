package switch_;

import java.util.Scanner;

public class EX02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	
	System.out.println("수 입력");
	num = input.nextInt();
	//if(num 2%==0) {}
	//else {}
	switch(num % 2) {
	case 0 : System.out.println("입력 값은 짝수");break;
	case 1 : System.out.println("홀수");
	}
	System.out.println("다음 문장들 실행!!!");
}

}
