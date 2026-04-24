package edu.frcc.csc1061j.PlaylistManager;

import java.util.Random;

public class Playlist<E> extends MyDoubleLinkedList<Song>  {
	private Song song;

	public Playlist() {

	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = size() - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			switchSongs(i, j);
		}
	}

	public void switchSongs(int s1, int s2) {
		Song song1 = get(s1);
		Song song2 = get(s2);
		set(s2, song1);
		set(s1, song2);
	}

}
