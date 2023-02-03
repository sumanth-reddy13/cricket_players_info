package com.warrior.player_Management;

public class Allrounder extends Player{
    private String battingStyle;
    private String bowlingStyle;
    private int wickets;
    private int runsScored;

    public Allrounder() {}
    public Allrounder(String battingStyle, String bowlingStyle, int wickets, int runsScored) {
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.wickets = wickets;
        this.runsScored = runsScored;
    }

    public Allrounder(String name, int age, String country, int matchesPlayed, String battingStyle, String bowlingStyle, int wickets, int runsScored) {
        super(name, age, country, matchesPlayed);
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.wickets = wickets;
        this.runsScored = runsScored;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }
}
