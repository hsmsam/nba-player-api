package com.project.nbaplayerapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NbaPlayerService {
    NbaPlayerRepository nbaPlayerRepository;

    public NbaPlayerService(NbaPlayerRepository nbaPlayerRepository) {
        this.nbaPlayerRepository = nbaPlayerRepository;
    }

    public List<NbaPlayer> getAllNbaPlayers() {
        return nbaPlayerRepository.findAll();
    }

    public NbaPlayer getNbaPlayersById(Integer id) {
        return nbaPlayerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void updateNbaPlayerAssociation(Integer id, NbaPlayer nbaPlayer) {
        NbaPlayer playerExist = nbaPlayerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("player not found"));

        playerExist.setAssociation(nbaPlayer.getAssociation());
        nbaPlayerRepository.save(playerExist);
    }

    public void addNbaPlayer(NbaPlayer nbaPlayer) {
        nbaPlayerRepository.save(nbaPlayer);
    }

    public void deleteNbaPlayer(Integer id) {
        nbaPlayerRepository.deleteById(id);
    }
}
