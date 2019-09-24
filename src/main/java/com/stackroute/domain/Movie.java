package com.stackroute.domain;

public class Movie {
    private Actor actor;

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
        System.out.println("Injecting Actor using Constructor");
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("Injecting Actor using setter()");
    }
    public void getInfo(){
        System.out.println("Movie has actor: (" + actor.getName() + ", " + actor.getGender() + ", " + actor.getAge() + ")");
    }
}
