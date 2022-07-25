package io.benedetto.luanforniture.repository.forniture;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.forniture.Types;

@Repository
public interface RepoTypes extends JpaRepository<Types, Integer> {

    Optional<Types> findByName(String name);
    Boolean existsByName(String name);
    public Types findById(int id);
    
}