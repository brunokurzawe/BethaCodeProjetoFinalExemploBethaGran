package com.betha.exemplo.exemplo.resource;

import com.betha.exemplo.exemplo.model.ContaUsuario;
import com.betha.exemplo.exemplo.model.Pais;
import com.betha.exemplo.exemplo.repository.ContaUsuarioRepository;
import com.betha.exemplo.exemplo.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contas-usuarios")
public class ContaUsuarioController {

    @Autowired
    private ContaUsuarioRepository repository;

    @GetMapping
    public List<ContaUsuarioDto> getContaUsuario() {
        return repository.findAll().stream().map(c -> ContaUsuarioDto.toDTO(c)).collect(Collectors.toList());
    }

    @PostMapping
    public ContaUsuario create(@RequestBody ContaUsuario contaUsuario) {
        return repository.save(contaUsuario);
    }
}
