package uk.ac.belfastmet.topTen.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.topTen.domain.TopTen;
import uk.ac.belfastmet.topTen.service.TopTenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




@Controller
@RequestMapping
public class TopTenController {
	
	Logger logger =
			LoggerFactory.getLogger(TopTenController.class);

	@GetMapping
	public String homepage() {
		
		return "index";
	}
	
	@RequestMapping(value="/singles")
	@GetMapping("/singles") 
	public String singlesPage(Model model) {
		logger.info("An info message");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pagetitle", "Top Ten Singles!");
		model.addAttribute("singles", topTenService.gettopTenSingles());
		model.addAttribute("singleschart", "10");
		
		return "singles";
	}
	
	
	@GetMapping("/album")
	public String albumPage(Model model) {
		logger.info("An info message ***2***");
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pagetitle", "Top Ten Albums!");
		model.addAttribute("albums", topTenService.gettopTenAlbums());
		model.addAttribute("albumschart", "10");
		
		return "albums";
	}
}
