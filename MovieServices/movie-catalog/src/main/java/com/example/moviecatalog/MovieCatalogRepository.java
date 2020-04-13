package com.example.moviecatalog;

import org.springframework.data.repository.CrudRepository;

public interface MovieCatalogRepository extends CrudRepository<MovieCatalog, Integer> {
}
