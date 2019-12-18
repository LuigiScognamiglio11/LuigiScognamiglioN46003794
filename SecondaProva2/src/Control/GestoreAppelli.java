package Control;

import java.util.ArrayList;

import entity.AppelloCorso;


public class GestoreAppelli {
	static ArrayList<AppelloCorso> lista_appelli;
	public GestoreAppelli() {
			
			lista_appelli = new ArrayList<AppelloCorso>();
		}
	public ArrayList<AppelloCorso> getListaAppelli(){
		return lista_appelli;
	}
	public void setListaCorsi(ArrayList<AppelloCorso> lista_appelli) {
		GestoreAppelli.lista_appelli=lista_appelli;
	}
	public static void AggiungiAppello(AppelloCorso a) {
		lista_appelli.add(a);
	}
	public void RimuoviAppello(AppelloCorso a) {
		lista_appelli.remove(a);
	}
	public static void VisualizzaAppelli() {
		for(AppelloCorso a:lista_appelli) {
			System.out.println(a+"\n");
			
		}
	}
	
	
}
