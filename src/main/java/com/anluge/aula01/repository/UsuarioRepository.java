package com.anluge.aula01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anluge.aula01.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
