import java.util.ArrayList;

public class State<String> {
    private String name;
    public ArrayList<StateEdge<String, Integer>> outEdges;

    private class StateEdge<String, Integer> {
        State state;
        Integer value;
    }

}
