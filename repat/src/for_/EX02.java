package for_;
/*
 F11 : 디버깅 시작 모드
 f6 : 한줄씩 실행(메소드 건너뜀)
 f7 : 한줄씩 실행(메소드를 이동)
 f8 : 다음 브레이크 포인터로 이동
 c+f11 :디버깅 시작모드
 */
public class EX02 {
public static void main(String[] args) {
	int sum = 0;
	//sum = sum + i; i++;
	for(int i = 1 ; i <=100000;i++) {
		System.out.println(i);
		sum = sum + 1;
	}
	System.out.println("sum"+sum);
}
}
// 세미콜론 2개가 무조건 들어가야한다.








