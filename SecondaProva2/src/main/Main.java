package main;
import Control.*;
import entity.*;
import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		/*Esempio di utilizzo nel caso di creazione appelli*/
		GestoreAppelli gestoreappelli = new GestoreAppelli();
		String nome_corso="IS";
		int cfu=9;
		String docente="Natella";
		int IDcorso=0;
		Corso c1=new Corso(nome_corso,docente,cfu,IDcorso);
		
		LocalDate data_appello=LocalDate.of(2020, 01, 10);
		String aula="SG1";
		Appello a1=new Appello(data_appello,TipoData.SCRITTO,aula,0);
		AppelloCorso ac1=new AppelloCorso(a1,c1);
		GestoreAppelli.AggiungiAppello(ac1);
		
		nome_corso="SO";
		cfu=9;
		docente="Pietrantuono";
		IDcorso=1;
		Corso c2=new Corso(nome_corso,docente,cfu,IDcorso);
		
		data_appello=LocalDate.of(2020, 01, 10);
		aula="SG2";
		Appello a2=new Appello(data_appello,TipoData.ORALE,aula,0);
		AppelloCorso ac2=new AppelloCorso(a2,c2);
		GestoreAppelli.AggiungiAppello(ac2);
		
		GestoreAppelli.VisualizzaAppelli();
		
		/*Esempio di utilizzo nel caso di creazione corsi*/
		GestoreCorso gestorecorso=new GestoreCorso();
		GestoreCorso.AggiungiCorso(c1);
		GestoreCorso.AggiungiCorso(c2);
		GestoreCorso.VisualizzaCorsi();
		/*Esempio Prenotazioni*/
		GestorePrenotazioni gestore_prenotazioni=new GestorePrenotazioni();
		String nome_studente="Luigi";	
		String cognome_studente="Scognamiglio";
		String Matricola="N46 000000";
		Studente s1=new Studente(nome_studente,cognome_studente,Matricola);
		StudentePrenotato sp1=new StudentePrenotato(s1,a1,c1);
		nome_studente="Pluto";
		cognome_studente="Pippo";
		Matricola="N4600001";
		Studente s2=new Studente(nome_studente,cognome_studente,Matricola);
		StudentePrenotato sp2=new StudentePrenotato(s2,a2,c2);
		GestorePrenotazioni.PrenotaStudente(sp1);
		GestorePrenotazioni.PrenotaStudente(sp2);
		GestorePrenotazioni.VisualizzaPrenotazioni(a1,c1);
	}

	
}
