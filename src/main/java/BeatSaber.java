import beatsaber.Song;
import beatsaber.nested.Event;
import beatsaber.nested.Note;
import beatsaber.nested.Obstacle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * Created by Moon on 7/29/2018
 * Loads a Beat Saber song's json file.
 * It is currently set up to move all the notes by a user-specified
 * number of beats. It could potentially be used for anything, though.
 */

public class BeatSaber {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Get user's preferences
        System.out.print("File: ");
        String file = input.nextLine();

        System.out.print("Beats to adjust by: ");
        double beats = Double.parseDouble(input.nextLine());

        //Read json file
        JsonReader jsonReader = new JsonReader(new FileReader(file));
        Song song = new Gson().fromJson(jsonReader, Song.class);

        System.out.println("Events:");
        for (Event e : song.get_events()) {
            System.out.print(e.get_time() + " --> ");
            e.set_time(e.get_time() + beats);
            System.out.println(e.get_time());
        }

        System.out.println("\nNotes:");
        for (Note n : song.get_notes()) {
            System.out.print(n.get_time() + " --> ");
            n.set_time(n.get_time() + beats);
            System.out.println(n.get_time());
        }

        System.out.println("\nObstacles:");
        for (Obstacle o : song.get_obstacles()) {
            System.out.print(o.get_time() + " --> ");
            o.set_time(o.get_time() + beats);
            System.out.println(o.get_time());
        }

        //Write output file
        try (Writer writer = new FileWriter(file)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(song, writer);
        }
        System.out.println("Done. File saved.");
    }
}
