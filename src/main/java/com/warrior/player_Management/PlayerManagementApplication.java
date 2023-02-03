package com.warrior.player_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 You are conducting a cricket event. Collect the data of players and make "4" teams. Each team has 4 players consisting of 2 batsman,
 1 bowler and 1 all-rounder. No player should be a part of more than one team. Make a team and assign a head coach, batting coach,
 and a bowling coach to the team. And make a database where you will get player data if you search by their name.
 */
@SpringBootApplication
public class PlayerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerManagementApplication.class, args);
	}

}
