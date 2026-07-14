package com.project.nbaplayerapi;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/nba-player")
public class NbaPlayerController {
    NbaPlayerService nbaPlayerService;

    public NbaPlayerController(NbaPlayerService nbaPlayerService) {
        this.nbaPlayerService = nbaPlayerService;
    }

    @GetMapping
    public List<NbaPlayer> getAllNbaPlayers() {
        return nbaPlayerService.getAllNbaPlayers();
    }

    @GetMapping("{id}")
    public NbaPlayer getNbaPlayersById(@PathVariable Integer id) {
        return nbaPlayerService.getNbaPlayersById(id);
    }

    @PutMapping("/{id}")
    public void updateNbaPlayerDetails(@PathVariable Integer id, @RequestBody NbaPlayer nbaPlayer) {
        nbaPlayerService.updateNbaPlayerAssociation(id, nbaPlayer);
    }

    @PostMapping
    public void addNbaPlayer(@RequestBody NbaPlayer nbaPlayer) {
        nbaPlayerService.addNbaPlayer(nbaPlayer);
    }

    @DeleteMapping("{id}")
    public void deleteNbaPlayer(@PathVariable Integer id) {
        nbaPlayerService.deleteNbaPlayer(id);
    }
}
