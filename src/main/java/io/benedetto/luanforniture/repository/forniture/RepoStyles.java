package io.benedetto.luanforniture.repository.forniture;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.forniture.Styles;

@Repository
public interface RepoStyles extends JpaRepository<Styles, Integer> {

    Optional<Styles> findByName(String name);
    Boolean existsByName(String name);
    public Styles findById(int id);
    
}
