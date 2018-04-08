package in.chamberl.team.walletcheck.crew;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;
import java.io.UnsupportedEncodingException;

@ShellComponent
public class Crew {
	@ShellMethod("Crew's command.")
	public int crew(String input) throws UnsupportedEncodingException {
		byte[] crewsstringsize = input.getBytes("US-ASCII");
		return crewsstringsize.length;
	}
@ShellMethod("Crew's command.")
	public byte[] kyle(String input) throws UnsupportedEncodingException {
		byte[] crewsstringsize = input.getBytes("US-ASCII");
		return crewsstringsize;
	}
}