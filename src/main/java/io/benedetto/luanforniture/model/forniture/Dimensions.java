package io.benedetto.luanforniture.model.forniture;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DIMENSIONS")
public class Dimensions {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dimension_id;

    @NotBlank
    @NotNull
    private Double height;

    @NotBlank
    @NotNull
    private Double width;

    @NotBlank
    @NotNull
    private Double depth;

    public Dimensions() {}

    public Dimensions(Double height, Double width, Double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getDimensions_id() {
        return dimension_id;
    }

    public void setDimensions_id(int dimension_id) {
        this.dimension_id = dimension_id;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimensions{" +
                "dimensions_id=" + dimension_id +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
    

}
