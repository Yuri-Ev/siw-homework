package it.uniroma3.siw.model;

import javax.persistence.*;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"via","numeroCivico","cap"}))

@Entity
public class Società {
	
	@Id
	private String ragioneSociale;
	
	private String via;
	private int numeroCivico;
	private String comune;
	private int cap;
	private String provincia;
	private int numeroDiTelefono;
	
	
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
	public String getVia() {
		return via;
	}
	
	public void setVia(String via) {
		this.via = via;
	}
	
	public int getNumeroCivico() {
		return numeroCivico;
	}
	
	public void setNumeroCivico(int numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	
	public String getComune() {
		return comune;
	}
	
	public void setComune(String comune) {
		this.comune = comune;
	}
	
	public int getCap() {
		return cap;
	}
	
	public void setCap(int cap) {
		this.cap = cap;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int getNumeroDiTelefono() {
		return numeroDiTelefono;
	}
	
	public void setNumeroDiTelefono(int numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}

}
