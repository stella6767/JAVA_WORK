package 실습;

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
		System.out.println(year+"년 " + country + "국적의 " + artist +"가 부른 " + Title);
	}
}
