package while_;
/*
 continue를 만나는 순간 반복문의 맨 위로 올라간다.
 while/for 똑같이 작동한다.
 
 */
public class EX03 {
public static void main(String[] args) {
	int i = 0;
	//while(i < 5 ) {
	for(;i < 5;)  {
		while(i < 5 ) {
			i++;
			if( i == 3) {
				System.out.println("3333333");
				//break;
				continue;
			}
			System.out.println("i : "+i);
			
		}
		System.out.println("다음 문장들 실행!!!");
	}
}
}
