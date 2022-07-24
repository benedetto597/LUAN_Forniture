package io.benedetto.luanforniture.model.forniture;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Formula;

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
    private Double list_price;

    @Formula(value = "list_price * 0.20")
    private Double revenue;

    @Formula(value = "list_price + revenue")
    private Double final_price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categories category;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cloth_id")
    private Clothes cloth;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dimension_id")
    private Dimensions dimensions;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "style_id")
    private Styles style;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private Types type;

    public Fornitures() {}
    
    public Fornitures(String name, String description, String code, Double list_price, Categories category, Clothes cloth, Dimensions dimensions, Styles style, Types type) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.list_price = list_price;
        this.category = category;
        this.cloth = cloth;
        this.dimensions = dimensions;
        this.style = style;
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

    public Double getList_price() {
        return list_price;
    }

    public void setList_price(Double list_price) {
        this.list_price = list_price;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Double getFinal_price() {
        return final_price;
    }

    public void setFinal_price(Double final_price) {
        this.final_price = final_price;
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

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public Styles getStyle() {
        return style;
    }

    public void setStyle(Styles style) {
        this.style = style;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Forniture [category=" + category + ", cloth=" + cloth + ", code=" + code + ", description="
                + description + ", dimensions=" + dimensions + ", final_price=" + final_price + ", forniture_id="
                + forniture_id + ", list_price=" + list_price + ", name=" + name + ", revenue=" + revenue + ", style="
                + style + ", type=" + type + "]";
    }
    
    
}
