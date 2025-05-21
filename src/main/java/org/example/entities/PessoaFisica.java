package org.example.entities;

import jakarta.validation.constraints.NotNull;

public class PessoaFisica extends Usuario{

    @NotNull
    private String cpf;

}
