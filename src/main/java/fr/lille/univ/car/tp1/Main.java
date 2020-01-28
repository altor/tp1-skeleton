package fr.lille.univ.car.tp1;

import java.util.Map;

enum State{
	IDLE, WAIT_PASS, LOG_IN;
}

class Answer{
	public int status;

	public Answer(int status) {
		this.status = status;
	}
}

class CommandProcessor{
	
	private Map<String, Command> commands;
	public CommandProcessor() {
		commands = new HashMap<>();
		commands.put("USER", new UserCommand());
		
	}
	
	
	public Answer process(String request, State state) {
		String[] parsed = request.split(" ");
		commands.get(parsed[0]).process(parsed[1], state);
	}
}
