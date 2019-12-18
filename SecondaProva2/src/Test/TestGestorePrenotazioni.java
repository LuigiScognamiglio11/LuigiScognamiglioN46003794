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
	public void testPrenotaStudente() {
		fail("Not yet implemented");
	}

	@Test
	public void testAnnullaPrenotazione() {
		fail("Not yet implemented");
	}

	@Test
	public void test1VisualizzaPrenotazioniElencoVuoto() {
		Appello a1 =new Appello(LocalDate.of(2019, Month.AUGUST, 24),TipoData.ORALE,"SG1",01);
		Corso c2=new Corso("IS","Natella",9,02);
		int num;
		num=GestorePrenotazioni.Numero_prenotati( a1, c2);
		assertEquals(0,num);
		
	}


}
