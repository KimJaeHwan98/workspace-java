package day02;

public class EX02 {public static void main(String[] args) {
		int number =123;
		System.out.println("변경 전 num :"+number);
		number = 100;
		System.out.println("변경 후 num"+number);
		number = number + 200;
		System.out.println("변경 후 num"+number);
		//코드는 순차적으로 시행된다 값은 언제든지 변경이 가능하다
		
	}

}
