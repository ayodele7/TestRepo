package com.example.demo.Repository;

import com.example.demo.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player findByPlayerName(String playerName);


}



