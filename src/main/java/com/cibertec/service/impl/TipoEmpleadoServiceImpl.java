package com.cibertec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cibertec.commons.GenericServiceImpl;
import com.cibertec.dao.IPaisDao;
import com.cibertec.dao.ITipoEmpleadoDao;
import com.cibertec.model.Departamento;
import com.cibertec.model.TipoEmpleado;
import com.cibertec.service.IPaisService;
import com.cibertec.service.ITipoEmpleadoService;

@Service
public class TipoEmpleadoServiceImpl extends GenericServiceImpl<TipoEmpleado, Integer> implements ITipoEmpleadoService{

	@Autowired
	private ITipoEmpleadoDao tipoEmpleadoDao;
	
	@Override
	public JpaRepository<TipoEmpleado, Integer> getDao() {
		// TODO Auto-generated method stub
		return tipoEmpleadoDao;
	}

}
