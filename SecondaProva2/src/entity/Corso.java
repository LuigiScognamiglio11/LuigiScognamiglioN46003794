package entity;

public class Corso {
	private String NomeCorso;
	private int CFU;
	private String Docente;
	private int IDcorso;
	public Corso(String NomeCorso,String Docente,int CFU,int IDcorso){ 
		this.NomeCorso=NomeCorso;
		this.Docente=Docente;
		this.CFU=CFU;
		this.IDcorso=IDcorso;
	}
	public String toString() {
		return this.NomeCorso+" "+this.Docente+" "+this.CFU+" "+this.IDcorso;
	}
	public String getNomeCorso() {
		return NomeCorso;
	}
	public String getDocente() {
		return Docente;
	}
	public int getCFU() {
		return CFU;
	}
	public void setNomeCorso(String NomeCorso) { 
		this.NomeCorso=NomeCorso;
	}
	public void setDocente(String Docente) { 
		this.Docente=Docente;
	}
	public void setCFU(int CFU) { 
		this.CFU=CFU;
	}
	public void setIDcorso(int IDcorso) {
		this.IDcorso=IDcorso;
	}
}
