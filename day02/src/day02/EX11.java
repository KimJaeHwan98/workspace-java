package day02;

public class EX11 {
public static void main(String[] args) {
	int n1 = 9, n2 = 2;
	System.out.println(n1 / n2);
	System.out.println(n1 / (double)n2);
	System.out.println(n1 % n2);
	//정수 나누기 정수를 하면 실수는 나오지 않는다
	//더블로 강제 형변환을 하게되면 2.0으로 변경 실수값을 얻을 수 있다
	// %는 나머지값을 얻게된다 나눴을 때 남는 값을 얻는다.
	
	System.out.println("====복합대입연산자====");
	n1 = n2 = 5;
	n1 += 1; //6 n1 = n1(5) + 1
	System.out.println(n1);
	n1 -= 1; //5 n1 = n1(5) - 1
	System.out.println(n1);
	n1 *= n2; //25 n1 = n1(5) * n2(5)
	System.out.println(n1);
	n1 /= n2; //0 n1 = n1(25) / (5)n2
	System.out.println(n1);
	n1 %= n2; //0 n1 = n1(5) % n2(5)
	System.out.println(n1);
	
	
	System.out.println("====관계 연산자====");
	n1 = 5;
	n2 = 2;
	System.out.println(n1 > n2);
	System.out.println(n1 <= n2);
	System.out.println(n1 == n2);
	System.out.println(n1 != n2);
	
	
	//boolean에 저장가능한 값은 true or false
	boolean bool;
	bool = n1 > n2;
	System.out.println(bool);
	bool = n1 < n2;
	System.out.println(bool);
	
	System.out.println("====논리 연산자===="); //둘다 맞아야 트루
	int n3 = 10;
	n1 = 5; n2 = 7;
	System.out.println(n1 > n2 && n1 > n3);
	System.out.println(n2 > n2 && n2 > n3);
	System.out.println(n3 > n2 && n3 > n1);
	
	System.out.println("------or-----"); //둘중 하나라도 트루면 트루
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("----and----"); //양쪽이 트루여야 트루
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	
	System.out.println("----not----");
	System.out.println( !false );
	System.out.println( !true );
	System.out.println( !(10>5) );
	
	System.out.println("----예제----");
	n1 = 10; n2 = 5;
	bool = n1>n2 && n1%2==0;
	System.out.println(bool);
	
	System.out.println("==== 증강 연산자 ====");
	n1 = 5;
	++n1;
	System.out.println( n1 );
	
	n2 = 5;
	n2++;
	System.out.println(n2);
	
	System.out.println("--------------");// 어떠한 연산자보다 증강시켜라
	n1 = 10;
	n2 = ++n1;
	System.out.println("n1 :"+n1);
	System.out.println("n2 :"+n2);
	
	System.out.println("---------------");//모든 연산이 끝나고 증강 시킨다.
	n1 = 10;
	n2 = n1;
	System.out.println("-----------------");
	System.out.println("n1 :"+n1);
	System.out.println("n2 :"+n2);
	
	int a=5 , b=6 , c=10 , d;
	d = ++a * b--; // 6 * 6
	System.out.println(a+","+b+","+d); // 6 , 5 , 36
	
	d= a++ + ++c - b--; // 6 + 11 + 5 = 12 
	System.out.println(a+","+b+","+c+","+d); // 7,4,11,12 // ++a 계산전 1증가
	//b++ 계산 후 1증가
	
	System.out.println("====삼항 연산자(조건연산자)====");
	n1 = 20;
	n2 = 10;
	String result;
	result = (n1>n2)?"n1이 n2보다 크다" : "n2가 n1보다 크다";
	System.out.println(result);
	
	
	
	
	
	}
}
