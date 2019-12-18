package entity;

public class Studente {
	private String Nome;
	private String Cognome;
	private String Matricola;
	public Studente(String Nome,String Cognome,String Matricola) {
		this.Nome=Nome;
		this.Cognome=Cognome;
		this.Matricola=Matricola;
	}
	
	
	
	public String toString() {
		return this.Nome+" "+this.Cognome+" "+this.Matricola;
	}
	public String getNome() {
		return Nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public String getMatricola() {
		return Matricola;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public void setCognome(String Cognome) {
		this.Cognome = Cognome;
	}
	public void setMatricola(String Matricola) {
		this.Matricola = Matricola;
	}
}
