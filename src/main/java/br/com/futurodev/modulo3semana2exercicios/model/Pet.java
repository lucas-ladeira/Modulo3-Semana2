package br.com.futurodev.modulo3semana2exercicios.model;

import lombok.Data;

@Data
public class Pet {          // Atributos da Classe Pet

    private Integer id;
    private String nome;
    private String raca;
    private Tutor tutor;

}
