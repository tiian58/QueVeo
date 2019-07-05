package com.cinema.queveo.Model;

public class Movie {
    private String name;
    private int last;
    private Genres genres;
    private double ranting = 0;

    public Movie(String name, int last, Genres genres){
        this.name = name;
        this.last = last;
        this.genres = genres;
    }

    public void rate(Rate rate){

    }
}
