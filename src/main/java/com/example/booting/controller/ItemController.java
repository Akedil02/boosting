package com.example.booting.controller;


import com.example.booting.entity.Item;
import com.example.booting.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService service;

    public ItemController(ItemService service){
        this.service = service;
    }

    @PostMapping
    public Item create(@RequestBody Item item){
        return service.saveItem(item);
    }

    @GetMapping
    public List<Item> getAll(){
        return service.findAll();
    }
}
