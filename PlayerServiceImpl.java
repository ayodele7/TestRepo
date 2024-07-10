package com.example.demo.Service;

import com.example.demo.Entity.Player;
import com.example.demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player findByPlayerName(String playerName) {
        return playerRepository.findByPlayerName(playerName);
    }

    @Override
    public Iterable<Player> findAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Optional<Player> findById(Long id) {
        return playerRepository.findById(id);
    }

}
