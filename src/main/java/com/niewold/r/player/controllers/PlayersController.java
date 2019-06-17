package com.niewold.r.player.controllers;

import com.niewold.r.player.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.niewold.r.player.services.PlayersService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

/*@Controller
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
*/
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PlayersController {

  @Autowired
  private PlayersService playerService;

  @PostMapping("/playerlist")
  public Player create(@RequestBody Player player) {
    return playerService.save(player);
  }

  @PutMapping("/playerlist")
  public Player update(@RequestBody Player player) {
    return playerService.save(player);
  }

  @ResponseStatus(value = HttpStatus.OK)
  @DeleteMapping("/playerlist/{id}")
  public void delete(@PathVariable int id) {
    playerService.deleteById(id);
  }

  @GetMapping("/playerlist")
  public List<Player> findAll() {
    return (List<Player>) playerService.findAll();
  }

  @GetMapping("/playerlist/{id}")
  public Optional<Player> loginById(@PathVariable int id) {
    return playerService.findById(id);


  }}
