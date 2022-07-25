package io.benedetto.luanforniture.model.forniture;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TYPES",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class Types {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int type_id;

    @NotBlank
    @Size (max = 20)
    @NotNull
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "forniture_id")
    private Fornitures fornitures;

    public Types() {}

    public Types(String name) {
        this.name = name;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Types [type_id=" + type_id + ", name=" + name + "]";
    }
}
