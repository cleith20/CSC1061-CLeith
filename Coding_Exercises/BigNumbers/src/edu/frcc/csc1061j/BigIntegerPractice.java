package edu.frcc.csc1061j;

import java.math.BigInteger;

public class BigIntegerPractice {

	public static void main(String[] args) {
		
		int n = 56;
		BigInteger ans = BigInteger.valueOf(1);
		
		for(int i = n; i > 0; i--) {
			ans = ans.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The answer is: " + ans);
	}

}
