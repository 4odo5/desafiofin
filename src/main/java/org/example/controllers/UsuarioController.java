package org.example.controllers;

import jakarta.validation.constraints.NotNull;
import org.example.dtos.CadastroUsuarioDTO;
import org.example.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @PostMapping("/cadastro")
    public ResponseEntity<CadastroUsuarioDTO> cadastrarUsuario(@RequestBody CadastroUsuarioDTO usuario) {
        return ResponseEntity.ok(usuario);
    }
}
