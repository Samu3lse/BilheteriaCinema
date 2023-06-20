package com.projeto.bilheteriacinema.repository;

import com.projeto.bilheteriacinema.model.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long> {
}