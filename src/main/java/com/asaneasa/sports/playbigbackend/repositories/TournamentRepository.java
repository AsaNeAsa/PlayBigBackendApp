package com.asaneasa.sports.playbigbackend.repositories;

import com.asaneasa.sports.playbigbackend.daos.Tournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by adi2ky on 3/14/16.
 */
@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Integer> {
    ArrayList<Tournament> getTournaments();
}
