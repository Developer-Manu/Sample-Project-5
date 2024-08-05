package Practice.Sample_Project_5.Service;

import Practice.Sample_Project_5.Entity.Players;
import Practice.Sample_Project_5.Repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class PlayersService {

    @Autowired
    PlayersRepository playersRepository;

    public List<Players> getPlayersList(){
        List<Players> players = playersRepository.findAll();
        return players;
    }

    public Players getPlayersListById(int id){
        return playersRepository.findById(id).get();
    }

    public void setPlayers(Players p){
        playersRepository.save(p);
    }

    public void editPlayerById(int id, Players p){
        playersRepository.save(p);
    }

    public void deletePlayerById(int id){
        playersRepository.deleteById(id);
    }
}
