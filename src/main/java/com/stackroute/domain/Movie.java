package com.stackroute.domain;

public class Movie {
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;
    public void getInfo(){
        System.out.println("Movie has actor: (" + actor.getName() + ", " + actor.getGender() + ", " + actor.getAge() + ")");
    }
}
