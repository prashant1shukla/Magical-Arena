package com.example.magical_arena.models;

import java.util.Random;

public class Match {
    private Player player1;
    private Player player2;
    private Random random;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    public void fight() {
        while (player1.isAlive() && player2.isAlive()) {
            playTurn(player1, player2);
            if (player2.isAlive()) {
                playTurn(player2, player1);
            }
        }
    }

    private void playTurn(Player attacker, Player defender) {
        int attackRoll = random.nextInt(6) + 1;
        int defendRoll = random.nextInt(6) + 1;

        int attackDamage = attackRoll * attacker.getAttack();
        int defense = defendRoll * defender.getStrength();

        int damageDealt = attackDamage - defense;
        if (damageDealt > 0) {
            defender.setHealth(defender.getHealth() - damageDealt);
        }
    }

    public Player getWinner() {
        return player1.isAlive() ? player1 : player2;
    }
}
