package io.benedetto.luanforniture.model.forniture;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CATEGORIES",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class Categories {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;

    @NotBlank
    @Size (max = 30)
    @NotNull
    private String name;

    public Categories() {}

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Categories [category_id=" + category_id + ", name=" + name + "]";
    }
}
