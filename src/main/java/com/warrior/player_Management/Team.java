package com.warrior.player_Management;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    List<String> players;

    public Team() {}
    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
    }

    public String addPlayer(String name) {
        players.add(name);
        return "player added to the team.";
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
