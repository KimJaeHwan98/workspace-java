package array;
//double만 넣을 수 있다.
public class EX02 {
public static void main(String[] args) {
	double dos[] = new double[] {1.111,2.222,3.333,4.444};
	System.out.println(dos[0]);
	
	System.out.println( dos.length);//저장된 총 길이를 알려준다.
	for(int i=0;i<dos.length;i++) {// <=를 사용하면 에러발생 0부터 시작하기때문에
		System.out.println(i+"."+dos[i]);
	}
}
}
