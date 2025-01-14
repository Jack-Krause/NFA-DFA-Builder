import java.util.ArrayList;

public abstract class Automaton {

    public Automaton(int[] Sigma) { this.Sigma = Sigma; }

    int[] Sigma;
    ArrayList<State> Q; // All states
    ArrayList<State> F; // Accepting states

    abstract boolean simulateInput();

    /**
     * delta: transition function
     * @return State corresponding to the transition function
     */
    abstract State delta(State currentState, int bit);
    
}
