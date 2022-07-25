package io.benedetto.luanforniture.model.forniture;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Formula;

import io.benedetto.luanforniture.model.sale_order.Order_Item;

@Entity
@Table(name = "FORNITURES",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "code"),
    })
public class Fornitures {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int forniture_id;

    @NotBlank
    @Size (max = 30)
    @NotNull
    private String name;

    @NotBlank
    @Size (max = 50)
    @NotNull
    private String description;

    @NotBlank
    @Size (max = 10)
    @NotNull
    private String code;

    @NotBlank
    @NotNull
    @Column(name = "list_price", precision = 10, scale = 2)
    private Double listPrice;

    @Formula(value = "list_price * 0.20")
    private Double revenue;

    @Formula(value = "list_price + revenue")
    @Column(name = "final_price")
    private Double finalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categories category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cloth_id")
    private Clothes cloth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_item_id")
    private Order_Item orderItem;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="fornitures", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Dimensions> dimensions = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="fornitures", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Styles> styles = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy ="fornitures", cascade = CascadeType.ALL, orphanRemoval = true)
    private Types type;

    public Fornitures() {}
    
    public Fornitures(String name, String description, String code, Double listPrice, Categories category, Clothes cloth, Types type) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.listPrice = listPrice;
        this.category = category;
        this.cloth = cloth;
        this.type = type;
    }

    public int getForniture_id() {
        return forniture_id;
    }

    public void setForniture_id(int forniture_id) {
        this.forniture_id = forniture_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public Clothes getCloth() {
        return cloth;
    }

    public void setCloth(Clothes cloth) {
        this.cloth = cloth;
    }

    public Order_Item getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Order_Item orderItem) {
        this.orderItem = orderItem;
    }

    public Set<Dimensions> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Set<Dimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public Set<Styles> getStyles() {
        return styles;
    }

    public void setStyles(Set<Styles> styles) {
        this.styles = styles;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fornitures [category=" + category + ", cloth=" + cloth + ", code=" + code + ", description="
                + description + ", dimensions=" + dimensions + ", finalPrice=" + finalPrice + ", forniture_id="
                + forniture_id + ", listPrice=" + listPrice + ", name=" + name + ", orderItem=" + orderItem
                + ", revenue=" + revenue + ", styles=" + styles + ", type=" + type + "]";
    }

}
