package com.arthur.springboot.thmeleaf.service;

import java.util.List;

import com.arthur.springboot.thmeleaf.entity.Artist;

public interface ArtistService {
	public List<Artist> findAll();
	public Artist findById(int theID);
	public void save(Artist theEmployee);
	public void deleteById(int theID);
	
}
