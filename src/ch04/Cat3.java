package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//기본 생성자
@NoArgsConstructor //모든 인수 생성자
@Data //getter setter
public class Cat3 {
	private int age;
	private String name;
	private String color;
	
}
