package io.benedetto.luanforniture.repository.forniture;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.forniture.Clothes;

@Repository
public interface RepoClothes extends JpaRepository<Clothes, Integer> {

    Optional<Clothes> findByName(String name);
    Optional<Clothes> findByCode(String code);
    Boolean existsByName(String name);
    Boolean existsByCode(String code);
    public Clothes findById(int id);
    
}
