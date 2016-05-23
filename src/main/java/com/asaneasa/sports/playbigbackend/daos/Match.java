package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.Status;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by avanit on 5/09/16.
 */
@Entity
@Table(name = "Match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int matchId;
    private int tournamentId;
    private String teamA;
    private String teamB;
    private BigDecimal oddsA;
    private BigDecimal oddsB;
    private Date startTime;
    private String teamWon;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date created;
    private Date modified;

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public BigDecimal getOddsA() {
        return oddsA;
    }

    public void setOddsA(BigDecimal oddsA) {
        this.oddsA = oddsA;
    }

    public BigDecimal getOddsB() {
        return oddsB;
    }

    public void setOddsB(BigDecimal oddsB) {
        this.oddsB = oddsB;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTeamWon() {
        return teamWon;
    }

    public void setTeamWon(String teamWon) {
        this.teamWon = teamWon;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
