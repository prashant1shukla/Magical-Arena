package com.example.magical_arena.services;

import com.example.magical_arena.constants.MessageConstants;
import com.example.magical_arena.models.Match;
import com.example.magical_arena.models.Player;
import com.example.magical_arena.utils.DiceUtil;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class ArenaService {

    public String startMatch(Player player1, Player player2) {
        Match match = new Match(player1, player2);
        fight(match);
        Player winner = getWinner(match);
        return MessageConstants.WINNER_MESSAGE + (winner == player1 ? "Player 1" : "Player 2");
    }

    private void fight(Match match) {
        Player player1 = match.getPlayer1();
        Player player2 = match.getPlayer2();

        while (player1.isAlive() && player2.isAlive()) {
            playTurn(player1, player2);
            if (player2.isAlive()) {
                playTurn(player2, player1);
            }
        }
    }

    private void playTurn(Player attacker, Player defender) {
        int attackRoll = DiceUtil.rollDice();
        int defendRoll = DiceUtil.rollDice();

        int attackDamage = attackRoll * attacker.getAttack();
        int defense = defendRoll * defender.getStrength();

        int damageDealt = attackDamage - defense;
        if (damageDealt > 0) {
            defender.setHealth(defender.getHealth() - damageDealt);
        }
    }

    private Player getWinner(Match match) {
        Player player1 = match.getPlayer1();
        Player player2 = match.getPlayer2();
        return player1.isAlive() ? player1 : player2;
    }
}