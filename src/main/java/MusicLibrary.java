import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {

    private List<Playlist> playlists;

    public MusicLibrary() {
        this.playlists = new ArrayList<>();
    }

    public Playlist createPlaylist(String name) {
        Playlist playlist = new Playlist(name);
        playlists.add(playlist);
        return playlist;
    }

    public Playlist findPlaylist(String name) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equals(name)) {
                return playlist;
            }
        }

        return null;
    }

    public int getPlaylistCount() {
        return playlists.size();
    }
}
