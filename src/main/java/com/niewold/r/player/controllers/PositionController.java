package com.niewold.r.player.controllers;

import com.niewold.r.player.model.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PositionController {

  @Autowired  
  private com.niewold.r.player.services.PositionService PositionService;

  @RequestMapping(value = "/createposition", method = RequestMethod.POST)
  public String create(Position position) {
    PositionService.save(position);
    return "redirect:/positionlist";
  }
  
  @RequestMapping(value = "/positionlist", method = RequestMethod.GET)
  public String findAll(Model model) {
    model.addAttribute("positions", PositionService.findAll());
    return "positionList";
  }

  @RequestMapping(value = "/deleteposition/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable int id) {
    PositionService.deleteById(id);
    return "redirect:/positionlist";
  }
}

