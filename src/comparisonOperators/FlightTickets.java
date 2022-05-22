package comparisonOperators;

public class FlightTickets {

	public static void main(String[] args) {

		int totalSeats= 525;
		int seatsBooked= 500;
		int seatsNeeded= 30;
		
		if((totalSeats-seatsBooked)>seatsNeeded ) {
			
			System.out.println("Booking accepted");
		
		}else {
			
			System.out.println("Not enough seats");
			}
		
		}

	}

