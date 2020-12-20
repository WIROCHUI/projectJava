package com.cibertec.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.EstadoCivil;

public interface IEstadoCivilDao extends JpaRepository<EstadoCivil, Integer> {

}
