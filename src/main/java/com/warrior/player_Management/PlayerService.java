package com.warrior.player_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public PlayerService() {

    }

    public String addBatsman(Batsman batsman) {
        return playerRepository.addBatsman(batsman);
    }

    public String addBowler(Bowler bowler) {
        return playerRepository.addBowler(bowler);
    }

    public String addAllRounder(Allrounder allrounder) {
       return playerRepository.addAllRounder(allrounder);
    }

    public String makeTeam(Players players) {
        return playerRepository.makeTeam(players);
    }

    public Player getPlayer(String name) {
       return playerRepository.getPlayer(name);
    }
}
