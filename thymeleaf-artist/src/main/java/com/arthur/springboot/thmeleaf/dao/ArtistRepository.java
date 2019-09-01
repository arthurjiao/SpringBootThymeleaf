package com.arthur.springboot.thmeleaf.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.springboot.thmeleaf.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
public List<Artist> findAllByOrderByLastNameAsc();
}
