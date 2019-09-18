
package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.service.DwarfService;;


@Controller
@RequestMapping
public class DwarfsController {

	@GetMapping
	public String homepage() {
		
		return "index";
	}
	
	
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("pagetitle", "Disney dwarfs rule ok!");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		
		return "disney";
	}
	
	
	@GetMapping("/tolken")
	public String tolkenPage() {
		
		return "tolken";
	}
}
