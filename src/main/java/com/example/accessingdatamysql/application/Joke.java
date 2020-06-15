package com.example.accessingdatamysql.application;

import com.fasterxml.jackson.annotation.JsonAlias;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joke {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String type;
    @JsonAlias("setup")
    private String setup;
    @JsonAlias("punchline")
    private String punchline;
    public Joke(){};
    public Joke(Integer id,  String setup, String punchline) {
        this.id = id;
        //this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

   /* public Joke(Integer id, Pieces pieces) {
        this.id = id;
        this.pieces = pieces;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }*/
}
