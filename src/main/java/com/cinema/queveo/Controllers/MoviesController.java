package com.cinema.queveo.Controllers;

import com.cinema.queveo.Model.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cinema.queveo.Repository.MovieRepository;

import java.util.List;

@RestController
public class MoviesController {
    private MovieRepository movieRepo = new MovieRepository();

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public List<Movie> index() {
        movieRepo.ini();
        return movieRepo.getMovies();
    }

}
