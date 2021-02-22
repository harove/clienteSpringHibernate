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
	public void guardarCliente(Cliente cliente) {
		clienteDao.guardarCliente(cliente);
	}

	@Override
	@Transactional
	public Cliente buscarCliente(String rut) {
		Cliente cliente = clienteDao.buscarCliente(rut);
		return cliente;
	}
	
	@Override
	@Transactional
	public void eliminarCliente(Cliente cliente) {
		clienteDao.eliminarCliente(cliente);
	}

	@Override
	@Transactional
	public void eliminarCliente(String rut) {
		Cliente cliente = clienteDao.buscarCliente(rut);
		clienteDao.eliminarCliente(cliente);	
	}

	@Override
	public boolean existeCliente(Cliente cliente) {
		return clienteDao.buscarCliente(cliente.getRut())!=null;
	
	}
}
