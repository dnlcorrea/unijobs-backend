package com.github.unijobs.api.services;

import com.github.unijobs.api.model.Item;
import com.github.unijobs.api.model.Product;
import com.github.unijobs.api.repository.ProductRepository;
import com.github.unijobs.api.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private final ServiceRepository serviceRepository;
    private final ProductRepository productRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository1, ServiceRepository serviceRepository, ProductRepository productRepository) {
        this.itemRepository = itemRepository1;
        this.serviceRepository = serviceRepository;
        this.productRepository = productRepository;
    }

    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();

        items.addAll(serviceRepository.findAll());
        items.addAll(productRepository.findAll());

        Collections.sort(items, new Comparator<Item>() {
            public int compare(Item o1, Item o2) {
                return o2.getCreatedAt().compareTo(o1.getCreatedAt());
            }
        });
        return items;
    }
}
