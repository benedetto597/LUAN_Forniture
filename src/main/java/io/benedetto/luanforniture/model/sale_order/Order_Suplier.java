package io.benedetto.luanforniture.model.sale_order;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "ORDER_SUPPLIER",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class Order_Suplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_suplier_id;

    @NotBlank
    @Size (max = 30)
    @NotNull
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @NotBlank
    @Size (max = 20)
    @NotNull
    private String contact_name;
    
    @NotBlank
    @Size (max = 20)
    @NotNull
    private String contact_last_name;

    @NotBlank
    @Size (max = 8, min = 8)
    @NotNull
    private Number contact_phone;

    @CreationTimestamp
    // @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime created_on;
    
    @UpdateTimestamp
    // @Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime updated_on;
    
    @NotBlank
    private Double total_delivery;

    public Order_Suplier() {}

    public Order_Suplier(String name, String contact_name, String contact_last_name, Number contact_phone, Double total_delivery) {
        this.name = name;
        this.contact_name = contact_name;
        this.contact_last_name = contact_last_name;
        this.contact_phone = contact_phone;
        this.total_delivery = total_delivery;
    }

    public int getOrder_suplier_id() {
        return order_suplier_id;
    }

    public void setOrder_suplier_id(int order_suplier_id) {
        this.order_suplier_id = order_suplier_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_last_name() {
        return contact_last_name;
    }

    public void setContact_last_name(String contact_last_name) {
        this.contact_last_name = contact_last_name;
    }

    public Number getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(Number contact_phone) {
        this.contact_phone = contact_phone;
    }

    public LocalDateTime getCreated_on() {
        return created_on;
    }

    public void setCreated_on(LocalDateTime created_on) {
        this.created_on = created_on;
    }

    public LocalDateTime getUpdated_on() {
        return updated_on;
    }

    public void setUpdated_on(LocalDateTime updated_on) {
        this.updated_on = updated_on;
    }

    public Double getTotal_delivery() {
        return total_delivery;
    }

    public void setTotal_delivery(Double total_delivery) {
        this.total_delivery = total_delivery;
    }

    @Override
    public String toString() {
        return "Order_Suplier{" +
                "order_suplier_id=" + order_suplier_id +
                ", name='" + name + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", contact_last_name='" + contact_last_name + '\'' +
                ", contact_phone=" + contact_phone +
                ", created_on=" + created_on +
                ", updated_on=" + updated_on +
                ", total_delivery=" + total_delivery +
                '}';
    }

}
