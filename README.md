# Music Library

A simple Java application demonstrating object-oriented programming through three related classes: `Song`, `Playlist`, and `MusicLibrary`.

This project was created as part of a software development portfolio. The code will be documented, reviewed, and refactored through later activities.

## Project Overview

The application represents a basic music library where songs can be organised into playlists.

The project currently supports:

- Creating songs with a title, artist, and duration
- Creating playlists
- Adding songs to a playlist
- Removing songs from a playlist by title
- Counting the songs in a playlist
- Calculating the total duration of a playlist
- Creating and finding playlists in the music library

## Classes

### Song

The `Song` class represents an individual music track.

Each song contains:

- A title
- An artist
- A duration in seconds

The class also provides methods for accessing these values and displaying the song's details.

### Playlist

The `Playlist` class represents a collection of `Song` objects.

It is responsible for:

- Adding songs
- Removing songs by title
- Counting songs
- Calculating the total duration of the playlist

### MusicLibrary

The `MusicLibrary` class manages a collection of `Playlist` objects.

It is responsible for:

- Creating playlists
- Finding a playlist by name
- Returning the number of playlists in the library

## Class Relationships

The three classes use a has-a relationship:

```text
MusicLibrary
    |
    +-- contains Playlist objects
                       |
                       +-- contains Song objects
```

A `MusicLibrary` can contain multiple playlists, and each `Playlist` can contain multiple songs.

## Technologies Used

- Java
- Java Collections Framework
- `ArrayList`
- `List`
- Git
- GitHub

## Project Structure

```text
music-library/
├── README.md
└── src/
    ├── Song.java
    ├── Playlist.java
    └── MusicLibrary.java
```

The exact structure may differ depending on the IDE used.

## How to Run the Project

### 
