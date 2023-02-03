package com.warrior.player_Management;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    public PlayerController() {

    }

    @PostMapping("addBatsman")
    public String addBatsman(@RequestBody Batsman batsman) {
        return playerService.addBatsman(batsman);
    }

    @PostMapping("addBowler")
    public String addBowler(@RequestBody Bowler bowler) {
        return playerService.addBowler(bowler);
    }
    @PostMapping("addAllRounder")
    public String addAllRounder(@RequestBody Allrounder allrounder) {
        return playerService.addAllRounder(allrounder);
    }
    @PostMapping("makeTeam")
    public String makeTeam(@RequestBody Players players) {

        return playerService.makeTeam(players);
    }

    @GetMapping("getPlayer/{name}")
    public Player getPlayer(@PathVariable("name") String name) {
        return playerService.getPlayer(name);
    }
}
