package switch_;

public class EX01 {
public static void main(String[] args) {
	int select = 1;
	switch(select) {
	case 1: System.out.println("1입력");break; //break: 브레이크를 걸어주면 해당하는 케이스에대한 내용 실행해주고 브레이크를 만나는 순간 문장에서 빠져나온다
	case 2: System.out.println("2입력");break;
	default : System.out.println("1,2 제외한 값");
	}
	System.out.println("다음 문장들 실행!!!");
	
	if(select == 1) {
		System.out.println(1111);
	}else if(select ==2) {
		System.out.println(2222);
	}else {
		System.out.println("그 외의 값");
	}
}
}
