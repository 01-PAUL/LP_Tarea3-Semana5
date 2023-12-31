package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Empleado;
import com.empresa.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository repository;
	
	@Override
	public Empleado insertaEmpleado(Empleado obj) {
		return repository.save(obj);
	}

	@Override
	public List<Empleado> listaPorNombres(String nombres) {
		return repository.findByNombresIgnoreCase(nombres);
	}

	@Override
	public Empleado actualizaEmpleado(Empleado obj) {
		return repository.save(obj);
	}

	@Override
	public List<Empleado> listaPorNombresLike(String nombres) {
		return repository.findByNombresLike(nombres);
	}

	@Override
	public Optional<Empleado> buscaEmpleado(int idEmpleado) {
		return repository.findById(idEmpleado);
	}



}
