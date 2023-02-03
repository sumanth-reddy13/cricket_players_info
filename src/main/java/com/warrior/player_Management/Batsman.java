package com.warrior.player_Management;

public class Batsman extends Player{
    private String type;
    private int runsScored;

    public Batsman() {

    }
    public Batsman(String type, int runsScored) {
        this.type = type;
        this.runsScored = runsScored;
    }

    public Batsman(String name, int age, String country, int matchesPlayed, String type, int runsScored) {
//        super(name, age, country, matchesPlayed);
        this.type = type;
        this.runsScored = runsScored;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
