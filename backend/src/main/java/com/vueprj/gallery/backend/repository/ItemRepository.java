package com.vueprj.gallery.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vueprj.gallery.backend.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
    
}
