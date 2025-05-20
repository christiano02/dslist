package com.example.dslist.service;

import com.example.dslist.dto.GameListDTO;
import com.example.dslist.entities.GameList;
import com.example.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList>  result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
