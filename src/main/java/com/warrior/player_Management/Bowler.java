package com.warrior.player_Management;


public class Bowler extends Player{
    private String bowlingType;
    private double wickets;

    public Bowler() {

    }

    public Bowler(String bowlingType, double wickets) {
        this.bowlingType = bowlingType;
        this.wickets = wickets;
    }

    public Bowler(String name, int age, String country, int matchesPlayed, String bowlingType, double wickets) {
        super(name, age, country, matchesPlayed);
        this.bowlingType = bowlingType;
        this.wickets = wickets;
    }
}
