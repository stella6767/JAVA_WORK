package ch05;

class 지구인 {
	String name ="지구인";
}

class 한국인 extends 지구인{
	String name ="한국인";
}

class 부산인 extends 한국인{
	String name ="부산인";
}



public class Inherit02 {

	public static void main(String[] args) {
		//부산인 b = new 한국인(); 부산인은 메모리에 안 뜸, new 한국인이면 한국인부터 지구인 메모리에 띄움!
		
		//heap(한국인, 지구인) -> 포인터(지구인)
		지구인 b = new 한국인();
		
		//1.b는 한국인, 지구인이 메모리에 다 떠있기 때문에 다운캐스팅 가능
		한국인 h = (한국인)b;
		
		try {
			부산인 busan = (부산인)b; //컴파일러가 오류를 잡아내지 못함, 메모리에 부산인이 안 떠 있으므로 실행오류가 뜸.
			
		} catch (Exception e) {
			//개발자가 핸들링 할 수 있음.(로그 파일)
			System.out.println("오류 발생했는데 무시해도 돼");
		}
		
		
	}

}
