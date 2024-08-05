package Practice.Sample_Project_5.Repository;

import Practice.Sample_Project_5.Entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer> {
}
