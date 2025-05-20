package org.example.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CadastroUsuarioDTO {

    private int nome;
    private String email;
    private String senha;
}
