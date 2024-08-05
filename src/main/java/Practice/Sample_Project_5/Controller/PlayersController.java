package Practice.Sample_Project_5.Controller;

import Practice.Sample_Project_5.Entity.Players;
import Practice.Sample_Project_5.Service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class PlayersController {

    @Autowired
    PlayersService playersService;

    @GetMapping("/get/players")
    public List<Players> getAllPlayers(){
        List<Players> players = playersService.getPlayersList();
        return players;
    }

    @GetMapping("/get/players/{id}")
    public Players getPlayerById(@PathVariable int id){
        Players player = playersService.getPlayersListById(id);
        return player;
    }

    @PostMapping("/add/players")
    public String addPlayer(@RequestBody Players p){
        playersService.setPlayers(p);
        return "New player added successfully";

    }


    @PutMapping("/edit/players/{id}")
    public String editPlayer(@PathVariable int id, @RequestBody Players p){
        playersService.editPlayerById(id, p);
        return "Player "+ id +" Edited Successfully";
    }

    @DeleteMapping("/delete/players/{id}")
    public String deletePlayer(@PathVariable int id){
        playersService.deletePlayerById(id);
        return "Player "+id+" Deleted Successfully";
    }
}
