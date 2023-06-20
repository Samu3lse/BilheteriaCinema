package com.projeto.bilheteriacinema.service;

import com.projeto.bilheteriacinema.model.entity.Genero;
import com.projeto.bilheteriacinema.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GeneroService {
    private final GeneroRepository generoRepository;

    public List<Genero> getAll(){
        return null;
    }
    public Genero getById(Long id){
        return null;
    }
    public Genero save(Genero genero){
        return null;
    }
    public Genero update(Long id, Genero genero ){
        return null;
    }
    public void delete(Long id){

    }
}
