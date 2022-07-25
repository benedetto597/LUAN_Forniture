package io.benedetto.luanforniture.repository.forniture;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.forniture.Categories;


@Repository
public interface RepoCategories extends JpaRepository<Categories, Integer> {

    Optional<Categories> findByName(String name);
    Boolean existsByName(String name);
    public Categories findById(int id);
    
  }
  