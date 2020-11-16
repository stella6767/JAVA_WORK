package �ǽ�;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Rectangle {
	int x,y,width,height;
	
	int square() {
		return width*height;
	}
	
	void show() {
		System.out.println("("+x+","+y+") ���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	
	boolean contains(Rectangle r) {
		if(r.x>this.x && r.y>this.y) {
			if((r.x+r.width < this.x + this.width) && (r.y+r.height < this.y+this.height) )
				return true;
		}
		return false;
	}
}
