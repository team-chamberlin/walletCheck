package in.chamberl.team.walletcheck.crew;

import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class Crew {
	@ShellMethod("Crew's command.")
	public String crew(String input) {
		return "input was:" + input;
	}
}