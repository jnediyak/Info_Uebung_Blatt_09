package h1;

import java.util.*;

public class PrioListe {

	ArrayList<Patient> myList = new ArrayList<>();
	/**
	 * Für addPatient mit neuer Foreach schleife schreiben, vielleicht?
	 * @param p
	 */
	public void addPatient(Patient p) {
		for(int i = 0; i < myList.size();i++) {
			if(myList.get(i) != null) {
				if(myList.get(i).prio > p.prio) {
					myList.add(i, p);
					break;
				}
			} else {
				myList.add(p);
				break;
			}
		}
	}
	
	public Patient getNextPatient() {
		Patient n = myList.getFirst();
		myList.remove(n);
		return n;
	}
	
	public int getPosition(Patient p) {
		return myList.indexOf(p);
	}
	
	
}
