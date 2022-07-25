package io.benedetto.luanforniture.repository.forniture;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.forniture.Fornitures;

@Repository
public interface RepoFornitures extends JpaRepository<Fornitures, Integer> {

    Optional<Fornitures> findByName(String name);
    Optional<Fornitures> findByCode(String code);
    Boolean existsByName(String name);
    Boolean existsByCode(String code);
    public Fornitures findById(int id);
    
}
