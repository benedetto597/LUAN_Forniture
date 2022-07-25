package io.benedetto.luanforniture.repository.address;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.address.Address;
import io.benedetto.luanforniture.model.address.City;
import io.benedetto.luanforniture.model.address.Department;
import io.benedetto.luanforniture.model.address.Suburb;

@Repository
public interface RepoAddress extends JpaRepository<Address, Integer> {

    Optional<Address> findByCity(City city);
    Optional<Address> findByDepartment(Department department);
    Optional<Address> findBySuburb(Suburb suburb);
    
    Boolean existsById(int id);
    public Address findById(int id);
}
