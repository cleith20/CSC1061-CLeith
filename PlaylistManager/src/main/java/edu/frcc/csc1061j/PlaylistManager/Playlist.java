package edu.frcc.csc1061j.PlaylistManager;

import java.util.List;
import java.util.Random;

public class Playlist<Song> {
	private Song song;
	private int size;

	
	public void swapSong(int i, int j) {
		Song temp = song.get(i);
		song.set(i, cards.get(j));
		song.set(j, temp);
	}
	
	public void shuffle() {
		Random random = new Random();
		for (int i = playlist.size() - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			swapCards(i, j);
		}
		
	}
}

