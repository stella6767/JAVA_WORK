package star1;

public class Marine {
	// 맴버변수:필드:heap변수:전역변수:속성:프로퍼티
	// 는 private로 만든다(해당 클래스 내에서만 직접접근가능)
	private String name;
	private int hp;
	private int attack;

	public Marine() {
		// TODO Auto-generated constructor stub
	}

	// this는 new(실행 시)에 동적으로 그 heap 변수에 바인딩해준다. 따라서 static 공간에 쓰질 못한다.
	// this는 new가 된 heap 공간을 바인딩한다. this는 heap 변수민.
	public Marine(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	

}
