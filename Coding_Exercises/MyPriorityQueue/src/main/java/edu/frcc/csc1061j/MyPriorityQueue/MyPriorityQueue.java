package edu.frcc.csc1061j.MyPriorityQueue;

import java.util.ArrayList;
import java.util.List;


// min heap
public class MyPriorityQueue <E extends Comparable<E>> {
	private List<E> heapArray;
	
	public MyPriorityQueue() {
		heapArray = new ArrayList<>();
	}
	
	public int size() {
		return heapArray.size();
	}
	
	public boolean isEmpty() {
		return heapArray.isEmpty();
	}
	
	private int lChild(int parIndex) {
		if(parIndex < 0 || parIndex > heapArray.size()) {
			return -1;
		}
		return (2*parIndex)+1;
	}
	
	private int rChild(int parIndex) {
		if(parIndex < 0 || parIndex > heapArray.size()) {
			return -1;
		}
		return (2*parIndex)+2;
	}
	
	private int parent(int pos) {
		if(pos <= 0 || pos >= heapArray.size()) {
			return -1;
		}
		return (pos -1)/2;
	}
	
	private boolean isLeafNode(int pos) {
		return (pos >= heapArray.size()/2 && pos <= heapArray.size());
	}
	
	public void add(E elem) {
		heapArray.add(elem);
		swimUp(heapArray.size()-1);
	}

	private void swimUp(int currNode) {
		int par = parent(currNode);
		while (currNode != 0 && (heapArray.get(currNode).compareTo(heapArray.get(par)) < 0)){
			swap(currNode, par);
			currNode = par;
			par = parent(currNode);
			
		}
		
	}

	private void swap(int pos1, int pos2) {
		E temp = heapArray.get(pos1);
		heapArray.set(pos1, heapArray.get(pos2));
		heapArray.set(pos2, temp);
	}
	
	public E remove() {
		return remove(0);
	}

	public E remove(int pos) {
		swap(pos, heapArray.size()-1);
		E removedEntry = heapArray.remove(heapArray.size()-1);
		if(!heapArray.isEmpty()) {
			siftDown(pos);
		}
		return removedEntry;
	}

	private void siftDown(int currNode) {
		while(!isLeafNode(currNode)) {
			int lc = lChild(currNode);
			int rc = rChild(currNode);
			
			// Assume lc is less than rc
			int child = lc;
			E childElem = heapArray.get(lc);
			
			if(rc > -1 && rc < heapArray.size()) {
				E rcElem = heapArray.get(rc);
				
				// Turns out rc is less than lc
				if(rcElem.compareTo(childElem) < 0) {
					childElem = rcElem;
					child = rc;
				}
			}
			
			// Swap if needed with whichever child is less
			if(heapArray.get(currNode).compareTo(childElem) > 0) {
				swap(currNode, child);
				currNode = child;
			}
			else {
				// Stop process is swap was not needed
				break;
			}
		}
	}
	
}
