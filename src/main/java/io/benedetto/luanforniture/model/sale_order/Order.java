package io.benedetto.luanforniture.model.sale_order;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.benedetto.luanforniture.model.user.User;

@Entity
@Table(name = "ORDER",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "code"),
    })
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @NotBlank
    @Size (max = 10)
    @NotNull
    private String code;

    @CreationTimestamp
    // @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    
    @UpdateTimestamp
    // @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_on")
	private LocalDateTime updatedOn;

    @Enumerated(EnumType.STRING)
    @Size(max = 30)
    private EStatus status;

    @Enumerated(EnumType.STRING)
    @Size(max = 30)
    @Column(name = "payment_method")
    private EPayment_Method paymentMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private User client;

    @OneToOne(mappedBy = "order",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    private Order_Balance balance;

    @OneToOne(mappedBy = "order",
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    private Order_Suplier suplier;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Order_Item> order_items = new HashSet<>();  
    
    public Order() {}
    
    public Order(String code, EStatus status, EPayment_Method payment_method, User client) {
        this.code = code;
        this.status = status;
        this.paymentMethod = payment_method;
        this.client = client;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public EPayment_Method getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(EPayment_Method paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Order_Balance getBalance() {
        return balance;
    }

    public void setBalance(Order_Balance balance) {
        this.balance = balance;
    }

    public Order_Suplier getSuplier() {
        return suplier;
    }

    public void setSuplier(Order_Suplier suplier) {
        this.suplier = suplier;
    }

    public Set<Order_Item> getOrder_items() {
        return order_items;
    }

    public void setOrder_items(Set<Order_Item> order_items) {
        this.order_items = order_items;
    }

    @Override
    public String toString() {
        return "Order [balance=" + balance + ", client=" + client + ", code=" + code + ", createdOn=" + createdOn
                + ", order_id=" + order_id + ", order_items=" + order_items + ", paymentMethod=" + paymentMethod
                + ", status=" + status + ", suplier=" + suplier + ", updatedOn=" + updatedOn + "]";
    }

    

}
