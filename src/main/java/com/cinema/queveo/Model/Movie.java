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

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public double getRanting() {
        return ranting;
    }

    public void setRanting(double ranting) {
        this.ranting = ranting;
    }

    //Method
    public void rate(Rate rate){

    }
}
