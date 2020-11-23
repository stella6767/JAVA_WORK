package ch09;

import lombok.Data;


public enum MyLayout {
	West("West","¼­ÂÊ"),
	East("East"),
	South("South"),
	North("North"),
	Center("Center");
	
	private String value;
	private String value2;
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	MyLayout(String value) {
		this.value = value;
	}
	
	private MyLayout(String value,String value2) {
		this.value = value;
		this.value2 = value2;
	}
	
}
