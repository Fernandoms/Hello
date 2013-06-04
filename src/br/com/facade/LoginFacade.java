package br.com.facade;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Executions;

import br.com.bean.Usuario;

public class LoginFacade {
	private Usuario usuario = new Usuario();
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	private void adicionaUsuarios() {
		usuarios.add(Usuario.getUSUARIO1());
		usuarios.add(Usuario.getUSUARIO2());
		usuarios.add(Usuario.getUSUARIO3());
	}

	@Command
	public void submit() {
		adicionaUsuarios();
		if (usuarios.contains(usuario)) {
			for (Usuario index : usuarios) {
				if (usuario.equals(index)) {
					usuario.setTipoUsuario(index.getTipoUsuario());
					break;
				}
			}

			HttpSession session = (HttpSession) (Executions.getCurrent())
					.getDesktop().getSession().getNativeSession();
			session.setAttribute("usuario", usuario);
			Executions.sendRedirect("/pages/home.zul");
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
