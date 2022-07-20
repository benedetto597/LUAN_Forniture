package io.benedetto.luanforniture.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "DEPARTMENT", 
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "departament_name"),
    })
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(max = 40)
    @NotNull
    private String departament_name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<City> cities = new HashSet<>();

    public Department() {}

    public Department(String departament_name) {
        this.departament_name = departament_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartament_name() {
        return departament_name;
    }

    public void setDepartament_name(String departament_name) {
        this.departament_name = departament_name;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", departament_name=" + departament_name + '}';
    }
}
