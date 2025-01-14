import java.util.ArrayList;

public abstract class Automaton {

    public Automaton(int[] input) { this.input = input; }

    int[] input;
    ArrayList<State> states;

    abstract boolean simulateInput();
    
}
