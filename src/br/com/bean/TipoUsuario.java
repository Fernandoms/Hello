package br.com.bean;

import java.io.Serializable;


public class TipoUsuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private static TipoUsuario ALUNO = new TipoUsuario("Aluno", new Long(1));
	private static TipoUsuario PROFESSOR = new TipoUsuario("Professor", new Long(2));
	private static TipoUsuario ADMIN = new TipoUsuario("Administrador", new Long(3));
	
	private String tipo;
	private Long id;
	
	public TipoUsuario(String tipo, Long id) {
		this.tipo = tipo;
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static TipoUsuario getALUNO() {
		return ALUNO;
	}

	public static TipoUsuario getPROFESSOR() {
		return PROFESSOR;
	}

	public static TipoUsuario getADMIN() {
		return ADMIN;
	}

}
