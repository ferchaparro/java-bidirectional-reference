package com.example.demo.controllers;

import com.example.demo.service.ParentService;
import com.example.demo.shared.ParentDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/parents")
public class ParentController {
    private final ParentService service;

    @GetMapping("{id}")
    public ResponseEntity<ParentDTO> find(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.find(id));
    }


    @PostMapping
    public ResponseEntity<Long> save(@RequestBody ParentDTO dto) {
        long id = service.save(dto);
        return ResponseEntity.ok(id);
    }
}
