package day02;

public class EX05 {public static void main(String[] args) {
	//값에대한 변경을 하지않는다.
	final String KOREA = "대한민국"; //final을 붙여주면 어떠한 의미가 있는 것은 상수 화 시킨다. 무조건 대문자로 사용하는 약속이있다.
	System.out.println(KOREA);
	//KOREA = "미국";
	System.out.println(KOREA);
	}

}
