package com.example.magical_arena.controllers;

import com.example.magical_arena.constants.ApiConstants;
import com.example.magical_arena.dto.requestDTO.StartMatchRequestDTO;
import com.example.magical_arena.dto.responseDTO.StartMatchResponseDTO;
import com.example.magical_arena.models.Player;
import com.example.magical_arena.services.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(ApiConstants.BASE_PATH)
@CrossOrigin(origins = "*")
public class ArenaController {

    @Autowired
    private ArenaService arenaService;

    @PostMapping(ApiConstants.START_MATCH)
    public ResponseEntity<StartMatchResponseDTO> startMatch(@Valid @RequestBody StartMatchRequestDTO request) {
        String result = arenaService.startMatch(request.getPlayer1(), request.getPlayer2());
        StartMatchResponseDTO response = new StartMatchResponseDTO(result);
        return ResponseEntity.ok(response);
    }
}