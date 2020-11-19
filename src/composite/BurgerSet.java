package composite;

import lombok.Data;

//콤포지션 = 객체 변수를 필드에 넣음 has 관계
@Data
public class BurgerSet { 
	private Burger burger;
	private Potato potato;
	private Coke coke;
	
	public BurgerSet() {
		this(
				new Burger(),
				new Potato(),
				new Coke()				
				);
	}
	
	public BurgerSet(Burger burger, Potato potato, Coke coke) {
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
}
