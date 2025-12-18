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

	private void exitBus() {
		for (int i = passengers.size() - 1; i >= 0; i--) {
			if (passengers.get(i).planned == passengers.get(i).visited)
				passengers.remove(i);
		}
	}

	public void nextStop(Passenger[] boarding) {
		for (Passenger p : passengers)
			p.visited++;
		exitBus();
		for (Passenger p : boarding) {
			enterBus(p);
		}
	}

	public void nextStop() {
		for (Passenger p : passengers)
			p.visited++;
		exitBus();
	}

	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> ticketless = new ArrayList<>();
		for (Passenger p : passengers) {
			if (!p.ticket)
				ticketless.add(p);
		}
		for (Passenger p : ticketless)
			passengers.remove(p);
		return ticketless;
	}

	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		for (int i = 0; i < passengers.size(); i++) {
			for(String name : passengerNames) {
				if(passengers.get(i).name == name) {
					otherBus.enterBus(passengers.get(i));
					passengers.remove(i);
					i--;
				}
			}
		}
	}
}
