package com.mddarr.playerservice;

public class Player {
    private String first_name;
    private String last_name;
    private String team;
    private String position;

    public Player(String first_name, String last_name, String team, String position){
        this.first_name = first_name;
        this.last_name = last_name;
        this.team = team;
        this.position = position;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
