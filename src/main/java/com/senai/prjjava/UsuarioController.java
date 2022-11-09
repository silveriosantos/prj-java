package com.senai.prjjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api/usuario")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    UsuarioRepository uRepository;

    @PostMapping("/add")
    public @ResponseBody String addUsuario(
            @RequestParam String name,
            @RequestParam String email) {
        Usuario objU = new Usuario();
        objU.setName(name);
        objU.setEmail(email);
        uRepository.save(objU);
        return "Salvo";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Usuario> BuscarUsuarios() {
        return uRepository.findAll();
    }

}
