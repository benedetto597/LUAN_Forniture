package io.benedetto.luanforniture.repository.address;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.address.City;

@Repository
public interface RepoCity extends JpaRepository<City, Integer> {

    Optional<City> findByName(String name);
    Boolean existByName(String name);
    public City findById(int id);
    
}
