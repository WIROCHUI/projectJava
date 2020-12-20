package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.commons.GenericServiceImpl;
import com.cibertec.dao.IEstadoCivilDao;
import com.cibertec.dao.IPaisDao;
import com.cibertec.model.Departamento;
import com.cibertec.model.EstadoCivil;
import com.cibertec.service.IEstadoCivilService;
import com.cibertec.service.IPaisService;

@Service
public class EstadoCivilServiceImpl extends GenericServiceImpl<EstadoCivil, Integer> implements IEstadoCivilService{

	@Autowired
	private IEstadoCivilDao estadoCivilDao;
	
	@Override
	public JpaRepository<EstadoCivil, Integer> getDao() {
		// TODO Auto-generated method stub
		return estadoCivilDao;
	}

}
