package �ǽ�;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Song {
	String Title;
	String artist;
	int year;
	String country;
	
	void show() {
		System.out.println(year+"�� " + country + "������ " + artist +"�� �θ� " + Title);
	}
}
