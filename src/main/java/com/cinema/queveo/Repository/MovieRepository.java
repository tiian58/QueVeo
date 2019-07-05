package com.cinema.queveo.Repository;

import com.cinema.queveo.Model.Genres;
import com.cinema.queveo.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<Movie> movies = new ArrayList<Movie>();

    public MovieRepository() {

    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void ini(){
        addMovie(new Movie("Harry Potter", 90, Genres.FANTASY));
        addMovie(new Movie("Fast & Furrior", 80, Genres.ADVENTURE));
        addMovie(new Movie("E.T", 100, Genres.SCI_FI));
    }

    public List<Movie> getMovies() {
        return movies;
    }

}
