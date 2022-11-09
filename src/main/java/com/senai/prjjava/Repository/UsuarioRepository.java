package com.senai.prjjava.Repository;

import org.springframework.data.repository.CrudRepository;

import com.senai.prjjava.Entity.Usuario;

public interface UsuarioRepository  extends CrudRepository<Usuario, Integer> {
    
}
