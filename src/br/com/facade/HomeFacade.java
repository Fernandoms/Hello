package br.com.facade;

import br.com.bean.Usuario;

public class HomeFacade {
	private Usuario usuario;
	CommonsFacade commonsFacade = new CommonsFacade();

	public Usuario getUsuario() {
		usuario = commonsFacade.retornaUsuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
