package com.cibertec.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {

	public Optional<Usuario> findByUsername(String username);
}
