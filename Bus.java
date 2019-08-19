package Session8.Assignment4;

class Bus {
	int SeatNum;
	final Seats[] seatsAvailable = new Seats[30];
	int count;

	public Bus(int i) {
		this.SeatNum = i;
	}

	synchronized void reserveSeat(String passengerName) {
		if (count < 30) {
			seatsAvailable[count] = new Seats(passengerName);
			count++;
			System.out.println("Seat Reserved!");
		} else
			System.out.println("No seats available!");
	}

	synchronized void reserveSeat(String passengerName, int amt) {
		for (int i = 0; i < amt; i++) {
			if (count < 30) {
				seatsAvailable[count] = new Seats(passengerName);
				count++;
			} else
				System.out.println("No seats available!");
		}
	}

	void display() {
		int acount = 1;
		for (int i = 0; i < acount; i++)
			System.out.print("Hello " + seatsAvailable[i].passengerName + " your reserved seat number is ");
	}

}



