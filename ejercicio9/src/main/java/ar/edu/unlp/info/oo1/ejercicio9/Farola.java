package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	
	private List<Farola> neighbors;
	private boolean isOn;
	private boolean isOff;
	public Farola () {
		isOn = false;
		isOff = true;
		neighbors = new ArrayList<Farola>();
	}
	public void pairWithNeighbor( Farola otraFarola) {
		this.neighbors.add(otraFarola);
		otraFarola.neighbors.add(this);
	}

	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors(){
		return neighbors;
	}


	public void turnOn() {
		if(!isOn) {
			isOn = true;
			isOff =false;
			for(Farola farola: neighbors) {
				farola.turnOn();
			}
		}
	}

	
	public void turnOff() {
		if(!isOff) {
			isOff = true;
			isOn = false;
			for(Farola farola: neighbors) {
				farola.turnOff();
			}
		}
	}

	public boolean isOn() {
		return isOn;
	}

	public boolean isOff() {
		return isOff;
	}

}
