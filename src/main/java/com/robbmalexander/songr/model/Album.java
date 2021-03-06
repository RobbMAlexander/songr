package com.robbmalexander.songr.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Album {

    //Default constructor
    public Album() {
    }

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    int songCount;
    int length;
    String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    @OneToMany(mappedBy="trackOnAlbum")
    @OrderBy("trackNumber")
    List<Song> trackList;

    public List<Song> getTrackList() {
        return trackList;
    }



}
