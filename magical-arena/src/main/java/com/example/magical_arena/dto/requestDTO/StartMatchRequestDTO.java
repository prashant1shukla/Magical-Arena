package com.example.magical_arena.dto.requestDTO;

import com.example.magical_arena.models.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StartMatchRequestDTO {
    private Player player1;
    private Player player2;
}
