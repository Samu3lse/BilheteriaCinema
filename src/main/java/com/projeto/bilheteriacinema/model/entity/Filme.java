package com.projeto.bilheteriacinema.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "filme_sequence")
    @SequenceGenerator(name = "filme_sequence", sequenceName = "fil_seq")
    private Long id;
    private String titulo;

    @ManyToOne
    private Genero genero;

    @ManyToOne
    private Produtora produtora;
}