package variable;

import java.util.Scanner;

class CalculatorEx {
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	//더하기
	private int add(int num1, int num2) {
		// 덧셈 연산을 수행하면 +1 증가
		addCount++;
		int result = num1 + num2;
		return result;
	}
	//빼기
	private int min(int num1, int num2) {
		minCount++;
		int result = num1 - num2;
		return result;
	}
	//곱하기
	private int mul(int num1, int num2) {
		mulCount++;
		int result = num1 * num2;
		return result;
	}
	//나누기
	private double div(int num1, int num2) {
		divCount++;
		double result = num1 / num2;
		return result;
	}

	//출력
	public void showOpCount() {
		System.out.println("덧셈 횟수 : " + addCount);
		System.out.println("뺄셈 횟수 : " + minCount);
		System.out.println("곱셈 횟수 : " + mulCount);
		System.out.println("나눗셈 횟수 : " + divCount);
	}
	//카운트
	public void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	//실행
	public void display() {
		Scanner scan = new Scanner(System.in);
		int num, n1,n2;
		String s;
	    init();
	    while(true) {
	    	System.out.println("1. 실행");
	    	System.out.println("2. 종료");
	    	num = scan.nextInt();
	    	switch(num) {
	    	case 1:
	    		System.out.println("수를 입력");
	    		n1 = scan.nextInt();
	    		System.out.println("기호를 입력");
	    		s = scan.next();
	    		System.out.println("수를 입력");
	    		n2 = scan.nextInt();
	    		if(s.equals("+")) {
	    			add(n1, n2);
	    		}else if(s.equals("-")) {
	    			min(n1, n2);
	    		}else if(s.equals("*")) {
	    			mul(n1, n2);
	    		}else if(s.equals("/")) {
	    			div(n1, n2);
	    		}else {
	    			System.out.println("기호를 잘못 입력했습니다");
	    		}
	    		break;
	    	case 2:
	    		showOpCount();
	    		System.out.println("종료합니다");
	    		System.exit(0);
	    		break;
	    	default:
	    		System.out.println("오류");
	    		break;
	    	}
	    }
	}
}

public class Ex01 {
	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.display();
	}
}
