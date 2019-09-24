/**
 * 
 */
package uk.ac.belfastmet.tasks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.tasks.service.TaskServices;

/**
 * @author William - BASIC
 *
 */

@Controller
@RequestMapping
public class TaskController {
	
	Logger log = LoggerFactory.getLogger(TaskController.class);
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getHome(Model model) {
		log.info("HOME PAGE exec");

		return "index";
	}
	
	
	
	@RequestMapping(value = "/taskList", method = RequestMethod.GET) 
	public String gettaskList(Model model) {
		log.info("ON TASKLIST PAGE");

		TaskServices taskServices = new TaskServices();

		model.addAttribute("tasks", taskServices.getTasks());

		log.info("taskList exec" + taskServices.getTasks().toString());
		return "taskList";
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin() {
		log.info("ON LOGIN PAGE");

		return "login";
	}

	
}
