
package com.niewold.r.player.services;

import com.niewold.r.player.model.Coach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CoachService extends CrudRepository<Coach, Integer> {

}

