package com.example.accessingdatamysql.application;

import java.util.List;

public class JokeBean {
    private List<Joke> jokes;

    public JokeBean(List<Joke> jokes) {
        this.jokes = jokes;
    }

    public List<Joke> getJokes() {
        return jokes;
    }

    public void setJokes(List<Joke> jokes) {
        this.jokes = jokes;
    }
}
