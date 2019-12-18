package Control;
import entity.StudentePrenotato;
import java.util.ArrayList;
import entity.Corso;
import entity.Appello;
public class GestorePrenotazioni {
	private static ArrayList<StudentePrenotato> lista_studenti=new ArrayList<StudentePrenotato>();
	public static void PrenotaStudente(StudentePrenotato s) {
		lista_studenti.add(s);
	}
	public void AnnullaPrenotazione(StudentePrenotato s) {
		lista_studenti.remove(s);
	}
	public static void VisualizzaPrenotazioni(Appello a, Corso c ){
		for(StudentePrenotato s: lista_studenti) {
			if(s.getAppello().equals(a)&&s.getCorso().equals(c)){
				System.out.println(s+" \n");
			}
		}
		
	}
	public static int Numero_prenotati(Appello a,Corso c) {
		ArrayList<StudentePrenotato> lista_prenotati=new ArrayList<StudentePrenotato>();
		for(StudentePrenotato s: lista_studenti) {
			if(s.getAppello().equals(a)&&s.getCorso().equals(c)){
				lista_prenotati.add(s);
			}
		}
		return lista_prenotati.size();
	}
}
