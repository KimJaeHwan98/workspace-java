package for_;
//1부터 100까지의 짝수 합을 구하시오 [변수명 Psum]
//1부터 100까지의 홀수 합을 구하시오 [변수명 Hsum]
public class quiz04 {
public static void main(String[] args) {
 int Psum = 0;
 int Hsum =0;

for(int i = 0 ; i <=100 ; i++) {
	if(i%2==0) {
		Psum += i;
	}else {
		Hsum += i;
	}
}
System.out.println("짝수의 합 :"+Psum);
System.out.println("홀수의 합 :"+Hsum);
	
}
}
