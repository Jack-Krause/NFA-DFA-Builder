import java.util.ArrayList;

public class State {
    private String name;
    public ArrayList<StateEdge> outEdges;

    public State(String name) {
        this.name = name;
        this.outEdges = new ArrayList<>();
    }

    public static class StateEdge {
        private final State state;
        private final Integer value;

        public StateEdge(State state, Integer value) {
            this.state = state;
            this.value = value;
        }
    }

    public String getName() { return this.name; }

    public ArrayList<StateEdge> getOutEdges() { return this.outEdges; }


}
