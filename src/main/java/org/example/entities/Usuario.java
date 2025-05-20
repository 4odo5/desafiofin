package org.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Usuario {

    @Id
    private int id;

    private String nome;
    private String email;
    private String senha;

}
