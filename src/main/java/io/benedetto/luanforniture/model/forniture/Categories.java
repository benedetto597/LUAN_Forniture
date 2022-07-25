package io.benedetto.luanforniture.model.forniture;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "CATEGORIES",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class Categories implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int category_id;

    @NotBlank
    @Size (max = 30)
    @NotNull
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_category_id", referencedColumnName = "category_id")
    private Categories parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Categories> children = new HashSet<Categories>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Fornitures> fornitures = new HashSet<>();

    public Categories() {}

    public Categories(String name) {
        this.name = name;
    }

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
