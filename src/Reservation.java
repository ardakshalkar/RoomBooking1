import java.time.LocalDateTime;

public class Reservation {
	String name;
	LocalDateTime time;
	public Reservation(String name, LocalDateTime time) {
		super();
		this.name = name;
		this.time = time;
	}
	public String toString() {
		return name+" "+time;
	}
}
