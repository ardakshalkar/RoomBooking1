import java.time.LocalDateTime;

public class Main {
	public static void main(String args[]) {
		Room room = new Room();
		//int hour = 14;
		//int day = 4;
		LocalDateTime time1 = LocalDateTime.parse("2023-01-13T12:00:00");
		System.out.println(  bookRoom(room,time1));
		LocalDateTime time2 = LocalDateTime.parse("2023-01-13T12:30:00");
		System.out.println(  bookRoom(room,time2));
		System.out.println(room);
	}
	public static boolean bookRoom(Room r,LocalDateTime dateTime) {
		dateTime = dateTime.withMinute(0);
		if (r.reserve(dateTime)) {
			
			return true;
		}
		else {
			System.out.println("It is booked already");
			return false;
		}
		/*if (!r.reservations[day][hour-9]){
			r.reservations[day][hour-9] =true;
			return true;
		}
		else {
			System.err.println("It is booked already");
			return false;
		}*/
			
	}
}
