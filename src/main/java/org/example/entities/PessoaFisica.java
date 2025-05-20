package org.example.entities;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaFisica extends Usuario{

    @NotNull
    private String cpf;

}
