package br.com.caelum.estoque.modelo.usuario;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	
	private Date dataErro;
	private String message;
	
	public InfoFault(String message, Date dataErro) {
		this.message = message;
		this.dataErro = dataErro;
	}
	
	public InfoFault() {}
}
