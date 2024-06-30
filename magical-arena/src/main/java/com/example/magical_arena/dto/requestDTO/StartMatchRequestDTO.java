package com.example.magical_arena.dto.requestDTO;

import com.example.magical_arena.constants.MessageConstants;
import com.example.magical_arena.models.Player;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StartMatchRequestDTO {

    @NotNull(message = MessageConstants.PLAYER1_REQUIRED)
    @Valid
    private Player player1;

    @NotNull(message = MessageConstants.PLAYER2_REQUIRED)
    @Valid
    private Player player2;
}