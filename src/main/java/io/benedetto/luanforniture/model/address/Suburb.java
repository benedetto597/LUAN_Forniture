package io.benedetto.luanforniture.model.address;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "SUBURB")
public class Suburb {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int suburb_id;

    @NotBlank
    @Size(max = 50)
    @NotNull
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    public Suburb() {}

    public Suburb(String name) {
        this.name = name;
    }

    public int getId() {
        return suburb_id;
    }

    public void setId(int suburb_id) {
        this.suburb_id = suburb_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Suburb{" + "id=" + suburb_id + ", name=" + name + '}';
    }
}
