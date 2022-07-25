package io.benedetto.luanforniture.repository.forniture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.forniture.Dimensions;


@Repository
public interface RepoDimensions extends JpaRepository<Dimensions, Integer> {
    public Dimensions findById(int id);
}
