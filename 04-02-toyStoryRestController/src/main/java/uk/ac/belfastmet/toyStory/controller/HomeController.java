/**
 * 
 */
package uk.ac.belfastmet.toyStory.controller;

import org.springframework.stereotype.Controller;

/**
 * @author ste19171854
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping()
public class HomeController {

	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
	