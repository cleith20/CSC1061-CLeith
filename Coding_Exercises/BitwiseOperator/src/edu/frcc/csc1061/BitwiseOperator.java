package edu.frcc.csc1061;

public class BitwiseOperator {

	private static final int NUM_LIGHTS = 32;

	public static void main(String[] args) {

		boolean[] xmasLts = new boolean[NUM_LIGHTS];

		// Turn them all on
		for (int i = 0; i < NUM_LIGHTS; i++) {
			xmasLts[i] = true;
		}
		for (int i = 0; i < NUM_LIGHTS; i++) {
			if (i % 2 == 0) {
				xmasLts[i] = false;
			} else {
				xmasLts[i] = true;
			}
		}
		
		int xmasBts = 0xFFFFFFFF;
		int mask = 1;
		for (int i = 0; i < NUM_LIGHTS; i++) {
			System.out.printf("%-6b", (xmasBts & mask) != 0);
			mask = mask << 1;
		}
		System.out.println();
		
		// turn off all even lights, and
		mask = 1;
		xmasBts &= 0xAAAAAAAA;
		for (int i = 0; i < NUM_LIGHTS; i++) {
			System.out.printf("%-6b", (xmasBts & mask) != 0);
			mask = mask << 1;
		}
		System.out.println();
		
		
		// Flip all switches, xor
		xmasBts ^= 0xFFFFFFFF;
		mask = 1;
		for (int i = 0; i < NUM_LIGHTS; i++) {
			System.out.printf("%-6b", (xmasBts & mask) != 0);
			mask = mask << 1;
	}
	
	}
}
