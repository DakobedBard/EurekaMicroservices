package com.example.movieinfo;

import com.example.movieinfo.resources.MovieResource;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieResource, Integer> {
}
