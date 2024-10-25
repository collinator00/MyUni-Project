package com.myuni.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long event_id;

    @Column(nullable = false)
    private String event_name;

    @Column(nullable = false)
    private Date event_date;

    @Column(nullable = false)
    private String location;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private Date created;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    // Getters and Setters
    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Users getUser () {
        return user;
    }

    public void setUser (Users user) {
        this.user = user;
    }
}