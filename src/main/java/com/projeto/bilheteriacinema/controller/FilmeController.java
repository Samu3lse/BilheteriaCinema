package com.projeto.bilheteriacinema.controller;

import com.projeto.bilheteriacinema.model.entity.Filme;
import com.projeto.bilheteriacinema.service.FilmeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/filmes")
@RestController
@RequiredArgsConstructor


public class FilmeController {

    private final FilmeService filmeService;


    @GetMapping
    public List<Filme> getAll() {
        return filmeService.getAll();
    }

    @GetMapping("/{id}")
    public Filme getByID(@PathVariable Long id) {
        return filmeService.getById(id);
    }

    @PostMapping
    public Filme save(@RequestBody Filme filme) {
        return filmeService.save(filme);
    }

    @PutMapping("/{id}")
    public Filme update(@PathVariable Long id, @RequestBody Filme filme) {
        return filmeService.update(id, filme);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        filmeService.delete(id);
    }

}