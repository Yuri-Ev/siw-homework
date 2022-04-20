package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@Entity
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cognome;
	
	private LocalDate dataDiNascita;
	private String luogoDiNascita;
	
	@Column(unique = true)
	private int vatin;
	
	
	@OneToMany(mappedBy = "docente",fetch = FetchType.EAGER) /*Caricare il prima possibile i riferimenti ai corsi tenuti dai professori puó risultare utile e non incide molto sui tempi di attesa*/
	private List<Corso> corsiTenuti;

	

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}


	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}


	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}


	public int getVatin() {
		return vatin;
	}


	public void setVatin(int vatin) {
		this.vatin = vatin;
	}


	public List<Corso> getCorsiTenuti() {
		return corsiTenuti;
	}


	public void setCorsiTenuti(List<Corso> corsiTenuti) {
		this.corsiTenuti = corsiTenuti;
	}
	
	
}
