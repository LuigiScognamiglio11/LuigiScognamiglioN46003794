package entity;

public class AppelloCorso {
	private Appello appello;
	private Corso corso;
	public AppelloCorso(Appello appello, Corso corso){
		this.appello=appello;
		this.corso=corso;
	}
	public Appello getAppello() {
		return appello;
	}
	public Corso getCorso() {
		return corso;
	}
	public void setAppello(Appello appello) {
		this.appello=appello;
	}
	public void setCorso(Corso corso) {
		this.corso=corso;
	}
	public String toString() {
		return this.appello+" "+this.corso+" ";
	}
	
}
