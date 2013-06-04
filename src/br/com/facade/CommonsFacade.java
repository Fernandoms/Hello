package br.com.facade;

import javax.servlet.http.HttpSession;

import org.zkoss.zk.ui.Executions;

import br.com.bean.Usuario;

public class CommonsFacade {
	
	public Usuario retornaUsuario(){
		Usuario usuario;
		HttpSession session = (HttpSession)(Executions.getCurrent()).getDesktop().getSession().getNativeSession();
		usuario = (Usuario) session.getAttribute("usuario");
	
		return usuario;
	}

}
