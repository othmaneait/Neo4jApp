package com.techprimers.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class User {

    @GraphId
    private Long id;
    private String nom;

    public String getNotebus() {
        return notebus;
    }

    public void setNotebus(String notebus) {
        this.notebus = notebus;
    }

    public String getNotetram() {
        return notetram;
    }

    public void setNotetram(String notetram) {
        this.notetram = notetram;
    }

    public String getNotetaxi() {
        return notetaxi;
    }

    public void setNotetaxi(String notetaxi) {
        this.notetaxi = notetaxi;
    }

    private String notebus ;
    private String notetram ;
    private String notetaxi;

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
