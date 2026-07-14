package com.project.nbaplayerapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class NbaPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String association;
    private String position;

    public NbaPlayer(Integer id, String name, String association, String position) {
        this.id = id;
        this.name = name;
        this.association = association;
        this.position = position;
    }

    public NbaPlayer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssociation() {
        return association;
    }

    public void setAssociation(String association) {
        this.association = association;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        NbaPlayer nbaPlayer = (NbaPlayer) object;
        return Objects.equals(id, nbaPlayer.id) && Objects.equals(name, nbaPlayer.name) && Objects.equals(association, nbaPlayer.association) && Objects.equals(position, nbaPlayer.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, association, position);
    }
}
