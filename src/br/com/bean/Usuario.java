package br.com.bean;

import java.io.Serializable;

public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Usuario USUARIO1 = new Usuario("Fernando", "aa", TipoUsuario.getALUNO());
	private static Usuario USUARIO2 = new Usuario("Alessandreia", "aa", TipoUsuario.getPROFESSOR());
	private static Usuario USUARIO3 = new Usuario("Jairo", "aa", TipoUsuario.getADMIN());
	
	private String login;
	private String senha;
	private TipoUsuario tipoUsuario;
	
	public Usuario() {
		this.login = new String();
		this.senha = new String();
		this.tipoUsuario = null;
	}
	
	public Usuario(String login, String senha, TipoUsuario tipoUsuario) {
		this.login = login;
		this.senha = senha;
		this.tipoUsuario = tipoUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public static Usuario getUSUARIO1() {
		return USUARIO1;
	}

	public static Usuario getUSUARIO2() {
		return USUARIO2;
	}

	public static Usuario getUSUARIO3() {
		return USUARIO3;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
}
