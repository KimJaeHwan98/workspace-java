package day02;

public class EX04 {public static void main(String[] args) {
	//형변환 자료형태를 변화시킨다
	char ch = 'A';
	System.out.println(ch);
	int num = ch; //자동형 변환
 	System.out.println(num);
	char ch02 = (char)num;//강제 형변환
	//바이트 크기가 작은공간에 큰 공간을 넣을 수 없기때문에 오류가 발생한다
	//강제 형변환을 (char)붙여주면 오류가 사라진다.
	System.out.println(ch02);
	
	double d = 1.1111;
	float f = (float)1.1111;
	//8바이트값을 4바이트로 강제 형변환으로 넣어준것이다. 뒤쪽에 f를 붙여줘도 변환한다.
 	}

}
