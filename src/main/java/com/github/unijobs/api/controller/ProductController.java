package com.github.unijobs.api.controller;

import com.github.unijobs.api.model.Product;
import com.github.unijobs.api.model.Rating;
import com.github.unijobs.api.services.ProductService;
import com.github.unijobs.api.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final RatingService ratingService;

    @Autowired
    public ProductController(ProductService productService, RatingService ratingService) {
        this.productService = productService;
        this.ratingService = ratingService;
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok(productService.save(product));
    }

    @PostMapping("/{id}/ratings")
    public ResponseEntity<Optional<Product>> saveRating(@PathVariable Long id, @RequestBody Rating rating) {
        return ResponseEntity.ok(ratingService.save(rating));
    }

}
