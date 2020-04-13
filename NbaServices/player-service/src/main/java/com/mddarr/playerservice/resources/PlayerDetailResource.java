package com.mddarr.playerservice.resources;

import com.mddarr.playerservice.Player;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerDetailResource {
    @RequestMapping("/{playerID}")
    public List<Player> getPlayer(@PathVariable("playerID") String playerID){

        return Collections.singletonList(
                new Player("Lebron", "James", "LAL", "SF")
        );
    }
}
