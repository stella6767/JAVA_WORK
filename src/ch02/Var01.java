package ch02;

//자바는 .class 파일을 실행하면 static 부분을 메모리에 로드한다.(static 공간에)
//static 공간에 있는 main()함수를 찾아서 호출하고
// 이때 stack이 생성되는데 이 stack의 이름은 main이라고 한다.
//main에 stack 종료되면 프로그램 종료
public class Var01 {
	public static void main(String[] args) {
		// code 부분

		int num = 6;
		System.out.println("첫번째"); // stack 부분 = 함수가 호출될때만 떳다가 사라짐
		System.out.println("두번째"); // 따라서 용량을 거의 차지하지 않음

	}// end of main
}
