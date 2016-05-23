package com.asaneasa.sports.playbigbackend.daos;

import com.asaneasa.sports.playbigbackend.daos.enums.Status;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by avanit on 5/09/16.
 */
@Entity
@Table(name = "Tournament")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tournamentId;
    private String name;
    private String description;
    private Date startTime;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date created;
    private Date modified;

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
