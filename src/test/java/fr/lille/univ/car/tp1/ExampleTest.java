package fr.lille.univ.car.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void badRequestTest() {
        String cmd = "TTT";
        State state = State.IDLE;
        Answer answer = new Answer(500);
        CommandProcessor commandProcessor = new CommandProcessor();
        assertEquals(answer.status, commandProcessor.process(cmd, state).status);
    }
    
    @Test
    public void goodIdTest() {
    	String cmd = "USER toto";
    	State state = State.IDLE;
    	Answer answer = new Answer(331);
    	CommandProcessor commandProcessor = new CommandProcessor();
        assertEquals(answer.status, commandProcessor.process(cmd, state).status);
    }
    
    @Test
    public void badUserTest() {
    	String cmd= "USER TTT";
    	State state=State.IDLE;
    	Answer answer=new Answer(430);
    	CommandProcessor commandProcessor = new CommandProcessor();
        assertEquals(answer.status, commandProcessor.process(cmd, state).status);
    	
    }
    
    @Test
    public void goodPasswordTest() {
    	String cmd = "PASS pass";
    	State state = State.WAIT_PASS;
    	Answer answer = new Answer(230);
    	CommandProcessor commandProcessor = new CommandProcessor();
        assertEquals(answer.status, commandProcessor.process(cmd, state).status);
    }
    
    @Test
    public void badPasswordTest() {
    	String cmd = "PASS wrong";
    	State state = State.WAIT_PASS;
    	Answer answer = new Answer(430);
    	CommandProcessor commandProcessor = new CommandProcessor();
        assertEquals(answer.status, commandProcessor.process(cmd, state).status);
    }
    
}
