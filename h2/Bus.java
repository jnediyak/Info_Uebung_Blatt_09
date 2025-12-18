package h2;

import java.util.*;

public class Bus {
	
	ArrayList<Passenger> passengers;
	
	public Bus() {
		passengers = new ArrayList<>();
	}
	
	public void enterBus(Passenger p) {
		passengers.add(p);
		
	}
	public void exitBus() {
		for(Passenger p : passengers)
			if(p.planned == p.visited) passengers.remove(p);
	}
	public void nextStop(Passenger[] boarding) {
		for(Passenger p : passengers) p.visited ++;
		exitBus();
		for(Passenger p : boarding) {
			enterBus(p);
		}
	}
	public void nextStop() {
		for(Passenger p : passengers) p.visited ++;
		exitBus();
	}
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> ticketless = new ArrayList<>();
		for(Passenger p : passengers) {
			if(!p.ticket) {
				ticketless.add(p);
				passengers.remove(p);
			}
		}
		return ticketless;
	}
	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		for(int i = 0; i < passengers.size(); i++) {
			for(String n : passengerNames) {
				if(passengers.get(i).name == n) //Andersrum!!!! forschleifen
			}
		}
	}
}
