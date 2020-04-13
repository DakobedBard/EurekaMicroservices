package com.mddarr.scheduleservice;

public class Game {
    int home_team_id;
    int away_team_id;

    public Game(int home_team_id, int away_team_id) {
        this.home_team_id = home_team_id;
        this.away_team_id = away_team_id;
    }

    public int getHome_team_id() {
        return home_team_id;
    }

    public void setHome_team_id(int home_team_id) {
        this.home_team_id = home_team_id;
    }

    public int getAway_team_id() {
        return away_team_id;
    }

    public void setAway_team_id(int away_team_id) {
        this.away_team_id = away_team_id;
    }
}
