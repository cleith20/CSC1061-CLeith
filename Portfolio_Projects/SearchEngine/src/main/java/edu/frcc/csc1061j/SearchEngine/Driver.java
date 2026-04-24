package edu.frcc.csc1061j.SearchEngine;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Driver {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		WikiFetcher wf = new WikiFetcher();
		Index index = new Index();
		String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
		Elements paragraphs = wf.fetchWikipedia(url);
		index.indexPage(url, paragraphs);
		
		url = "https://en.wikipedia.org/wiki/Java";
		paragraphs = wf.fetchWikipedia(url);
		index.indexPage(url, paragraphs);
		
		System.out.print("Enter search term: ");
		String term = scan.next().toLowerCase();
		String result = index.get(term);
		if(result == null) {
			result = "Term not found";
			System.out.println(result);
		}
		else {
		System.out.println(index.get(term));
		}
	}
}
