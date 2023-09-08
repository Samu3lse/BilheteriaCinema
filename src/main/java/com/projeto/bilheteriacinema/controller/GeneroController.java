package com.projeto.bilheteriacinema.controller;

import com.projeto.bilheteriacinema.model.entity.Genero;
import com.projeto.bilheteriacinema.service.GeneroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/generos")
@RestController
@RequiredArgsConstructor
public class GeneroController {

    private final GeneroService generoService;

    @GetMapping
    public ResponseEntity<List<Genero>> getAll() {
        List<Genero> generoResponse =  generoService.getAll();
        return ResponseEntity.ok(generoResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> getById(@PathVariable Long id) {
        Genero generoResponse = generoService.getById(id);
        return ResponseEntity.ok(generoResponse);
    }

    @PostMapping
    public ResponseEntity<Genero> save(@RequestBody Genero genero) {
        Genero generoResponse = generoService.save(genero);
        return ResponseEntity.ok(generoResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genero> update(@PathVariable Long id, @RequestBody Genero genero) {
        Genero generoResponse = generoService.update(id, genero);
        return ResponseEntity.ok(generoResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        generoService.delete(id);
        return ResponseEntity.ok().build();
    }
}