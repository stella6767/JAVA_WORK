package star1;

class River extends StarUnit{
	//����
	//final String name; //�޸𸮰����� �б� �������� ����(���)
	String name;
	int hp;
	int attack;
	
	//�ʱ�ȭ�� ���� ������(����x)
	public River(String n,int h, int a) {
		name = n;
		hp=h;
		attack=a;
	}
	
	//3. ����Ʈ �����ڸ� ���� ������ش�.(����: �����Ϸ��� �ȸ�����༭)
	public River() {
		
	}

	//4. ������ ���� �����ϰų� Ȯ���ϴ� ������ �ʿ�!!
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
