package com.projeto.bilheteriacinema.service;

import com.projeto.bilheteriacinema.model.entity.Produtora;
import com.projeto.bilheteriacinema.repository.ProdutoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@RequiredArgsConstructor
public class ProdutoraService {

    private final ProdutoraRepository produtoraRepository;

    public List<Produtora> getAll() {
        List<Produtora> result = produtoraRepository.findAll();
        return result;
    }

    public Produtora getById(Long id) {
        Optional<Produtora> result = produtoraRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException();
        }
    }

    public Produtora save(Produtora produtora) {
        Produtora produtoraFromDataBase = produtoraRepository.getProdutoraByNome(produtora.getNome());
        if (produtoraFromDataBase != null) {
            throw new RuntimeException("Produtora já cadastrada");
        }
        Produtora result = produtoraRepository.save(produtora);
        return result;
    }

    public Produtora update(Long id, Produtora produtora) {
        Produtora produtoraFromDataBase = produtoraRepository.getProdutoraByNome(produtora.getNome());
        if (produtoraFromDataBase.getId() != produtora.getId()) {
            throw new RuntimeException("Produtora já cadastrada");
        }

        Produtora result = produtoraRepository.save(produtora);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        produtoraRepository.deleteById(id);
    }
}