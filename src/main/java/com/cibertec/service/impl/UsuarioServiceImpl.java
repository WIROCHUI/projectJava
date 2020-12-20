package com.cibertec.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.commons.GenericServiceImpl;
import com.cibertec.dao.IUsuarioDao;
import com.cibertec.model.Usuario;
import com.cibertec.service.IUsuarioService;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Integer> implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Override
	public JpaRepository<Usuario, Integer> getDao() {
		// TODO Auto-generated method stub
		return usuarioDao;
	}

	@Override
	public Optional<Usuario> findByUsername(String username) {
		// TODO Auto-generated method stub
		return usuarioDao.findByUsername(username);
	}

}
