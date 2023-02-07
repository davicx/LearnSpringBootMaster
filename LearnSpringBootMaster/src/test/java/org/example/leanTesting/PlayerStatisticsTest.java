package org.example.leanTesting;

import static org.junit.jupiter.api.Assertions.*;

class PlayerStatisticsTest {

    @org.junit.jupiter.api.Test
    void playerNameEqual() {
        Player player1 = new Player("Patrick", 27);
        Player player2 = new Player("Patrick", 25);
        assertEquals(player1,player2);
    }

    @org.junit.jupiter.api.Test
    void youngerPlayerSame() {
        Player player1 = new Player("Patrick", 27);
        Player player2 = new Player("Patrick", 25);
        assertSame(player2, PlayerStatistics.getYoungerPlayer(player1, player2));
    }

    @org.junit.jupiter.api.Test
    void underThirtyTrue() {
        Player player1 = new Player("Patrick", 27);
        PlayerStatistics statistics = new PlayerStatistics(player1, 3, 3);

        assertTrue(statistics.underThirty());
    }


    @org.junit.jupiter.api.Test
    void underThirtyFalse() {
        Player player1 = new Player("Patrick", 37);
        PlayerStatistics statistics = new PlayerStatistics(player1, 3, 3);

        assertFalse(statistics.underThirty());
    }

    @org.junit.jupiter.api.Test
    void csvReportNull() {
        Player player1 = new Player("Patrick", 37);
        PlayerStatistics statistics = new PlayerStatistics(player1, 0, 0);

        assertNull(statistics.createCsvRecord());
    }

    @org.junit.jupiter.api.Test
    void csvReportNotNull() {
        Player player1 = new Player("Patrick", 37);
        PlayerStatistics statistics = new PlayerStatistics(player1, 3, 3);

        assertNull(statistics.createCsvRecord());
    }
    @org.junit.jupiter.api.Test
    void goalsPerGame() {
        assertEquals(true,true);
    }

    @org.junit.jupiter.api.Test
    void gamesPerGoal() {
        assertEquals(true,true);
    }

    @org.junit.jupiter.api.Test
    void underThirty() {
        assertEquals(true,true);
    }




}