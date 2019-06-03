
package com.niewold.r.player.services;

import com.niewold.r.player.model.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PositionService extends CrudRepository<Position, Integer> {

}

