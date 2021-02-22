package com.talento.mkt.service;

import java.util.List;

import com.talento.mkt.model.Cliente;

public interface ClienteServicio {
	List<Cliente> listarClientes();
	void eliminarPorRut(String rut);
}
