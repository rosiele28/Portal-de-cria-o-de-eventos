package com.root.portalEventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.root.portalEventos.entidades.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
	
}
