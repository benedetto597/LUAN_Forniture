package io.benedetto.luanforniture.repository.sale_order;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.benedetto.luanforniture.model.sale_order.Order;
import io.benedetto.luanforniture.model.sale_order.Order_Suplier;

@Repository
public interface RepoOrderSuplier extends JpaRepository<Order_Suplier, Integer> {

    Optional<Order_Suplier> findByOrder(Order order);
    Boolean existsByOrder(Order order);
    public Order_Suplier findById(int id);
    
}
