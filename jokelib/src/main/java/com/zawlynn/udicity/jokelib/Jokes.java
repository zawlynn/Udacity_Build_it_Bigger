package com.zawlynn.udicity.jokelib;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Jokes {
    List<String> jokes=new ArrayList<String >();
    private static Jokes instance;
    public static Jokes getInstance(){
        if(instance==null){
            instance=new Jokes();
        }
        return instance;
    }
    private Jokes(){
        jokes.add("Can a kangaroo jump higher than a house?\" +\"\\n\" + \"Of course, a house doesn't jump at all");
        jokes.add("Anton, do you think I'm a bad mother?" + "\n" + "My name is Paul.");
        jokes.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away");
        jokes.add("What is the difference between a snowman and a snowwoman?" + "\n" + "Snowballs");
        jokes.add("My relationship is like an iPad. I don't have an iPad.");
        jokes.add("I am nobody. Nobody is perfect. I am perfect.");
        jokes.add("I'm not lazy. I'm just naturally a very relaxed person.");
        jokes.add("I'm standing outside. In other words, I'm outstanding.");
        jokes.add("Stressed is just desserts spelled backwards.");
        jokes.add("He who wakes up early, yawns all day long.");
        jokes.add("Dogs have beloved masters. Cats have waiting staff.");
    }
    public String getJoke(){
        int index = ThreadLocalRandom.current().nextInt(0, 10);
        return jokes.get(index);
    }
}
