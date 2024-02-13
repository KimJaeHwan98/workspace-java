package array;
//컨트롤 에이 전체선택
//컨트롤 아이 정렬
public class quiz01 {
	public static void main(String[] args) {
		int arr[] = new int[] {10,54,13,17,25,30};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("짝수 :"+arr[i]);
			}else
				System.out.println("홀수 :"+arr[i]);
			
			
		}
		System.out.println("--------for each-----------");
		for(int a : arr ) {
			if(a%2==0) {
				System.out.println("짝 : "+a);
			}else
				System.out.println("홀 :"+a);
		}
	}	
}
