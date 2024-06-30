package com.example.magical_arena.utils;

import java.util.Random;

public class DiceUtil {
    private static final Random random = new Random();

    public static int rollDice() {
        return random.nextInt(6) + 1;
    }
}