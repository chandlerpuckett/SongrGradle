package com.chandlerpuckett.SongrGradle;

public class Song extends Album {
    String songTitle;
    String album;
    int songLength;
    int trackNumber;

    public Song(String title,
                String artist,
                String imageUrl,
                int songCount,
                int length,
                String songTitle,
                String album,
                int songLength,
                int trackNumber) {
        super(title, artist, imageUrl, songCount, length);
        this.songTitle = songTitle;
        this.album = album;
        this.songLength = songLength;
        this.trackNumber = trackNumber;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
