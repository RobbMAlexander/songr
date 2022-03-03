package com.robbmalexander.songr.model;

import javax.persistence.*;

@Entity
public class Song {

    public Song() {
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    String title;
    int trackNumber;
    int length;

    @ManyToOne
    Album trackOnAlbum;

    public Song(String title, int trackNumber, int length) {
        this.title = title;
        this.trackNumber = trackNumber;
        this.length = length;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Album getTrackOnAlbum() {
        return trackOnAlbum;
    }

    public void setTrackOnAlbum(Album trackOnAlbum) {
        this.trackOnAlbum = trackOnAlbum;
    }



}
