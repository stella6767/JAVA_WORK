package �ǽ�;

class Main {
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
		Song abba = new Song("Dancing Queen","ABBA",1978,"������");
		abba.show();
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		
	}
}
