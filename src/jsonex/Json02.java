package jsonex;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //gson이 접근할 수 있도록, getter를 때림
@NoArgsConstructor
@AllArgsConstructor
class Com{
	private int id;
	private String content;
}


public class Json02 {

	public static void main(String[] args) {
		

	}

}
