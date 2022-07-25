package io.benedetto.luanforniture.repository.sale_order;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.sale_order.Order;
import io.benedetto.luanforniture.model.sale_order.Order_Balance;

@Repository
public interface RepoOrderBalance extends JpaRepository<Order_Balance, Integer> {

    Optional<Order_Balance> findByOrder(Order order);
    Boolean existsByOrder(Order order);
    public Order_Balance findById(int id);
    
}
