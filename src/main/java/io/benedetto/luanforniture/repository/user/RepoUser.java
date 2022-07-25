package io.benedetto.luanforniture.repository.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.user.User;

@Repository
public interface RepoUser extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    Boolean existByUsername(String username);
    Boolean existsByEmail(String email);
    public User findById(int id);

}