package com.github.unijobs.api.services;

import com.github.unijobs.api.model.Product;
import com.github.unijobs.api.model.Rating;
import com.github.unijobs.api.repository.ProductRepository;
import com.github.unijobs.api.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;
    private final ProductRepository productRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository, ProductRepository productRepository) {
        this.ratingRepository = ratingRepository;
        this.productRepository = productRepository;
    }

    public Optional<Product> save(Rating rating) {

        Optional<Product> product = productRepository.findById(rating.getProduct().getId());

        if (product.isPresent()) {
            ratingRepository.save(rating);
        }

        return product;
    }
}
