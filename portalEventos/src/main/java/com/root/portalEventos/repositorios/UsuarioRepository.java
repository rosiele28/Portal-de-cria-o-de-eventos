package com.root.portalEventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.root.portalEventos.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{}
