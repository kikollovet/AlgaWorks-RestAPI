package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Luis");
		cliente1.setEmail("luis@luis.com");
		cliente1.setTelefone("222-2222");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Joana");
		cliente2.setEmail("Joana@luis.com");
		cliente2.setTelefone("333-3333");
		
		var cliente3 = new Cliente();
		cliente3.setId(3L);
		cliente3.setNome("Maria");
		cliente3.setEmail("maria@luis.com");
		cliente3.setTelefone("444-4444");
		
		return Arrays.asList(cliente1, cliente2, cliente3);
	}

}
