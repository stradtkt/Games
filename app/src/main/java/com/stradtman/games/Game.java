package com.stradtman.games;

public class Game {
    public static final String DEFAULT_TITLE = "Your Title Here";
    public static final String DEFAULT_SYSTEM = "PS4";
    public static final int DEFAULT_PLAYERS = 2;
    public static final String DEFAULT_RELEASE_DATE = "01-01-1970";
    public static final String DEFAULT_COOP = "NO";
    public String title, system, release_date, coop;
    public int players;

    public Game(String title, String system, String release_date, String coop, int players) {
        this.title = title;
        this.system = system;
        this.release_date = release_date;
        this.coop = coop;
        this.players = players;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getCoop() {
        return coop;
    }

    public void setCoop(String coop) {
        this.coop = coop;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }
}