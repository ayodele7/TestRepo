package com.example.demo.Controller;


import com.example.demo.Entity.Player;
import com.example.demo.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

//    @GetMapping("/{id}")
//    public Player getPlayerById(@PathVariable Long id) {
//        return playerService.findById(id);
//    }

    @GetMapping("/byname/{playerName}")
    public Player getPlayerByName(@PathVariable String playerName) {
        return playerService.findByPlayerName(playerName);
    }

    @GetMapping("/")
    public Iterable<Player> getAllPlayers() {
        return playerService.findAllPlayers();
    }
}

