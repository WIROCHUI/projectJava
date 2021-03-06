package com.cibertec.service;

import java.util.Optional;

import com.cibertec.commons.IGenericService;
import com.cibertec.model.Usuario;

public interface IUsuarioService extends IGenericService<Usuario, Integer> {
	
	public Optional<Usuario> findByUsername(String username);

}
