package io.benedetto.luanforniture.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "CLOTHES", 
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "cloth_name"),
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
    private String color;

    public Clothes() {}

    
}
