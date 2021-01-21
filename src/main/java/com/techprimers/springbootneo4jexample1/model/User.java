package com.techprimers.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class User {

    @GraphId
    private Long id;
    private String nom;

    public int getNotebus() {
        return notebus;
    }

    public void setNotebus(int notebus) {
        this.notebus = notebus;
    }

    public int getNotetram() {
        return notetram;
    }

    public void setNotetram(int notetram) {
        this.notetram = notetram;
    }

    public int getNotetaxi() {
        return notetaxi;
    }

    public void setNotetaxi(int notetaxi) {
        this.notetaxi = notetaxi;
    }

    private int notebus ;
    private int notetram ;
    private int notetaxi;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public void setAge(int age) {
        this.age = age;
    }



    private String handicap ;
    private int age;






    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}
