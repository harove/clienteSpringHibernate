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

}
