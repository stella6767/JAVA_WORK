package ch05;

public abstract class Factory {
	
	protected abstract void 색칠(); //하는건 같지만 내용은 다 다를때
	protected void 건조() { //무조건 모두 자식이 똑같은 내용의 행위
		System.out.println("건조완료");
	}
	
	public void 가동() {
		색칠();
		건조();
	}
	
}
