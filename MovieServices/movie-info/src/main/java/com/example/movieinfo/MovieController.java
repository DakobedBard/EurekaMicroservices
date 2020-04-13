package com.example.movieinfo;

import com.example.movieinfo.resources.MovieResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/movies") // This means URL's start with /demo
public class MovieController {

    @RequestMapping(path="/{movieId")
    public MovieResource getMovieInfo(@PathVariable("movieId") Integer movieId) {
        // This returns a JSON or XML with the users
        return new MovieResource(movieId, "Silence of the Lambs");
    }
}
