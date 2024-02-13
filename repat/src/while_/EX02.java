package while_;

public class EX02 {
public static void main(String[] args) {
	//break 반복문안에서 빠져나올때 사용
	//continue
	int i = 0;
	while(true) {
		i++;
		System.out.println("i : "+i);
		if ( i > 3)
			break;
	}
	System.out.println("다음 문장 실행!!!");
	
	for(;;) {
		System.out.println("for i :"+ i);
		i++;
		if( i == 6) {
			System.out.println(i);
			
		}
		
	}
	
}
}
