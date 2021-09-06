package com.root.portalEventos.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.root.portalEventos.entidades.Evento;
import com.root.portalEventos.repositorios.EventoRepository;

@RestController
public class EventoController {

	@Autowired
	private EventoRepository eventosRepository;
	

	@PostMapping(path = "evento", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Evento> create(@RequestBody Evento novoEvento) {
		
		Evento evento = eventosRepository.save(novoEvento);
		if (evento != null) {
			return new ResponseEntity<>(evento, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}

	@GetMapping(path = "evento", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Evento> listaEvento() {
		return eventosRepository.findAll();
	}

}
