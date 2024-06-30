package com.example.magical_arena.models;

import com.example.magical_arena.constants.MessageConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Min(value = 1, message = MessageConstants.HEALTH_GREATER_THAN_ZERO)
    private int health;

    @Min(value = 1, message = MessageConstants.STRENGTH_GREATER_THAN_ZERO)
    private int strength;

    @Min(value = 1, message = MessageConstants.ATTACK_GREATER_THAN_ZERO)
    private int attack;

    public boolean isAlive() {
        return health > 0;
    }
}
