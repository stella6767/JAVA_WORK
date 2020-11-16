package ch04;

public class CalculatorApp {

	public static void main(String[] args) {

		Calculator test = new Calculator();

		int result;

		result = test.add(10, 5);

		result = test.multi(result, 20);

		result = test.divid(result, 5);

		result = test.minus(result, 100);

		System.out.println(result);

	}
}
