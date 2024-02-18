package com.WavyDaves.Api.controllers;

import com.WavyDaves.Api.models.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/items")
public class ItemsController {

    @GetMapping
    public void getItems() {
        throw new RuntimeException("Method not Implemented");
    }

    @PostMapping
    public void postItem() {
        throw new RuntimeException("Method not implemented");
    }

}
