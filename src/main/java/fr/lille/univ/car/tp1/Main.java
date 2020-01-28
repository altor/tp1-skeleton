package fr.lille.univ.car.tp1;

class State{

}

class Answer{
	public String requestAnswer;
	public State state;

	public Answer(String requestAnswer, State state) {
		this.requestAnswer = requestAnswer;
		this.state = state;
	}
}

class CommandProcessor{

	public Answer process(String request, State state) {
		return null;
	}
}
