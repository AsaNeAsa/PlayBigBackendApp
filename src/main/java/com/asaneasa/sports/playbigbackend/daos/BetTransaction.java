package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.Status;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by avanit on 5/09/16.
 */
@Entity
@Table(name = "BetTransaction")
public class BetTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int betId;
    private int userId;
    private int matchId;
    private int tournamentId;
    private BigDecimal amount;
    private String selectedTeam;
    private BigDecimal selectedOdds;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date created;
    private Date modified;

    public int getBetId() {
        return betId;
    }

    public void setBetId(int betId) {
        this.betId = betId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getSelectedTeam() {
        return selectedTeam;
    }

    public void setSelectedTeam(String selectedTeam) {
        this.selectedTeam = selectedTeam;
    }

    public BigDecimal getSelectedOdds() {
        return selectedOdds;
    }

    public void setSelectedOdds(BigDecimal selectedOdds) {
        this.selectedOdds = selectedOdds;
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
