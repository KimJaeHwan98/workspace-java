package while_;

import java.util.Scanner;

public class EX05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int temp , i;
	i = input.nextInt();
	//System.out.println("수 입력");
	boolean bool = true;
	while(bool) {
		//System.out.println("while");
		temp = i%10;
		i = i/10;
		System.out.println(temp+",");
		//i = input.nextInt();
		if(i == 0) {
			//System.out.println("bool :"+bool);
			//bool = false;
			break;
		}
		System.out.println("while 종속문장");
	}
	System.out.println("다음 문장들 실행 :"+bool);
	
	
}
}
