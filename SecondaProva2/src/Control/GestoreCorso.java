package Control;
import java.util.ArrayList;


import entity.Corso;

public class GestoreCorso {
	private static ArrayList<Corso> ListaCorsi=new ArrayList<Corso>();
	public GestoreCorso(){
		
	}
	public ArrayList<Corso> getListaCorsi(){
		return ListaCorsi;
	}
	public void setListaCorsi(ArrayList<Corso> ListaCorsi) {
		GestoreCorso.ListaCorsi=ListaCorsi;
	}
	
	public static void AggiungiCorso(Corso c) {
		ListaCorsi.add(c);
	}
	public void RimuoviCorso(Corso c) {
		ListaCorsi.remove(c);
		
	}
	public static void VisualizzaCorsi() {
		for(Corso c:ListaCorsi) {
			System.out.println(c+" \n");
		}
		
	}
}
