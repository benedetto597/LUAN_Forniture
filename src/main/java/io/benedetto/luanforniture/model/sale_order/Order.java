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
    private LocalDateTime created_on;
    
    @UpdateTimestamp
    // @Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime updated_on;

    @Enumerated(EnumType.STRING)
    @Size(max = 30)
    private EStatus status;

    @Enumerated(EnumType.STRING)
    @Size(max = 30)
    private EPayment_Method payment_method;

    @OneToOne
    @JoinColumn(name = "user_id")
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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "ORDER_ITEMS", 
               joinColumns = @JoinColumn(name = "order_id"),
               inverseJoinColumns = @JoinColumn(name = "order_item_id"))
    private Set<Order_Item> order_items = new HashSet<>();  
    
    public Order() {}
    
    public Order(String code, EStatus status, EPayment_Method payment_method, User client) {
        this.code = code;
        this.status = status;
        this.payment_method = payment_method;
        this.client = client;
    }




}
