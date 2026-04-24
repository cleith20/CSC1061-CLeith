package edu.frcc.csc1061j.MyPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapSort {

	public static void main(String[] args) {
		int[] nodes = {88, 85, 83, 72, 73, 42, 57, 6, 48, 60};
		
		// Ours
		MyPriorityQueue<Integer> pq = new MyPriorityQueue<>();
		
		for(int node : nodes) {
			pq.add(node);
		}

		System.out.println("My Priority Removal: ");
		
		while(!pq.isEmpty()) {
			System.out.print(pq.remove() + " ");
		}
		System.out.println();
		
		
		// Theirs
		PriorityQueue<Integer> pqs = new PriorityQueue<>();
		for(int node : nodes) {
			pqs.add(node);
		}
		System.out.println("Priority PQS Removal: ");
				
				while(!pqs.isEmpty()) {
					System.out.print(pqs.remove() + " ");
				}
				System.out.println();
		
		PriorityQueue<Integer> pqr = new PriorityQueue<>(Collections.reverseOrder());
		for(int node : nodes) {
			pqr.add(node);
		}
		System.out.println("Priority PQR Removal: ");
				
				while(!pqr.isEmpty()) {
					System.out.print(pqr.remove() + " ");
				}
				System.out.println();
	}

}
