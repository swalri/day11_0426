package OP;

import java.util.ArrayList;
import java.util.Scanner;

public class testEx01_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		TestClassQ01_01 i = new TestClassQ01_01();
		ArrayList arr = new ArrayList();

		i.setName("홍길동");
		i.setAge(40);
		i.setPhone(123);
		i.setAddr("서울시어딘가");
		i.setmap();

		while (true) {
			System.out.println("===================");
			System.out.println("개인정보관리 해드림");
			System.out.println("1.추가");
			System.out.println("2.검색");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.보기");
			System.out.println("6.종료");
			System.out.print(">>>> ");

			int sel = input.nextInt();
			switch (sel) {
			case 1:
				System.out.println("이름입력: ");
				String name = input.next();
				System.out.println("나이입력: ");
				int age = input.nextInt();
				System.out.println("전화번호입력: ");
				int phone = input.nextInt();
				System.out.println("주소입력: ");
				String addr = input.next();
				// arr.removeAll(arr);
				// System.out.println(arr);
				i.setName(name);
				i.setAge(age);
				i.setPhone(phone);
				i.setAddr(addr);
//				arr.add(name);
//				arr.add(age);
//				arr.add(phone);
//				arr.add(addr);

				i.setmap();

				break;
			case 2:
				System.out.println("이름입력: ");
				name = input.next();
				if (i.getmap().containsKey(name)) {
					System.out.println(i.getmap(name));
				} else {
					System.out.println("그딴건 없음");
				}

				break;
			case 3:
				System.out.println("기존이름 입력: ");
				String c_name = input.next();
				System.out.println("수정할 이름입력: ");
				name = input.next();
				System.out.println("수정할 나이입력: ");
				age = input.nextInt();
				System.out.println("수정할 전화번호입력: ");
				phone = input.nextInt();
				System.out.println("수정할 주소입력: ");
				addr = input.next();
				i.removemap(c_name);
				i.setName(name);
				i.setAge(age);
				i.setPhone(phone);
				i.setAddr(addr);

				i.setmap();
				System.out.println("수정완료");
				break;
			case 4:
				System.out.println("이름입력: ");
				name = input.next();
				if (i.getmap().containsKey(name)) {
					i.removemap(name);
					System.out.println("삭제완료 ");
				} else {
					System.out.println("그딴건 없음");
				}

				break;

			case 5:
				i.putmap();
				break;

			case 6:
				System.out.println("bye~~");
				System.exit(0);
				break;

			}

		}

	}
}