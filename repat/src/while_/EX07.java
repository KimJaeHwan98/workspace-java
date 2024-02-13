package while_;

public class EX07 {
public static void main(String[] args) {
	String n1 = "abcd" , n2 = "test"; // 대문자면 클레스 소문자면 .을찍으면 기능이 나오지않는다
	int num = 1000;
	//System.out.println(n1.equals(n2)); 
	System.out.println(n2.equals(n1)); // equals = 두가지가 같냐./ 해당값이 존재해야만 사용 가능
	if(n1 == null) {
		System.out.println("n1입력하세요");
	}else {
		if(n1.equals(n2)) {
			System.out.println("두 문자열은 같다");
		}else {
			System.out.println("다르다...");
		}
	}
}
}
