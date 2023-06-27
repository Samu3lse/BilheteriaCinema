package com.projeto.bilheteriacinema.service;

import com.projeto.bilheteriacinema.exception.RecursoNaoEncontradoException;
import com.projeto.bilheteriacinema.model.entity.Genero;
import com.projeto.bilheteriacinema.repository.GeneroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GeneroService {
    private final GeneroRepository generoRepository;

    public List<Genero> getAll(){
        List<Genero> result = generoRepository.findAll();
        return result;
    }


    public Genero getById(Long id){

        Optional<Genero> result = generoRepository.findById(id);
        if (result.isPresent()){
            return result.get();
        }else {
            throw new RecursoNaoEncontradoException();
        }
    }


    public Genero save(Genero genero){
        Genero result = generoRepository.save(genero);
        return result;
    }

    public Genero update(Long id, Genero genero ){
        getById(id);
        genero.setId(id);
        Genero result = generoRepository.save(genero);
        return result;
    }


    public void delete(Long id){
        getById(id);
        generoRepository.deleteById(id);
    }
}
