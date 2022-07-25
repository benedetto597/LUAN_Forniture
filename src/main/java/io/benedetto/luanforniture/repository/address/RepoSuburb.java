package io.benedetto.luanforniture.repository.address;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.address.Suburb;

@Repository
public interface RepoSuburb extends JpaRepository<Suburb, Integer> {

    Optional<Suburb> findByName(String name);
    Boolean existsByName(String name);
    public Suburb findById(int id);

}
