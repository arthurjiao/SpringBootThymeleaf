package com.arthur.springboot.thmeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arthur.springboot.thmeleaf.entity.Artist;
import com.arthur.springboot.thmeleaf.service.ArtistService;



@Controller
@RequestMapping("/artists")
public class ArtistController {

	private ArtistService artistService;
	
	
	
	public ArtistController(ArtistService artistService) {
		this.artistService = artistService;
	}
	
	@GetMapping("/list")
	public String listArtists(Model theModel) {
		List<Artist> ts=artistService.findAll();
		theModel.addAttribute("artists", ts);
		return "artists/list-artist";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Artist te=new Artist();
		theModel.addAttribute("artist", te);
		return "artists/artist-form";
	}
	@PostMapping("/save")
	public String saveArtist(@ModelAttribute("artist") Artist te) {
		
		artistService.save(te);
		return "redirect:/artists/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("artistId") int theId, Model theModel) {
		
		Artist te=artistService.findById(theId);
		theModel.addAttribute("artist", te);
		return "artists/artist-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("artistId") int theId) {
		
		artistService.deleteById(theId);
		
		return "redirect:/artists/list";
	}	
}
