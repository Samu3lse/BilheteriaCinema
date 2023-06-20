package com.projeto.bilheteriacinema.service;

import com.projeto.bilheteriacinema.model.entity.Filme;
import com.projeto.bilheteriacinema.repository.FilmeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class FilmeService {

    private final FilmeRepository filmeRepository;

    public List<Filme> getAll() {
        List<Filme> filmes = filmeRepository.findAll();
        return filmes;
    }

    public Filme getById(Long id) {
        Filme filme = filmeRepository.getById(id);

        if(filme != null){
            return filme;
        }else{
            return null;
        }
    }

    public Filme save(Filme filme) {

        Filme filmeSaved = filmeRepository.save(filme);
        return filmeSaved;
    }

    public Filme update(Long id, Filme filme) {
        Filme filmeFromDataBse = this.filmeRepository.findById(id).get();
        if (filmeFromDataBse != null) {
            filme.setId(id);
            Filme filmeUpdated = filmeRepository.save(filme);
            return filmeUpdated;
        } else {
            System.out.println("Filme não encontrado");
            return null;
        }
    }

    public void delete(Long id) {
        Filme filme = this.getById(id);

        if(filme != null)
        { filmeRepository.deleteById(id);
        }else{
            System.out.println("Filme nao encontrado");;
        }
    }

}
