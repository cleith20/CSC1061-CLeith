
public class Fibonacci {

	public static void main(String[] args) {
		int num = 3;
		
		System.out.println("The answer is " + fibonacciIterator(6));

	}
	public static int fibonacci(int term) {
		if(term < 2) {
			return term;
		}
		return fibonacci(term-1)+ fibonacci(term-2);
	}
	public static int fibonacciIterator(int term) {
		if(term < 2) {
			return term;
		}
		int answer = 0;
		int term1 = 1;
		int term2 = 0;
		
		for(int i = 2; i <= term; i++) {
			answer = term1 + term2;
			term2 = term1;
			term1 = answer;
		}
		return answer;
	}

}
