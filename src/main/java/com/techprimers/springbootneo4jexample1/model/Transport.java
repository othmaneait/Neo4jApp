package com.techprimers.springbootneo4jexample1.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Transport {

    @GraphId
    private Long id;
    private String nom;







    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public Transport() {

    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }


}
