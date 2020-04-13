package com.example.moviecatalog;

import com.example.moviecatalog.model.models.CatalogItem;
import org.springframework.data.repository.CrudRepository;

public interface MovieCatalogRepository extends CrudRepository<CatalogItem, Integer> {
}
