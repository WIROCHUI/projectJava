package com.cibertec.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.model.Departamento;

public interface IPaisDao extends JpaRepository<Departamento, Integer> {

}
