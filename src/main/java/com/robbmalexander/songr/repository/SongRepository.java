package com.robbmalexander.songr.repository;

import com.robbmalexander.songr.model.Album;
import com.robbmalexander.songr.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

    /*
    public Song findByTitle(String title);
    public Song findByAlbum(String Album);
    public Song findByTrackNumber(String trackNumber);
     */

}
