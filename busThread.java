package Session8.Assignment4;

class busThread extends Thread {
	Bus b1;

	public busThread(Bus b) {
		this.b1 = b;
	}

	@Override
	public void run() {
		b1.reserveSeat("Rahib", 9);
	}
}