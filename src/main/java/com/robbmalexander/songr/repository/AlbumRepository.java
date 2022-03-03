package com.robbmalexander.songr.repository;

import com.robbmalexander.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    /*
    public Album findByTitle (String title);
    public Album findByArtist (String artist);
    public Album findBySongCount (int songCount);
     */
}
