package Session8.Assignment4;

import java.util.Scanner;

public class busReservation {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the Seat (1-30) number you wish to Reserve: ");
		int x = sc.nextInt();
		
		System.out.print("Please enter your Name: ");
		String y = sc.next();
		
		
		Bus b = new Bus(x);
		Seats s = new Seats(y);

		busThread b1 = new busThread(b);
		b1.start();

		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.display();
		System.out.print(b.count);
	}

}
