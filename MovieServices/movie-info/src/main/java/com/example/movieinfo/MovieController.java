package com.example.movieinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/team") // This means URL's start with /demo
public class MovieController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private MovieRepository movieRepository;
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String city,@RequestParam String abrv ) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Movie t = new Movie();
        t.setName(name);

        movieRepository.save(t);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Movie> getAllUsers() {
        // This returns a JSON or XML with the users
        return movieRepository.findAll();
    }
}