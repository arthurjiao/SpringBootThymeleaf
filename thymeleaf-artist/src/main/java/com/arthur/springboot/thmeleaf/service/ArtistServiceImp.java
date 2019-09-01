package com.arthur.springboot.thmeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arthur.springboot.thmeleaf.dao.ArtistRepository;
import com.arthur.springboot.thmeleaf.entity.Artist;
@Service
public class ArtistServiceImp implements ArtistService {
	private ArtistRepository artistDAO;
	
	ArtistServiceImp(ArtistRepository em) {
		artistDAO=em;
	}

	@Override
	
	public List<Artist> findAll() {
		// TODO Auto-generated method stub
		
		return artistDAO.findAllByOrderByLastNameAsc();
	}

	@Override
	
	public Artist findById(int theID) {
		// TODO Auto-generated method stub
		Optional<Artist> result = artistDAO.findById(theID);
		Artist theArtist=null;
		if(result.isPresent()) {theArtist=result.get();}
		else {throw new 
			RuntimeException("did not find artist id-"+theID);}
		return theArtist;
	}

	@Override
	
	public void save(Artist theArtist) {
		// TODO Auto-generated method stub

		artistDAO.save(theArtist);
	}

	@Override
	
	public void deleteById(int theID) {
		// TODO Auto-generated method stub
		artistDAO.deleteById(theID);

	}

}
