package techItEasy.techItEasy.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import techItEasy.techItEasy.Models.Televisions;

import java.util.Optional;


public interface TelevisionsRepository extends JpaRepository <Televisions, Integer>{
    Optional<Televisions> findByBrand(String brand);
}
