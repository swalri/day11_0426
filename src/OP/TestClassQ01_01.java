package OP;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClassQ01_01 {

	private String name;
	private int phone, age;
	private String addr;
	ArrayList arr = new ArrayList<>();
	HashMap<String, ArrayList> map = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}




	public ArrayList getArr() {
		return arr;
	}

	public ArrayList setArr() {
		//arr.removeAll(arr);
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(age);
		list.add(phone);
		list.add(addr);
		return list;
		
	}
	public void removeArr() {
		
		//arr.removeAll(arr);
	}

	public void setmap( ) {
		
		map.put(name, setArr());
		

	}

	public HashMap getmap() {
		
		
		return map;
	}
	
	public ArrayList getmap(String name) {

		
			return map.put(name, arr);
	
		
	}

	public void putmap() {
		System.out.println(map);
		
	}
	public void removemap(String name) {
		map.remove(name);	
		
	}
	public void modifymap(String name, ArrayList arr) {
		
		map.replace(name, arr);
		
	}
	
	
}
