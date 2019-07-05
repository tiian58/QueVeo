package com.cinema.queveo.Model;

import org.junit.Test;
import com.cinema.queveo.Repository.MovieRepository;

import static org.junit.Assert.assertEquals;

public class MovieRepositoryTest {
    MovieRepository repomovie = new MovieRepository();

    @Test
    public void iniRepository(){
        repomovie.ini();
        assertEquals(repomovie.getMovies().size(),3);
    }

    @Test
    public void addMovie(){
        repomovie.addMovie(new Movie("Harry Potter", 90, Genres.FANTASY));
        assertEquals(repomovie.getMovies().size(),1);
    }

}
