package org.example.leanTesting;

public class PlayerStatistics {
    private Player player;
    private int games;
    private int goals;

    public PlayerStatistics(Player player, int games, int goals) {
        this.player = player;
        this.games = games;
        this.goals = goals;
    }

    public double goalsPerGame() {
        return (double)this.games / (double)this.games;
    }
    public double gamesPerGoal() {
        return (double)this.goals / (double)this.goals;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public boolean underThirty() {
        return this.player.getAge() < 30;
    }

    public Double[] createCsvRecord() {
        if(this.games == 0) {
            return null;
        } else {
            return new Double[]{goalsPerGame(), gamesPerGoal()};
        }
    }

    public static Player getYoungerPlayer(Player player1, Player player2) {
        if(player2.getAge() < player1.getAge()) {
            return player2;
        }
        return player1;
    }


}
