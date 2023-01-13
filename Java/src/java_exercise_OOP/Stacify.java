package java_exercise_OOP;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stacify {
    public ArrayList<String> tracks = new ArrayList<>();
    private boolean is_playing = false;
    private int song_index = 0;
    private int prev_count = 0;
    private int idle_count = 0;

    public void addsong(String [] songs)
    {
        //codehere
        for (String song: songs) {
            // Check if the song is valid
            String regex = ".mp3$";
            Pattern music = Pattern.compile(regex);
            Matcher match = music.matcher(song);
            boolean matchFound = match.find();
            // valid,
            if (matchFound){
                // ADD VALID SONGS
                this.tracks.add(song);
            }
        }
    }

    public String playpause()
    {
        //codehere
        // Play if not playing, else pause
        // Therefore , the song object should have is_playing boolean
        if (is_playing){
            is_playing = false;
        }else{
            is_playing = true;
        }
        prev_count = 0;
        idle_count = 0;
        return this.status();
    }

    public String previous()
    {
        //codehere
        // Play the previous song
        // if no other previous song, play again the current song from the start
        // note: the other song must be set to stop/pause
        prev_count++;
        if (prev_count==2){
            song_index = (song_index>0) ? song_index - 1 : 0;
            prev_count = 0;
        }
        idle_count = 0;
        is_playing = true;
        return this.status();
    }

    public String next()
    {
        //codehere
        // Play the next song
        // if no other next song, play again the current song from the start
        // note: the other song must be set to stop/pause
        song_index = (song_index<this.tracks.size()-1) ? song_index + 1 : song_index;
        prev_count = 0;
        idle_count = 0;
        is_playing = true;
        return this.status();
    }

    public void idle()
    {
        //codehere
        idle_count++;
        if (idle_count==3){
            this.next();
        }
        prev_count = 0;
    }

    public String status()
    {
        //codehere
        //check the status if the song is playing or not
        if (this.tracks.isEmpty()){
            is_playing = false;
            return "No Track";
        }else{
            String playingpause = (is_playing) ? ("Playing") : ("Paused");
            return "("+playingpause+") "+this.tracks.get(song_index);
        }
    }
}