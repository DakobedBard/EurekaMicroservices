package com.example.moviecatalog.resources;

import com.example.moviecatalog.model.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
        @RequestMapping("/{userId}")
        public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
            return Collections.singletonList(
                    new CatalogItem("The Sixth Sense", "Scary Movie",5)
            );
        }
    }
