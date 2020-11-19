package ch04;

class Name{
	String name;

	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Name(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Police extends Name{
	String name="°æÂû";
	
	public Police() {
		// TODO Auto-generated constructor stub
	}

	public Police(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class Doctor extends Name{
	String name="ÀÇ»ç";
	
	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Array02 {
	
	public static void main(String[] args) {
		
		Name[] n = new Name[2];
	
		Police n1 = new Police();
		Doctor n2 = new Doctor();
		
		n[0] = n1;
		n[1] = n2;
		
		//n[0] = new Police();
		//n[1] = new Doctor();
		
		System.out.println(n[0].getName());
		System.out.println(n[1].getName());
		
		
	}
	
}
