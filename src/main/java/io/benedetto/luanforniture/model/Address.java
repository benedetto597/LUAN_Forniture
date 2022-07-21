package io.benedetto.luanforniture.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int address_id;
    
    @NotBlank
    @Size(max = 100)
    @NotNull
    private String address_description;

    @OneToOne
	@JoinColumn(name = "departament_id")
	private Department departament_name;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city_name;

    @OneToOne
    @JoinColumn(name = "suburb_id")
    private Suburb suburb_name;

    public Address() {}

    public Address(String address_description) {
        this.address_description = address_description;
    }

    public int getId() {
        return address_id;
    }

    public void setId(int address_id) {
        this.address_id = address_id;
    }

    public Department getDepartament_name() {
        return departament_name;
    }

    public void setDepartament_name(Department departament_name) {
        this.departament_name = departament_name;
    }

    public City getCity_name() {
        return city_name;
    }

    public void setCity_name(City city_name) {
        this.city_name = city_name;
    }

    public Suburb getSuburb_name() {
        return suburb_name;
    }

    public void setSuburb_name(Suburb suburb_name) {
        this.suburb_name = suburb_name;
    }

    public String getAddress_description() {
        return address_description;
    }

    public void setAddress_description(String address_description) {
        this.address_description = address_description;
    }

    @Override
    public String toString() {
        return "Address{" + "id=" + address_id + ", departament_name=" + departament_name + ", city_name=" + city_name + ", suburb_name=" + suburb_name + ", address_description=" + address_description + '}';
    }


}
