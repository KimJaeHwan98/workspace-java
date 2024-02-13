package array;

public class EX05 {
public static void main(String[] args) {
	int arr[][] = new int[][] {
	//        0    1    2   3
		//0	{ 10 , 20 , 30, 3},
		//0,0  0,1   0,2
	//1	{ 40 , 50 , 60, 4},
		//1,0  1,1   1,2
	//2	{ 70 , 80 , 90, 5}
	 //  2,0   2,1  2,2
	};
	System.out.println(arr[0][0]);
	System.out.println(arr[1][2]);
	System.out.println(arr.length);// 세로줄 
	System.out.println(arr[0].length);// 가로줄
	System.out.println("=============");
	for(int i=0;i<arr.length; i++) {//저장되는 위치
		for(int k=0;k<arr[i].length;k++) {
			System.out.print(arr[i][k]+"	");
		}
		
		/*
		System.out.println(arr[i][0]);
		System.out.println(arr[i][1]);
		System.out.println(arr[i][2]);
		System.out.println(arr[i][3]);
		*/
		System.out.println("------------");
	}
}
}
