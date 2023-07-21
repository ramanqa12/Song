package song;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String songplayed = in.nextLine();
		songsplaylist(songplayed);
	}

	public static void songsplaylist(String songsplayed) {
		LinkedList<String> SongsListToBePlayed = new LinkedList<String>();
		String songplaying = songsplayed;
		switch (songplaying) {
		// When first 3songs are played
		case "S1,S2,S3":
			SongsListToBePlayed = new LinkedList<String>();
			SongsListToBePlayed.add("S1");
			SongsListToBePlayed.add("S2");
			SongsListToBePlayed.add("S3");
			System.out.println("Songs list is played :" + SongsListToBePlayed);
			break;
		// When S4 are played
		case "S4":
			SongsListToBePlayed = new LinkedList<String>();
			SongsListToBePlayed.add("S2");
			SongsListToBePlayed.add("S3");
			SongsListToBePlayed.add("S4");
			System.out.println("Songs list is played :" + SongsListToBePlayed);
			break;
			// When S2 are played
		case "S2":
			SongsListToBePlayed = new LinkedList<String>();
			SongsListToBePlayed.add("S3");
			SongsListToBePlayed.add("S4");
			SongsListToBePlayed.add("S2");
			System.out.println("Songs list is played :" + SongsListToBePlayed);
			break;
			// When S1 are played
		case "S1":
			SongsListToBePlayed = new LinkedList<String>();
			SongsListToBePlayed.add("S4");
			SongsListToBePlayed.add("S2");
			SongsListToBePlayed.add("S1");
			System.out.println("Songs list is played :" + SongsListToBePlayed);
			break;
		}
	}
}