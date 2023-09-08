package com.projeto.bilheteriacinema.repository;



import com.projeto.bilheteriacinema.model.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Optional<Filme> getFilmeByTitulo(String titulo);
}