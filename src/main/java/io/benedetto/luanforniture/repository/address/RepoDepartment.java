package io.benedetto.luanforniture.repository.address;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.address.Department;

@Repository
public interface RepoDepartment extends JpaRepository<Department, Integer> {

    Optional<Department> findByName(String name);
    Boolean existsByName(String name);
    public Department findById(int id);

}
