package while_;
// do while 일반 반복문이랑 다른건 무족너 한번은 실행된다.
// 해외에서는 많이 쓴다고 한다 지금은 모른다..
//반복문 안에도 반복문 사용 가능.
public class EX08 {
public static void main(String[] args) {
	int i=5 , su=10;
	do {
		//su++;
	System.out.println("do while :"+su);
	}while(su<i);
	System.out.println("다음 문장 실행");

}
}
