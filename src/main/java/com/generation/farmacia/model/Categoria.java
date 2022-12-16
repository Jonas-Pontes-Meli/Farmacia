package com.generation.farmacia.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotBlank(message = "O nome não pode ser vazio")
    @Size(min = 3,max = 150, message = "O titulo não pode ser menor que 10 e maior que 150")
    private String titulo;

    @NotBlank(message = "A descrição ão pode ser vazio")
    @Size(min = 10,max = 200, message = "A descrição não pode ser menor que 10 e maior que 200")
    private String Descricao;
}
