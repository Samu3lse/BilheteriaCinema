package com.projeto.bilheteriacinema.service;

import com.projeto.bilheteriacinema.model.entity.Filme;
import com.projeto.bilheteriacinema.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public List<Filme> getAll() {
        List<Filme> result = filmeRepository.findAll();
        return result;
    }

    public Filme getById(Long id) {
        Optional<Filme> result = filmeRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            throw new RuntimeException("Opção não encontrada");
        }
    }

    public Filme save(Filme filme) {

        Filme result = filmeRepository.save(filme);
        return result;
    }

    public Filme update(Long id, Filme filme) {
        getById(id);
        filme.setId(id);
        Filme result = filmeRepository.save(filme);
        return result;
    }

    public void delete(Long id) {
        getById(id);
        filmeRepository.deleteById(id);
    }
}
