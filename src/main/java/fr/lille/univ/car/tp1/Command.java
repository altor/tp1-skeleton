package fr.lille.univ.car.tp1;

public interface Command {
	Answer process(String command, State state);
}
