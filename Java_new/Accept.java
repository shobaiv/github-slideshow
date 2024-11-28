import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Accept {
	
	int ws_Day;

	public void firstSentences() 
	{
		/* Accept the local date and print */
		LocalDate jdeclDate;
		DateTimeFormatter jdeclFormatter;
		jdeclDate = LocalDate.now();
		jdeclFormatter = DateTimeFormatter.ofPattern("yyyyDDD");
		ws_Day = Integer.valueOf(jdeclDate.format(jdeclFormatter));
		System.out.println("TOTAL DAYS : " + ws_Day);
	}

	public static void main(String[] args) {
		Accept obj = new Accept();
		obj.firstSentences();
	}
}