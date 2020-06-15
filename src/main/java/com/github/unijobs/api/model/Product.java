package com.github.unijobs.api.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="products")
public class Product extends Item{
    private Double price;

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<Rating> ratings;

    public Double getPrice() { return price; }

    public void setPrice(Double price) {
        this.price = price;
    }
}
