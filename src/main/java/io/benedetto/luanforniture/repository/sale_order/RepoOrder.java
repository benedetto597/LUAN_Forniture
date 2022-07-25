package io.benedetto.luanforniture.repository.sale_order;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.sale_order.Order;

@Repository
public interface RepoOrder extends JpaRepository<Order, Integer> {

    Optional<Order> findByCode(String code);
    Boolean existsByCode(String code);
    public Order findById(int id);
    
}