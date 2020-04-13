package com.example.moviecatalog.resources;

import com.example.moviecatalog.model.models.CatalogItem;
import com.example.moviecatalog.model.models.Movie;
import com.example.moviecatalog.model.models.Rating;
import com.example.moviecatalog.model.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
        @Autowired
        private RestTemplate restTemplate;

        @RequestMapping("/{userId}")
        public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
            RestTemplate restTemplate = new RestTemplate();
            // Get all rate movie IDs
            UserRating ratings = restTemplate.getForObject("http://localhost:8083/ratingsdata/users/users/"+userId,UserRating.class);
            // This map over the .stream() is acting as a loop
            return ratings.getRatings().stream().map(rating -> {
                    Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
                    return new CatalogItem(movie.getName(), "Desc", rating.getRating());
                    }).collect(Collectors.toList());


            //            // For each movie ID, call movie info servers
//            List<Rating> ratings = Arrays.asList(
//                    new Rating("The ring",2),
//                    new Rating("Bravheart",4)
//            );

//
//            return ratings.stream().map(rating -> {
//                    Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
//                    return new CatalogItem(movie.getName(), "Desc", rating.getRating());
//                    }).collect(Collectors.toList());

//            ratings.stream().map(rating->{
//                new CatalogItem("The Sixth Sense", "Scary Movie",5)
//            ).collect(Collectors.toList());
//
//            UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratingsdata/user/" + userId, UserRating.class);
//            return userRating.getRatings().stream()
//                        .map(rating -> {
//                            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
//                            return new CatalogItem(movie.getName(), movie.getDescription(), rating.getRating());
//                        })
//                        .collect(Collectors.toList());

//
//            return Collections.singletonList(
//                    new CatalogItem("The Sixth Sense", "Scary Movie",5)
//            );
        }
    }
