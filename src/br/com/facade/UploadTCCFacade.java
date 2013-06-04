package br.com.facade;

import org.zkoss.util.media.Media;

public class UploadTCCFacade {
	private Media arquivoTCC;

	private void manipulaArquivo() {
		// Implementar

	}

	public Media getArquivoTCC() {
		return arquivoTCC;
	}

	public void setArquivoTCC(Media arquivoTCC) {
		this.arquivoTCC = arquivoTCC;
		manipulaArquivo();
	}

}
