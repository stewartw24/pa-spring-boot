/**
 * 
 */
package uk.ac.belfastmet.toyStory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ste19171854
 *
 */

@RestController
@RequestMapping("/shrekmovie")

public class ShrekContrtoller {
	
	@GetMapping("/")
	public String home() {
		return "Characters in the movie Shrek";
	}
	
	@GetMapping("/Shrek")
	public String shrek() {
		return "Shrek was played by Mike Myers";
	}
	
	@GetMapping("/Donkey")
	public String donkey() {
		return "Donkey was played by Eddie Murphy";
	}
	
}
