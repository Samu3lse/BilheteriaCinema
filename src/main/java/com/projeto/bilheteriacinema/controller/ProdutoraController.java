package com.projeto.bilheteriacinema.controller;



import com.projeto.bilheteriacinema.model.entity.Produtora;
import com.projeto.bilheteriacinema.service.ProdutoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produtoras")
@RequiredArgsConstructor
@RestController
public class ProdutoraController {

    private final ProdutoraService produtoraService;

    @GetMapping
    public ResponseEntity<List<Produtora>> getAll() {
        List<Produtora> produtoraResponse = produtoraService.getAll();
        return ResponseEntity.ok(produtoraResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produtora> getById(@PathVariable Long id) {
        Produtora produtoraResponse = produtoraService.getById(id);
        return ResponseEntity.ok(produtoraResponse);
    }

    @PostMapping
    public ResponseEntity<Produtora> save(@RequestBody Produtora produtora) {
        Produtora produtoraResponse = produtoraService.save(produtora);
        return ResponseEntity.ok(produtoraResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produtora> update(@PathVariable Long id, @RequestBody Produtora produtora) {
        Produtora produtoraResponse = produtoraService.update(id, produtora);
        return ResponseEntity.ok(produtoraResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        produtoraService.delete(id);
        return ResponseEntity.ok().build();
    }
}