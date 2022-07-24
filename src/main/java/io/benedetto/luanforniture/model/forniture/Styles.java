package io.benedetto.luanforniture.model.forniture;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "STYLES",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "name"),
    })
public class Styles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int style_id;

    @NotBlank
    @Size (max = 20)
    @NotNull
    private String name;

    public Styles() {}
    
    public Styles(String name) {
        this.name = name;
    }

    public int getStyles_id() {
        return style_id;
    }

    public void setStyles_id(int style_id) {
        this.style_id = style_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Styles{" + "styles_id=" + style_id + ", name=" + name + '}';
    }
}
