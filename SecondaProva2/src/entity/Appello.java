package entity;

import java.time.LocalDate;;

public class Appello {
	private LocalDate DataAppello;
	private TipoData Tipo;
	private String Aula;
	private int IDappello;
	
	public Appello(LocalDate DataAppello,TipoData Tipo,String Aula,int IDappello) {
		this.DataAppello=DataAppello;
		this.Tipo=Tipo;
		this.Aula=Aula;
		this.IDappello=IDappello;
		
	}
	public String toString() {
		return this.DataAppello+" "+this.Tipo+" "+this.Aula+" "+this.IDappello;
	}
	public LocalDate getDataAppello() {
		return DataAppello;
	}
	public TipoData getTipoData() {
		return Tipo;
	}
	public void setDataAppello(LocalDate DataAppello) {
		this.DataAppello=DataAppello;
	}
	public void setTipoData(TipoData Tipo) {
		this.Tipo=Tipo;
	}
	public String getAula() {
		return Aula;
	}
	public void setAula(String Aula) {
		this.Aula=Aula;
	}
	public int getIDappello() {
		return IDappello;
	}
	public void setAula(int IDappello) {
		this.IDappello=IDappello;
	}
	
}
