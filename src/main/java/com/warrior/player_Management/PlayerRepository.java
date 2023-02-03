package com.warrior.player_Management;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PlayerRepository {

    HashMap<String, Batsman> batsmandB;
    HashMap<String, Bowler> bowlerdB;
    HashMap<String, Allrounder> allrounderdB;
    HashMap<String, Player> playerdB;
    HashMap<String, Team> teamMap ;
//    List<Player> playersList;

    public PlayerRepository() {
        this.batsmandB = new HashMap<>();
        this.bowlerdB = new HashMap<>();
        this.allrounderdB = new HashMap<>();
        this.playerdB = new HashMap<>();
        this.teamMap = new HashMap<>();
//        playersList = new ArrayList<>();
    }

    public String addBatsman(Batsman batsman) {
        batsmandB.put(batsman.getName(), batsman);
        playerdB.put(batsman.getName(), batsman);
//        playersList.add(batsman);
        return "player added to the list";
    }

    public String addBowler(Bowler bowler) {
        bowlerdB.put(bowler.getName(), bowler);
        playerdB.put(bowler.getName(), bowler);
        return "player added to the list";
    }

    public String addAllRounder(Allrounder allrounder) {
        allrounderdB.put(allrounder.getName(), allrounder);
        playerdB.put(allrounder.getName(), allrounder);
        return "player added to the list";
    }

    public String makeTeam(Players players) {
        Team team = new Team(players.teamName);
        team.addPlayer(players.getPlayer1());
        team.addPlayer(players.getPlayer2());
        team.addPlayer(players.getPlayer3());
        team.addPlayer(players.getPlayer4());
        teamMap.put(team.getTeamName(), team);
        return "Team added to the list";
    }

    public Player getPlayer(String name) {
        return playerdB.get(name);
    }
}
