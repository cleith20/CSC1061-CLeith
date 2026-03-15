package edu.frcc.csc1061j.MyBookTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class MyBookTree implements Iterable<MyBookNode>{

	private MyBookNode root; // only data member

	public MyBookTree(String title) {
		root = new MyBookNode(title, 0, 0, 0);
	}

	public boolean addBookNode(String title, int chapNum, int secNum, int subSecNum) {
		MyBookNode node = new MyBookNode(title, chapNum, secNum, subSecNum);
		// This is a chapter
		if (secNum == 0) {
			root.getChildNodes().add(node);
			Collections.sort(root.getChildNodes());
			return true;
		}
		// This is a section
		if (subSecNum == 0) {
			for (MyBookNode chap : root.getChildNodes()) {
				if (chap.getChapNum() == chapNum) {
					chap.getChildNodes().add(node);
					Collections.sort(chap.getChildNodes());
					return true;
				}
			}
		} 
		// This is a subsection
		else {
			for (MyBookNode chap : root.getChildNodes()) {
				if (chap.getChapNum() == chapNum) {
					for (MyBookNode section : chap.getChildNodes()) {
						if (section.getSecNum() == secNum) {
							section.getChildNodes().add(node);
							Collections.sort(section.getChildNodes());
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public Iterator<MyBookNode> iterator() {
		return new RecursiveIterator();
	}
	
	private class RecursiveIterator implements Iterator<MyBookNode> {
		Deque<MyBookNode> queue = new ArrayDeque<>();
		
		public RecursiveIterator() {
			preorder(root);
		}
		private void preorder(MyBookNode node) {
			queue.add(node);
			if(node.getChildNodes() == null || node.getChildNodes().isEmpty()) {
				return;
			}
			else {
				for(MyBookNode child : node.getChildNodes()) {
					preorder(child);
				}
			}
		}
		@Override
		public boolean hasNext() {
			return !queue.isEmpty();
		}
		@Override
		public MyBookNode next() {
			return queue.removeFirst();
		}
	}
	
	private class MyBookIterator implements Iterator<MyBookNode> {
		Deque<MyBookNode> stack;
		
		public MyBookIterator() {
			stack = new ArrayDeque<>(); // built stack
			stack.push(root);
		}
		@Override
		public boolean hasNext() {
			if(!stack.isEmpty()) {
				return true;
			}
			return false;
		}

		@Override
		public MyBookNode next() {
			MyBookNode node = stack.pop();
			List<MyBookNode> children = node.getChildNodes(); 
			
			
			List<MyBookNode> copy = new ArrayList<MyBookNode>(children);     // We cannot modify the original list, make copy
			
			
			Collections.reverse(copy);   // Reverse the copy list
			
			for(MyBookNode child : copy) {
				stack.push(child);
			}
			return node;
		}
		
	}

}
