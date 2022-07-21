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
        @UniqueConstraint(columnNames = "name"),
    })
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;

    @NotBlank
    @Size(max = 20)
    @NotNull
    private String name;

    @OneToOne
	@JoinColumn(name = "city_id")
	private City capital_name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<City> cities = new HashSet<>();

    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    public int getId() {
        return department_id;
    }

    public void setId(int department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + department_id + ", name=" + name + '}';
    }
}
