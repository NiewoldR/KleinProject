
package com.niewold.r.player.services;

import com.niewold.r.player.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayersService extends CrudRepository<Player, Integer> {

}

