package com.example.magical_arena.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private int health;
    private int strength;
    private int attack;

    public boolean isAlive() {
        return health > 0;
    }
}
