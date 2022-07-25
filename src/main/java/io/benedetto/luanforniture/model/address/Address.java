package io.benedetto.luanforniture.model.address;

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
	private Department department;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "suburb_id")
    private Suburb suburb;

    public Address() {}

    public Address(String address_description, Department department, City city, Suburb suburb) {
        this.address_description = address_description;
        this.department = department;
        this.city = city;
        this.suburb = suburb;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress_description() {
        return address_description;
    }

    public void setAddress_description(String address_description) {
        this.address_description = address_description;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Suburb getSuburb() {
        return suburb;
    }

    public void setSuburb(Suburb suburb) {
        this.suburb = suburb;
    }

    @Override
    public String toString() {
        return "Address [address_description=" + address_description + ", address_id=" + address_id + ", city=" + city
                + ", department=" + department + ", suburb=" + suburb + "]";
    }

}
