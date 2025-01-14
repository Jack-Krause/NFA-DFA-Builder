import java.util.ArrayList;

public abstract class Automaton {

    int[] input;
    ArrayList<State> states;

    abstract boolean simulateInput();
    
}
