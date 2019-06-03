package com.niewold.r.player.controllers;

import com.niewold.r.player.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.niewold.r.player.services.*;
import com.niewold.r.player.model.*;

@Controller
public class PlayersController {

  @Autowired  
  private com.niewold.r.player.services.PlayersService PlayersService;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public String create(Player player) {
    PlayersService.save(player);
    return "redirect:/list";
  }
  
  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public String findAll(Model model) {
    model.addAttribute("players", PlayersService.findAll());
    return "playerList";
  }

  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
  public String delete(@PathVariable int id) {
    PlayersService.deleteById(id);
    return "redirect:/list";
  }
}

