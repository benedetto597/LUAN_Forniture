package io.benedetto.luanforniture.repository.sale_order;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.sale_order.Order;
import io.benedetto.luanforniture.model.sale_order.Order_Item;

@Repository
public interface RepoOrderItem extends JpaRepository<Order_Item, Integer> {

    Optional<Order_Item> findByOrder(Order order);
    Boolean existsByOrder(Order order);
    public Order_Item findById(int id);
    
}