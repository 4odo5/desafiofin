package org.example.controllers;

import org.example.dtos.CadastroUsuarioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @PostMapping(value = "/cadastro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CadastroUsuarioDTO> cadastrarUsuario(@RequestBody CadastroUsuarioDTO dto) {

        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}

