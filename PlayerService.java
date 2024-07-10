package com.example.demo.Service;

import com.example.demo.Entity.Player;

import java.util.Optional;

public interface PlayerService {

    Player findByPlayerName(String playerName);
    Iterable<Player> findAllPlayers();

    Optional<Player> findById(Long id);
}
