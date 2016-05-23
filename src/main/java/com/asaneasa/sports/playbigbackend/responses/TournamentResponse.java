package com.asaneasa.sports.playbigbackend.responses;

import java.util.Date;

/**
 * Created by adi2ky on 3/13/16.
 */
public class TournamentResponse {
    private int tournamentId;
    private String name;
    private String description;
    private Date startTime;

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
