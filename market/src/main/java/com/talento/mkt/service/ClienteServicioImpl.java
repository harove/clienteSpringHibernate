package com.talento.mkt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talento.mkt.dao.ClienteDao;
import com.talento.mkt.model.Cliente;
@Service
public class ClienteServicioImpl implements ClienteServicio {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional
	public List<Cliente> listarClientes() {
		return clienteDao.listarClientes();
	}

	@Override
	@Transactional
	public void eliminarPorRut(String rut) {
		
		
	}
}
