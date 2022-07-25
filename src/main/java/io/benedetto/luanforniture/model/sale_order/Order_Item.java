package io.benedetto.luanforniture.model.sale_order;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import io.benedetto.luanforniture.model.forniture.Fornitures;

@Entity
@Table(name = "ORDER_ITEM")
public class Order_Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_item_id;

    @NotBlank
    @NotNull
    private int quantity;

    @NotBlank
    @NotNull
    private Double total_price;

    @NotBlank
    @NotNull
    private Double total_discount;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderItem", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Fornitures> fornitures = new HashSet<>(); 
        
    public Order_Item() {}

    public Order_Item(int quantity, Double total_price, Double total_discount, Order order, Fornitures forniture) {
        this.quantity = quantity;
        this.total_price = total_price;
        this.total_discount = total_discount;
        this.order = order;
    }

    public int getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(int order_item_id) {
        this.order_item_id = order_item_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Double getTotal_discount() {
        return total_discount;
    }

    public void setTotal_discount(Double total_discount) {
        this.total_discount = total_discount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order_Item [forniture=" + fornitures + ", order=" + order + ", order_item_id=" + order_item_id
                + ", quantity=" + quantity + ", total_discount=" + total_discount + ", total_price=" + total_price
                + "]";
    }

}
