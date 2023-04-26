package op_test;

import java.util.Scanner;

public class OP01_MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OP01_TestClass01 t = new OP01_TestClass01();
		int n1,n2,sum;
		System.out.println("두 수 입력 : ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		sum = t.sumFunc(n1, n2);
		System.out.println("두 수의 합은 : "+sum+"입니다");
	}
}


