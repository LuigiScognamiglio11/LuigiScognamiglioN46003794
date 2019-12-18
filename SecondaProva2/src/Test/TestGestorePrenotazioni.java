package Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import entity.*;
import Control.*;
public class TestGestorePrenotazioni {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void test1VisualizzaPrenotazioniElencoVuoto() {
		Appello a1 =new Appello(LocalDate.of(2019, Month.AUGUST, 24),TipoData.ORALE,"SG1",01);
		Corso c2=new Corso("IS","Natella",9,02);
		int num;
		num=GestorePrenotazioni.Numero_prenotati( a1, c2);
		GestorePrenotazioni.VisualizzaPrenotazioni(a1, c2);
		assertEquals(0,num);
		
	}
	@Test
	public void test2VisualizzaPrenotazioniCorsoNull() {
		Appello a1 =new Appello(LocalDate.of(2019, Month.AUGUST, 24),TipoData.ORALE,"SG1",01);
		Corso c2=new Corso("IS","Natella",9,02);
		Studente s=new Studente("Luigi","Scognamiglio","N46000000");
		StudentePrenotato sp=new StudentePrenotato(s,a1,c2);
		GestorePrenotazioni.PrenotaStudente(sp);
		int num;
		num=GestorePrenotazioni.Numero_prenotati(a1, null);
		GestorePrenotazioni.VisualizzaPrenotazioni(a1, null);
		assertEquals(0,num);
	}


}
