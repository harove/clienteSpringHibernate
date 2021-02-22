package com.talento.mkt.service;

import java.util.List;

import com.talento.mkt.model.Cliente;

public interface ClienteServicio {
	List<Cliente> listarClientes();
	void guardarCliente(Cliente cliente);
	Cliente buscarCliente(String rut);
	void eliminarCliente(Cliente cliente);
	void eliminarCliente(String rut);
	boolean existeCliente(Cliente cliente);
}

