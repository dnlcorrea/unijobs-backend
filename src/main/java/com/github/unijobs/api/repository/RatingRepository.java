package com.github.unijobs.api.repository;

import com.github.unijobs.api.model.Product;
import com.github.unijobs.api.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {

}
