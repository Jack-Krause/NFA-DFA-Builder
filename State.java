import java.util.ArrayList;

public class State {
    private String name;
    public ArrayList<StateEdge> outEdges;

    public State(String name) {
        this.name = name;
        this.outEdges = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        State state = (State) obj;
        return name.equals(state.name);
    }

    public State next(int bit) {
        return this.outEdges.get(bit).getState();
    }


    public static class StateEdge {
        private final State state;
        private final Integer value;

        public StateEdge(State state, Integer value) {
            this.state = state;
            this.value = value;
        }

        public State getState() { return this.state; }
    }

    public String getName() { return this.name; }

    public ArrayList<StateEdge> getOutEdges() { return this.outEdges; }


}
