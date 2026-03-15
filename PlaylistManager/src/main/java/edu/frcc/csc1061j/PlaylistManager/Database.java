package edu.frcc.csc1061j.PlaylistManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Database {
	private File playlistDatabase;
	PrintWriter printer;
	Scanner reader;

	public Database(String fileName) {
		playlistDatabase = new File(fileName +".csv");
		try {
			if (!playlistDatabase.exists()) {
				playlistDatabase.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("Could not create database.");
			System.exit(-1);
		}
		try {
			printer = new PrintWriter(playlistDatabase);
			reader = new Scanner(playlistDatabase);
		} catch (FileNotFoundException e) {
			System.out.println("Database could not be found");
			System.exit(-1);
		}
	}

	
	public void writeSong(Song song) {
		printer.print(song.getTitle());
		printer.print("," + song.getArtist());
		printer.println();
		printer.flush();
	}

	public List<Song> readDatabase() {
		String line;
		List<Song> playlist = new ArrayList<>();
		while (reader.hasNextLine()) {
			line = reader.nextLine();
			String[] tokens = line.split(",");
			Song song = null;
			song = new Song(tokens[1].trim(), tokens[2].trim());
			playlist.add(song);
		}
		return playlist;
	}
}
