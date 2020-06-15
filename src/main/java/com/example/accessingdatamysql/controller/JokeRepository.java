package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.application.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke,Integer> {
}
