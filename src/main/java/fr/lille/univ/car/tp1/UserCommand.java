package fr.lille.univ.car.tp1;

public class UserCommand implements Command{
	
	public Answer process(String command, State state) {
		if (state != State.LOG_IN && command.equals("toto")) {
			return new Answer(331);
		}
		return new Answer(430);
	}
}
