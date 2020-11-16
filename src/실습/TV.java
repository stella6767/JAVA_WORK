package 실습;

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
		System.out.println(name + "에서 만든" + year + "년형" + inch + "인치 TV");
	}
	
}
