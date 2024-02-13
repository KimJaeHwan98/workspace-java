package while_;

import java.util.Scanner;

public class quiz01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num = 0;
	String id =null , pw = null , svid = null , svpw = null ;
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println(">>>>>>>");
		num = input.nextInt();
		if(num>0&&num<=3) {
			switch(num) {
			case 1 : {
				System.out.println("아이디입력 :");
				 id =input.next();
				System.out.println("비밀번호입력 :");
				pw = input.next();
					if(id.equals(svid)) {
						if(pw.equals(svpw)) {
							System.out.println("로그인 성공!");
						}else {
							System.out.println("로그인 실패!!");
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
					break;
			}			
			case 2 : {
				System.out.println("아이디입력 :");
				svid =input.next();
				System.out.println("비밀번호입력 :");
				svpw = input.next();
				System.out.println("가입성공!1.로그인");
				System.out.println("\n\n");
				break;
				
			}
			case 3 : {
				System.out.println("로그아웃합니다!");
				break;
				
			}default : {
				
			}
			}
			if(num==3) {
				break;
			}
	
		}
		
	}
	
	
}
}
