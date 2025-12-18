package h1;

import java.util.*;

public class PrioListe {

	ArrayList<Patient> myList = new ArrayList<>();
	/**
	 * Für addPatient mit neuer Foreach schleife schreiben, vielleicht?
	 * @param p
	 */
	public void addPatient(Patient p) {
		if(myList.isEmpty() || myList.getLast().prio < p.prio) myList.add(p);
		else {
			int i = 0;
			while(myList.get(i).prio < p.prio) {
				i++;
			}
			myList.add(i, p);
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
