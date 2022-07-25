package io.benedetto.luanforniture.repository.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.user.ERole;
import io.benedetto.luanforniture.model.user.Role;

@Repository
public interface RepoRole extends JpaRepository<Role, Integer> {
  Optional<Role> findByName(ERole name);
  public Role findById(int id);
}
