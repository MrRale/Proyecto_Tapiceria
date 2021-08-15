package com.grupotapiceria.tapiceria.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupotapiceria.tapiceria.model.Cliente;
import com.grupotapiceria.tapiceria.repositorio.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	
	public List<Cliente> getAClientes(){
		return clienteRepository.findAll();
		
	}
	
	public void delete (Cliente cliente) {
		clienteRepository.delete(cliente);
		
	}
	
	public Optional<Cliente> findById(Long id_cliente){
		return clienteRepository.findById(id_cliente);
		
		
	}
}
