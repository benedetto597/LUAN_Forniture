package io.benedetto.luanforniture.repository.address;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.address.Address;

@Repository
public interface RepoAddress extends JpaRepository<Address, Integer> {

    Optional<Address> findByCityName(String name);
    Optional<Address> findByDepartmentName(String name);
    Optional<Address> findBySuburbName(String name);
    
    Boolean existById(int id);
    public Address findById(int id);
}
