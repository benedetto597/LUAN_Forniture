package io.benedetto.luanforniture.model.sale_order;

import javax.persistence.OneToOne;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "ORDER_BALANCE")
public class Order_Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_balance_id;
    
    @NotBlank
    private Double total_paid;

    @Formula(value = "total_price - total_paid")
    private Double total_unpaid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    public Order_Balance() {}

    public Order_Balance(Double total_paid, Double total_unpaid, Order order) {
        this.total_paid = total_paid;
        this.total_unpaid = total_unpaid;
        this.order = order;
    }

    public int getOrder_balance_id() {
        return order_balance_id;
    }

    public void setOrder_balance_id(int order_balance_id) {
        this.order_balance_id = order_balance_id;
    }

    public Double getTotal_paid() {
        return total_paid;
    }

    public void setTotal_paid(Double total_paid) {
        this.total_paid = total_paid;
    }

    public Double getTotal_unpaid() {
        return total_unpaid;
    }

    public void setTotal_unpaid(Double total_unpaid) {
        this.total_unpaid = total_unpaid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Order_Balance [order=" + order + ", order_balance_id=" + order_balance_id + ", total_paid=" + total_paid
                + ", total_unpaid=" + total_unpaid + "]";
    }

}