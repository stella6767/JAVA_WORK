package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor//�⺻ ������
@NoArgsConstructor //��� �μ� ������
@Data //getter setter
public class Cat3 {
	private int age;
	private String name;
	private String color;
	
}
