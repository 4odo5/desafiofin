package org.example.entities;

import org.springframework.data.annotation.Id;

public class Usuario {

    @Id
    private int id;

    private String nome;
    private String email;
    private String senha;

}
