package edu.frcc.csc1061j;

import java.math.BigDecimal;

// In the financial world, they use BigDecimal
public class BigDecimalPractice {

	public static void main(String[] args) {
		
		double num = 0.1;
		double ans = num*num;

		BigDecimal ans1 = BigDecimal.valueOf(num).multiply(BigDecimal.valueOf(num));
		
		System.out.println("Answer: " + ans);
		
		System.out.println("Answer: " + ans1);
	}

}
