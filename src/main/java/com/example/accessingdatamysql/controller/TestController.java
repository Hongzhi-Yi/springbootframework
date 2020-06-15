package com.example.accessingdatamysql.controller;


import com.example.accessingdatamysql.application.Joke;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
//@CrossOrigin
@RequestMapping(value = "test")
//@Service("JokeService")
public class TestController {
    @Autowired
    private JokeRepository jokeRepository;
    @RequestMapping(value="joke")
   public List<Joke> getJokes(){
        Joke joke1=new Joke(1,
               "What did the fish say when it hit the wall?",
                "Dam.");
        Joke joke2=new Joke(2,
                //"general",
                 "How do you make a tissue dance?",
        "You put a little boogie on it.");
        Joke joke3=new Joke(3,
                "What's Forrest Gump's password?",
                "1Forrest1");
        Joke joke4=new Joke(4,
                "What do you call a belt made out of watches?",
                "A waist of time.");
        Joke joke5=new Joke(5,
                "Why can't bicycles stand on their own?",
                "They are two tired");
        //Joke joke=new Joke(1,)
        List<Joke> list=new ArrayList<>();
        list.add(joke1);
        list.add(joke2);
        list.add(joke3);
        list.add(joke4);
        list.add(joke5);

        return list;
    }
    @PostMapping(path = "/add")
    public @ResponseBody String addNewJoke(@RequestBody Joke j){

        jokeRepository.save(j);
        return "Saved";
    }
}
