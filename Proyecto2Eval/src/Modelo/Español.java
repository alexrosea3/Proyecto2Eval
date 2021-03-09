package modelo;

import java.util.ArrayList;

public class Espa�ol {

	private ArrayList espa�ol;
	private ArrayList dEspa�ol;

	public Espa�ol() {

	}

	private void palabrasEsp() {
		ArrayList<String> espa�ol = new ArrayList();

		espa�ol.add("futbol");
		espa�ol.add("tenis");
		espa�ol.add("baloncesto");

	}

	private void definicionEsp() {
		ArrayList<String> dEspa�ol = new ArrayList();

		dEspa�ol.add("Deporte que se practica entre dos equipos de once jugadores que tratan "
				+ "de introducir un bal�n en la porter�a del contrario impuls�ndolo con los pies, "
				+ "la cabeza o cualquier parte del cuerpo excepto las manos y los brazos.");
		dEspa�ol.add("Deporte que se practica entre dos jugadores o dos parejas en una pista"
				+ " rectangular dividida transversalmente por una red; consiste en impulsar "
				+ "una pelota con una raqueta por encima de la red intentando que bote en "
				+ "el campo contrario y que el adversario no la pueda devolver");
		dEspa�ol.add("Deporte que se practica, en una cancha rectangular, entre dos equipos "
				+ "de cinco jugadores que tratan de introducir el bal�n en la canasta contraria, "
				+ "que se encuentra a una altura de 3,05 m, vali�ndose solo de las manos; "
				+ "los encestes valen uno, dos o tres puntos y gana el equipo que logra m�s puntos "
				+ "en los 40 minutos que dura el encuentro");

	}

	public ArrayList<String> getPalabrasIndice(int indice) {
		return (ArrayList<String>) (espa�ol.get(indice));
	}

	public ArrayList<String> getDefinicionIndice(int indice) {
		return (ArrayList<String>) (dEspa�ol.get(indice));
	}

	public ArrayList getEspa�ol() {
		return espa�ol;
	}

	public void setEspa�ol(ArrayList espa�ol) {
		this.espa�ol = espa�ol;
	}

	public ArrayList getdEspa�ol() {
		return dEspa�ol;
	}

	public void setdEspa�ol(ArrayList dEspa�ol) {
		this.dEspa�ol = dEspa�ol;
	}

}
