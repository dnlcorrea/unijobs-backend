package com.github.unijobs.api.services;

import com.github.unijobs.api.model.Item;
import com.github.unijobs.api.repository.ProductRepository;
import com.github.unijobs.api.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

//    @Query("SELECT avg(rating) from ratings where ")
//    public double getAverageRating();
}
