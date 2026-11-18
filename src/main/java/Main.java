public class Main {

    public static void main(String[] args) {

        Song song1 = new Song("Dreams", "Fleetwood Mac", 257);
        Song song2 = new Song("Yellow", "Coldplay", 269);

        MusicLibrary library = new MusicLibrary();

        Playlist favourites = library.createPlaylist("My Favourites");

        favourites.addSong(song1);
        favourites.addSong(song2);

        System.out.println(song1.getDetails());
        System.out.println("Number of songs: " + favourites.getSongCount());
        System.out.println(
                "Total duration: " + favourites.getTotalDuration() + " seconds"
        );
    }
}

