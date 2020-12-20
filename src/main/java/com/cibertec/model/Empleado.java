package com.cibertec.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Empleado implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "empleado_id")
	private int id;
	
	@Column(name = "nombre")
	@NotEmpty
	private String nombre;
	
	@Column(name = "apellido_paterno")
	@NotEmpty
	private String apellidoPaterno;
	
	@Column(name = "apellido_materno")
	@NotEmpty
	private String apellidoMaterno;
	
	@Column(name = "direccion")	
	@NotEmpty
	private String direccion;
	
	@Column(name = "telefono")
	@NotEmpty
	@Pattern(regexp="[0-9]{9}")
	private String telefono;
	
	@Column(name = "fecha_nacimiento")	
	@NotEmpty
	private String fechaNacimiento;
	
	@Column(name = "email")
	@NotEmpty
	@Email
	private String email;
	
	@ManyToOne
	@JoinColumn(name="departamento_id", nullable = false)
	@NotNull
	private Departamento departamento;
	
	@ManyToOne
	@JoinColumn(name="tipo_empleado_id", nullable = false)
	@NotNull
	private TipoEmpleado tipo;
	
	@ManyToOne
	@JoinColumn(name="estado_id", nullable = false)
	@NotNull
	private EstadoCivil estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public TipoEmpleado getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
	}

	public EstadoCivil getEstado() {
		return estado;
	}

	public void setEstado(EstadoCivil estado) {
		this.estado = estado;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	
	
	
}