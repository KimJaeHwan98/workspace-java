package for_;

import java.util.Scanner;

public class quiz06 {
public static void main(String[] args) {
	
	/*반 별 국어 중간고사 성적 입력하는 프로그램을 작성하시오

	각 반의 명수를 입력하고 해당 학생의 국어 성적을 입력하면 총 점과 총 평균이 출력됩니다. 
	입력 성적이 0점 이하 거나 100점 이상일 시 "다시 입력해주세요" 라는 문구와 재입력이 되도록 합니다.

	예시)
	총 학생 수 : 2

	1번 학생 국어 성적 : 80
	2번 학생 국어 성적 : 600
	2번 학생 다시 입력해주세요 : 60

	총 점 : 80
	총 평균 : 40.0
	*/
	
	Scanner input = new Scanner(System.in);
	
	
	int kor =0,cnt = 0, tot_kor =0 , j = 1;
	
	double avg_kor = 0;
	
	System.out.println("총 학생 수 : ");
	cnt = input.nextInt();
	
	for (int i = 0;i<cnt; i++) {
	System.out.println(j+"번 학생 국어 성적 :");	
	kor = input.nextInt();
	
	
	while (kor < 0 || kor > 100) {
		System.out.println(j+"번 학생 다시 입력해주세요");
		kor = input.nextInt();
	}
	tot_kor += kor;
	j++;
	}
	avg_kor = tot_kor / (double) cnt;
	
	System.out.println("총점 :" + tot_kor);
	System.out.println("총 편균 :" + avg_kor);
	}
}


