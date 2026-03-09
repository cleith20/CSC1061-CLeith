package edu.frcc.csc1061j.PlaylistManager;

import java.util.List;

public class PlayListManager {

	public static void main(String[] args) {
		List<Song> myPlaylist = new MyDoubleLinkedList<>();
		
		myPlaylist.add(new Song("Can't Say", "Travis Scott"));
		myPlaylist.add(new Song("Low", "SZA"));
		myPlaylist.add(new Song("Alien Superstar", "Beyonce"));
		myPlaylist.add(new Song("United in Grief", "Kendrick Lamar"));
		
		for(Song song : myPlaylist) {
			System.out.println(song);
		}
	}

}
