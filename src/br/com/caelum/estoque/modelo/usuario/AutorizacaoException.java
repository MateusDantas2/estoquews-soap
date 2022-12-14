package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name = "AutorizacaoFault")
public class AutorizacaoException extends Exception {
	
	public AutorizacaoException(String message) {
		super(message);
	}
	
	public InfoFault getFaultInfo() {
	    return new InfoFault("Token invalido" , new Date());
	}
}
