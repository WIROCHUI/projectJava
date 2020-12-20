package com.cibertec.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.TipoEmpleado;

public interface ITipoEmpleadoDao extends JpaRepository<TipoEmpleado, Integer> {

}
