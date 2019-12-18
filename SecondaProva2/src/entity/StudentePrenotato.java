package entity;

public class StudentePrenotato {
	private Studente studente;
	private Appello appello;
	private Corso corso;
	public StudentePrenotato(Studente studente,Appello appello,Corso corso){
		this.studente=studente;
		this.appello=appello;
		this.corso=corso;
	}
	public Studente getStudente() {
		return studente;
	}
	public Appello getAppello() {
		return appello;
	}
	public Corso getCorso() {
		return corso;
	}
	public void setStudente(Studente studente) {
		this.studente=studente;
	}
	public void setAppello(Appello appello) {
		this.appello=appello;
	}
	public void setCorso(Corso corso) {
		this.corso=corso;
	}
	public String toString() {
		return this.studente+" "+this.corso+" "+this.appello+" ";
	}
}
