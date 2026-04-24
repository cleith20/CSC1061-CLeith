package edu.frcc.csc1061j.PlaylistManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayListManager {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Playlist<Song> myPlaylist = new Playlist<>();
		System.out.println("*** Playlist Manager! ***\r\n" + "Commands:\r\n" + "add\r\n" + "remove\r\n" + "count\r\n"
				+ "play\r\n" + "shuffle\r\n" + "reverse\r\n" + "save\r\n"  + "load\r\n"+ "quit");
		String answer = "go";
		while (!answer.equals("quit")) {
			answer = scan.nextLine().toLowerCase();
			if (answer.equals("add")) {
				System.out.println("Enter artist: ");
				String artist = scan.nextLine();
				System.out.println("Enter song title: ");
				String title = scan.nextLine();
				myPlaylist.add(new Song(title, artist));
			} else if (answer.equals("remove")) {
				System.out.println("Enter artist: ");
				String artist = scan.nextLine();
				System.out.println("Enter song title: ");
				String title = scan.nextLine();
				Song s = new Song(title, artist);
				for (int i = 0; i < myPlaylist.size(); i++) {
					if (myPlaylist.get(i).compareTo(s) == 0) {
						myPlaylist.remove(i);
					}
				}
			} else if (answer.equals("count")) {
				System.out.println(myPlaylist.count());
			} else if (answer.equals("reverse")) {
				myPlaylist.reverse();
			} else if (answer.equals("shuffle")) {
				myPlaylist.shuffle();
			} else if (answer.equals("play")) {
				for (Song song : myPlaylist) {
					System.out.println(song);
				}
			} else if (answer.equals("save")) {
				System.out.println("Enter filename: ");
				String fileName = scan.nextLine();
				Database db = new Database(fileName);
				for(Song song : myPlaylist ) {
					db.writeSong(song);
				}
			} else if(answer.equals("load")) {
				System.out.println("Enter filename: ");
				String fileName = scan.nextLine();
				Database db = new Database(fileName);
				List<Song> playlist = new ArrayList<>();
				playlist = db.readDatabase();
				System.out.println(playlist);
			}
			
		}
	}
}