package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.Status;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by avanit on 5/09/16.
 */
@Entity
@Table(name = "TournamentDetails")
public class TournamentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tournamentDetailId;
    private int tournamentId;
    private int userId;
    private int tournamentTeamId;
    private BigDecimal virtualBalance;
    private BigDecimal winnings;
    private int tournamentRanking;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date created;
    private Date modified;

    public int getTournamentDetailId() {
        return tournamentDetailId;
    }

    public void setTournamentDetailId(int tournamentDetailId) {
        this.tournamentDetailId = tournamentDetailId;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTournamentTeamId() {
        return tournamentTeamId;
    }

    public void setTournamentTeamId(int tournamentTeamId) {
        this.tournamentTeamId = tournamentTeamId;
    }

    public BigDecimal getVirtualBalance() {
        return virtualBalance;
    }

    public void setVirtualBalance(BigDecimal virtualBalance) {
        this.virtualBalance = virtualBalance;
    }

    public BigDecimal getWinnings() {
        return winnings;
    }

    public void setWinnings(BigDecimal winnings) {
        this.winnings = winnings;
    }

    public int getTournamentRanking() {
        return tournamentRanking;
    }

    public void setTournamentRanking(int tournamentRanking) {
        this.tournamentRanking = tournamentRanking;
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
