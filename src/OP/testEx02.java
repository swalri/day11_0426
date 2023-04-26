package OP;

import java.util.Scanner;
class TestClass05 {
	private String name, phone;
	Scanner input = new Scanner(System.in);
	public void set_name() {
		this.name = input.next();
	}
	public void set_phone() {
		this.phone = input.next();
	}
	public String get_name() {
		return name;
	}
	public String get_phone() {
		return phone;
	}
}
public class testEx02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TestClass05 t = new TestClass05();
		System.out.print("이름 입력 : ");
		t.set_name();
		System.out.print("전화번호 입력 : ");
		t.set_phone();
		System.out.println("=========================");
		System.out.println("입력하신 분의 이름은 " + t.get_name() + ",\n전화번호는 " + t.get_phone() + " 입니다");
	}
}

