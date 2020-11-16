package 실습;

class Main {
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
		Song abba = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		abba.show();
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
		
	}
}
