package com.github.unijobs.api.repository;

import com.github.unijobs.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    public List<Category> findAll();
}