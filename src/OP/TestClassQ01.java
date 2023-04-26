package OP;

import java.util.Scanner;

public class TestClassQ01 {
	private String day, week, inputDis;
	private int time, money, dis_m;
	
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getTime() {
		return time;
	} 
	public void setMoney(int money) {
		
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public String getWeek() {
		return week;
	}
	
	
	public void movie_input() {
		Scanner input = new Scanner(System.in);
		System.out.print("요일 입력: ");
		setDay(input.next());
		System.out.print("시작 시간 입력(24시 단위): ");
		setTime(input.nextInt());
		
	}
	
	
	public void moneyclac() {
		switch(getDay()) {
		case "금" : this.week= "주말";break;
		case "토" : this.week = "주말";break;
		case "일" : this.week = "주말";break;
		default : this.week = "평일"; break;
		}
		
		if(getWeek()=="평일") {
			if(getTime()>=6&&getTime()<10) {
				setMoney(10000); 
			}else if(getTime()>=10&&getTime()<13) {
				setMoney(13000); 
			}else {
				setMoney(14000); 
			}
			
		}else {
			if(getTime()>=6&&getTime()<10) {
				setMoney(11000); 
			}else {
				setMoney(15000); 
			}
		}
		
		
	}
	
	
	public void print() {
		System.out.println(getDay()+"요일 "+getTime()+"시 시작 영화는 "+getMoney()+"원입니다");
		
	}
}
