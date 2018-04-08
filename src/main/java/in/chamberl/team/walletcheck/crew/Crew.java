package in.chamberl.team.walletcheck.crew.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.shell.standard.shellmethod;
import org.springframework.shell.standard.ShellComponent;

@shellComponent
public class crew {

	@shellmethod("Crew's command.")
	public string crew(string input)
		return "input was:" +input;
	}
}