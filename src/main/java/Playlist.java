import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public boolean removeSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                songs.remove(song);
                return true;
            }
        }
        return false;
    }

    public int getTotalDuration() {
        int totalDuration = 0;

        for (Song song : songs) {
            totalDuration += song.getDuration();
        }

        return totalDuration;
    }

    public int getSongCount() {
        return songs.size();
    }

    public String getName() {
        return name;
    }
}