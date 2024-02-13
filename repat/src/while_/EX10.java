package while_;

public class EX10 {
public static void main(String[] args) {
	for(int k=0 ; k<3 ; k++) {
		System.out.println("===상위 반복문 시작");
		for(int i=0 ; i < 3;i++) {
			System.out.println(i+"for");
		//break;
		}
		System.out.println("상위 반복문 끝===");
		break;
	}
	System.out.println("다음 문장들 실행!!");
}
}
//브레이크가 어느 위치냐에 따라서 동작도 조금씩 다르다.