package com.example.magical_arena.services;

import com.example.magical_arena.models.Match;
import com.example.magical_arena.models.Player;
import org.springframework.stereotype.Service;

@Service
public class ArenaService {
    public String startMatch(Player player1, Player player2) {
        Match match = new Match(player1, player2);
        match.fight();
        Player winner = match.getWinner();
        return "The winner is: " + (winner == player1 ? "Player 1" : "Player 2");
    }
}
