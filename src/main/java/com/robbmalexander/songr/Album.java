package com.robbmalexander.songr;

public class Album {

    String title;
    String artist;
    int songCount;
    //TODO: change data type for length to float/double?
    int length;
    String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }
}
