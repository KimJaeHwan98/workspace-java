package day02;

public class EX03 { 
	public static void main(String[] args) {
	char ch = 'A';
	int num = 5;
	int ret;
	ret = ch + num;
	System.out.println("A + 5 =" + ret);
	System.out.println("ch :"+ch );
	System.out.println("num :"+num);
	//아스킷코드표 A=65 여서 a+5값이 70이 나오는것이다
	//작은다운표만 사용가능하다 문자하나만 사용가능하다
	//큰다운표는 문자열을 쓸 때 사용한다.
	
	String str = "hello";
	System.out.println("변경 전 str :"+str);
	str = "test";
	System.out.println("변경 후 str :"+str);
	//문자열은 꼭 큰다운표
	//문자는 String으로 표시한다
	
	}

}
