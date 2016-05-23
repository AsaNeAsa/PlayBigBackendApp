package com.asaneasa.sports.playbigbackend.controllers;

import com.asaneasa.sports.playbigbackend.daos.User;
import com.asaneasa.sports.playbigbackend.repositories.UserRepository;
import com.asaneasa.sports.playbigbackend.responses.UserResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TournamentController {
    @Autowired
    private UserRepository userRepository;
    private final static Logger LOGGER = Logger.getLogger(TournamentController.class);

    @RequestMapping("/user")
    public UserResponse getAllTournaments(@RequestParam(value="firstName", defaultValue="Aditya") String firstName) {
        UserResponse userResponse = new UserResponse();
        try {

            LOGGER.debug(String.format("%s user finding", firstName));
            User user = userRepository.findByFirstName(firstName);
            if (user != null) {
                userResponse = new UserResponse()
                        .setFirstName(user.getFirstName())
                        .setLastName(user.getLastName())
                        .setVirtualBalance(user.getVirtualBalance());
                LOGGER.debug(String.format("%s user found", firstName));
            } else {
                LOGGER.debug(String.format("%s user not found", firstName));
            }

        }
        catch (Exception ex) {
            LOGGER.debug(String.format("%s user not found", firstName));
        }
        return userResponse;
    }

}
