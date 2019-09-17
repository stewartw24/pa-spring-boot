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
@RequestMapping("/toystory")

public class ToyStoryController {
	
	@GetMapping("")
	public String home() {
		return "Characters in the Toy Story movie";
	}
	
	@GetMapping("/Woody")
	public String woody() {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/Buzz")
	public String buzz() {
		return "Buzz was played by Tim Allen";
	}

}
