package io.benedetto.luanforniture.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "CITY", 
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "city_name"),
    })
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;

    @NotBlank
    @Size(max = 30)
    @NotNull
    private String city_name;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Suburb> suburbia = new HashSet<>();

    public City() {}

    public City(String city_name) {
        this.city_name = city_name;
    }

    public int getId() {
        return city_id;
    }

    public void setId(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + city_id + ", city_name=" + city_name + '}';
    }
}
