package array;

public class EX04 {
public static void main(String[] args) {
	int[] arr = new int[] {100,200,300};
	double[] dos = {1.11,2.22,3.33};
	String[] str = {"안녕","하세요"};
	
	//for(int i=0;i<arr.length;i++ {}
	int i=0;
	for(int num : arr) {//arr이 가지고 있는 변수를 num에 저장하겠다
		System.out.println(i+"."+num);
		i++;
	}
	for(double dou : dos) {//배열 더블형태의 배열
		System.out.println(dou);
	}
	for(String s : str) {//문자열 값을 하나씩 저장할때 사용한다
		System.out.println(s);
	}
}
}
