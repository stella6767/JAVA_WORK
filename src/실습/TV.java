package �ǽ�;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class TV {
	String name;
	int year;
	int inch;
	
	void show() {
		System.out.println(name + "���� ����" + year + "����" + inch + "��ġ TV");
	}
	
}
