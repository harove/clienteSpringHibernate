package com.talento.mkt.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.talento.mkt.model.Cliente;

@Repository
public class ClienteDaoImpl implements ClienteDao {
	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Cliente> listarClientes() {
		List<Cliente> clientes = new ArrayList<>();
		Session session = factory.getCurrentSession();
		clientes = session.createQuery("from Cliente", Cliente.class).list();
		return clientes;
	}

	@Override
	public Cliente buscarCliente(String rut) {
		Session session = factory.getCurrentSession();
		return session.get(Cliente.class, rut);
	}

	@Override
	public void eliminarCliente(Cliente cliente) {
		Session session = factory.getCurrentSession();
		if (cliente !=null)
			session.delete(cliente);	
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		Session session = factory.getCurrentSession();
		session.save(session);
	}
}
