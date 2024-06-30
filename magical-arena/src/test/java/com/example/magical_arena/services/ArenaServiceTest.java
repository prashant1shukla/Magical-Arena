package com.example.magical_arena.services;

import com.example.magical_arena.models.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArenaServiceTest {
    private ArenaService arenaService;

    @BeforeEach
    void setUp() {
        arenaService = new ArenaService();
    }

    @Test
    void startMatch_Player1Wins() {
        Player player1 = new Player(50, 10, 5);
        Player player2 = new Player(30, 8, 4);

        String result = arenaService.startMatch(player1, player2);
        assertTrue(result.contains("Player 1"));
    }

    @Test
    void startMatch_Player2Wins() {
        Player player1 = new Player(30, 8, 4);
        Player player2 = new Player(50, 10, 5);

        String result = arenaService.startMatch(player1, player2);
        assertTrue(result.contains("Player 2"));
    }
}
