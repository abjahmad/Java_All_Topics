package synchronization;


/*
 * Synchronization in java is the process that allow only one thread at a particular time complete a given task 
 * 
 * Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
 * 
 * Java Synchronization is better option where we want to allow only one thread to access the shared resource.
 * 
 * The synchronization is mainly used to

	To prevent thread interference.
	To prevent consistency problem.


*/

class BookTheaterSeat {
	 int total_seats = 10;

	 synchronized	void  bookSeat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + " seats booked successfully");
			total_seats = total_seats - seats;
			System.out.println(" Seats left : " + total_seats);
		} else {
			System.out.println("Sorry seats cannot be booked");
			System.out.println("Seats : " + total_seats);
		}
	}
}

public class MovieBookApp extends Thread {
	static BookTheaterSeat b;
	int seats;

	public void run() {
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		b = new BookTheaterSeat();

		MovieBookApp movieBookApp = new MovieBookApp();
		movieBookApp.seats = 1;
		movieBookApp.start();

		MovieBookApp movieBookApp2 = new MovieBookApp();
		movieBookApp2.seats = 2;
		movieBookApp2.start();
	}
}
