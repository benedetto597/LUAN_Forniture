package io.benedetto.luanforniture.model.forniture;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "CLOTHES", 
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cloth_id;

    @NotBlank
    @Size(max = 20)
    @NotNull
    private String name;
    
    @NotBlank
    @Size(max = 50)
    @NotNull
    private String description;

    @NotBlank
    @Size(max = 10)
    @NotNull
    private String code;

    @NotBlank
    @Size(max = 100)
    @NotNull
    private String image;
    
    @NotBlank
    @Size(max = 10)
    @NotNull
    private String color_name;

    @NotBlank
    @Size(max = 7)
    @NotNull
    private String color_hex;

    public Clothes() {}

    public Clothes(String name, String description, String code, String image, String color_name, String color_hex) {
    this.name = name;
    this.description = description;
        this.code = code;
        this.image = image;
        this.color_name = color_name;
        this.color_hex = color_hex;
    }

    public int getCloth_id() {
        return cloth_id;
    }

    public void setCloth_id(int cloth_id) {
        this.cloth_id = cloth_id;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public String getColor_hex() {
        return color_hex;
    }

    public void setColor_hex(String color_hex) {
        this.color_hex = color_hex;
    }

    @Override
    public String toString() {
        return "Clothes{" + "cloth_id=" + cloth_id + ", name=" + name + ", description=" + description + ", code=" + code + ", image=" + image + ", color_name=" + color_name + ", color_hex=" + color_hex + '}';
    }
    
}
