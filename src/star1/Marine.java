package star1;

public class Marine {
	// �ɹ�����:�ʵ�:heap����:��������:�Ӽ�:������Ƽ
	// �� private�� �����(�ش� Ŭ���� �������� �������ٰ���)
	private String name;
	private int hp;
	private int attack;

	public Marine() {
		// TODO Auto-generated constructor stub
	}

	// this�� new(���� ��)�� �������� �� heap ������ ���ε����ش�. ���� static ������ ���� ���Ѵ�.
	// this�� new�� �� heap ������ ���ε��Ѵ�. this�� heap ������.
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
