package com.niewold.r.player.controllers;

import com.niewold.r.player.model.Coach;
import com.niewold.r.player.services.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/*@Controller
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
}*/
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class coachController {

  @Autowired
  private CoachService coachService;

  @PostMapping("/coachlist")
  public Coach create(@RequestBody Coach coach) {
    return coachService.save(coach);
  }

  @PutMapping("/coachlist")
  public Coach update(@RequestBody Coach coach) {
    return coachService.save(coach);
  }

  @ResponseStatus(value = HttpStatus.OK)
  @DeleteMapping("/coachlist/{id}")
  public void delete(@PathVariable int id) {
    coachService.deleteById(id);
  }

  @GetMapping("/coachlist")
  public List<Coach> findAll() {
    return (List<Coach>) coachService.findAll();
  }

  @GetMapping("/coachlist/{id}")
  public Optional<Coach> loginById(@PathVariable int id) {
    return coachService.findById(id);


  }
}
