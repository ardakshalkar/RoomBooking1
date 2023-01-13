import java.time.LocalDateTime;
import java.util.ArrayList;

public class Room {
	String title;
	ArrayList<Reservation> reservations = new ArrayList<Reservation>();
	/*boolean reservations[][] = new boolean[5][9];*/
	Room(){
		
		/*for ( int i=0;i<5;i++) {
			reservations[i] = new boolean[9];
			for (int j=0;j<9;j++) {
				reservations[i][j] = false;
			}
		}*/
	}
	public boolean checkIfFree(LocalDateTime dateTime) {
		for (Reservation reservation: reservations) {
			if (reservation.time.equals(dateTime)) {
				return false;
			}
		}
		return true;
	}
	public boolean reserve(LocalDateTime dateTime) {
		if (!checkIfFree(dateTime))
			return false;
		Reservation r = new Reservation("SAMPLE",dateTime);
		reservations.add(r);
		return true;
	}
	public String toString() {
		return reservations.toString();
	}
	
}
