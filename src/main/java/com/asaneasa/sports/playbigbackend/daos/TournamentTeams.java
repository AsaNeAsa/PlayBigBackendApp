package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.Status;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by avanit on 5/09/16.
 */
@Entity
@Table(name = "TournamentTeams")
public class TournamentTeams {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tournamentTeamId;
    private int tournamentId;
    private String teamName;
    private BigDecimal tournamentOdds;
    private int tournamenPostion;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date created;
    private Date modified;

    public int getTournamentTeamId() {
        return tournamentTeamId;
    }

    public void setTournamentTeamId(int tournamentTeamId) {
        this.tournamentTeamId = tournamentTeamId;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public BigDecimal getTournamentOdds() {
        return tournamentOdds;
    }

    public void setTournamentOdds(BigDecimal tournamentOdds) {
        this.tournamentOdds = tournamentOdds;
    }

    public int getTournamenPostion() {
        return tournamenPostion;
    }

    public void setTournamenPostion(int tournamenPostion) {
        this.tournamenPostion = tournamenPostion;
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
