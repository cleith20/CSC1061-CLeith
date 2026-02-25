package edu.frcc.csc1061j.PlaylistManager;

import java.util.List;

public class PlayListManager {

	public static void main(String[] args) {
		List<Song> MyPlaylist = new MyDoubleLinkedList<>();
		
		MyPlaylist.add(new Song("Can't Say", "Travis Scott"));
		MyPlaylist.add(new Song("Low", "SZA"));
		MyPlaylist.add(new Song("Alien Superstar", "Beyonce"));
		
	}

}
