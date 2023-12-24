package com.mta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mta.model.Artists;
import com.mta.service.ArtistService;

@RestController
public class ArtistController {
	
	@Autowired
	private ArtistService artistService;
	
	@GetMapping("/artists/{country}")
	public Artists getTopArtistsDetails(@PathVariable String country) {
		return artistService.fetchArtistsByCountry(country);
	}
}
