package com.warrior.player_Management;

public class Player {
    private String name;
    private int age;
    private String country;
    private int matchesPlayed;

    public Player() {

    }
    public Player(String name, int age, String country, int matchesPlayed) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

}
