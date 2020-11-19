package 실습;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
class Parent {
	private int age = 90;
	
	public Parent() {
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

@AllArgsConstructor
class Child extends Parent{
	int age = 30;
	
	public Child() {
		//super();
	}
	
	

	public int getAge() {
		return super.getAge();//private 일 때
		//return super.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}




public class SuperPrac {
	public static void main(String[] args) {
		
		//Parent m = new Child();
		Child m = new Child();
		System.out.println(m.getAge());
		System.out.println(m.age);
		
		
	}
}
