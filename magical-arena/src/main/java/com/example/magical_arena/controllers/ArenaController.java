package com.example.magical_arena.controllers;

import com.example.magical_arena.models.Player;
import com.example.magical_arena.services.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/arena")
@CrossOrigin(origins = "*")
public class ArenaController {

    @Autowired
    private ArenaService arenaService;

    @PostMapping("/start")
    public String startMatch(@RequestBody Player[] players) {
        if (players.length != 2) {
            throw new IllegalArgumentException("Two players are required to start a match.");
        }
        return arenaService.startMatch(players[0], players[1]);
    }
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
