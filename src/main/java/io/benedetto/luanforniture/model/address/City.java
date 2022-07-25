package io.benedetto.luanforniture.model.address;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "CITY", 
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;

    @NotBlank
    @Size(max = 30)
    @NotNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Suburb> suburbia = new HashSet<>();

    public City() {}

    public City(String name) {
        this.name = name;
    }

    public int getId() {
        return city_id;
    }

    public void setId(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return name;
    }

    public void setCity_name(String city_name) {
        this.name = city_name;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + city_id + ", name=" + name + '}';
    }
}
