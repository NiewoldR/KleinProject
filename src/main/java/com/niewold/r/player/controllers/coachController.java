package com.niewold.r.player.controllers;

import com.niewold.r.player.model.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class coachController {

  @Autowired  
  private com.niewold.r.player.services.CoachService CoachService;

  @RequestMapping("/createCoach")
  String createCoach() {
    return ("/createCoach");
  }

  @RequestMapping(value = "/saveCoach", method = RequestMethod.POST)
  public String create(Coach coach) {
    CoachService.save(coach);
    return "redirect:/coachlist";
  }
  
  @RequestMapping(value = "/coachlist", method = RequestMethod.GET)
  public String findAll(Model model) {
    model.addAttribute("coaches", CoachService.findAll());
    return "coachList";
  }

  @RequestMapping(value = "/deletecoach/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable int id) {
    CoachService.deleteById(id);
    return "redirect:/coachlist";
  }
}

