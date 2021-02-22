package com.talento.mkt.dao;

import java.util.List;

import com.talento.mkt.model.Cliente;

public interface ClienteDao {
	List<Cliente> listarClientes();
	Cliente buscarCliente(String rut);
	void eliminarCliente(Cliente cliente);
	void guardarCliente(Cliente cliente);
}
