import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WorkWithDate {
	public static void main(String args[]) {
		LocalDate ld = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		LocalTime lt = LocalTime.now();
		//System.out.println(ld);
		//System.out.println(ldt);
		//System.out.println(lt);
		LocalDate ld2 = LocalDate.of(2022, 12, 4);
		LocalTime lt2 = LocalTime.of(8, 0);
		System.out.println(ld2);
		LocalDateTime ldt2= ld2.atTime(lt2);
		System.out.println(ldt2.getDayOfWeek()+" "+ldt2.getDayOfWeek().getValue());
		LocalDate pp = LocalDate.parse("2022-01-02");
		System.out.println(pp.getMonth());
	}
}
