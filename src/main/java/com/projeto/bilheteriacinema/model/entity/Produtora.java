package com.projeto.bilheteriacinema.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produtora {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produtora_sequence")
    @SequenceGenerator(name = "produtora_sequence", sequenceName = "pro_seq")
    private Long id;
    private String nome;

    @OneToMany
    List<Filme> filmes;
}