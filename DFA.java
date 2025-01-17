public class DFA extends Automaton {

    private State s; // starting state

    public DFA(int[] input) {
        super(input);
    }

    @Override
    boolean simulateInput() {
        for (int inp : this.Sigma) {
            for (int i = 0; i < 32; i++) {
                int bit = (inp >> i) & 1;

                System.out.print(bit);

                if ((inp >> (i + 1)) == 0) {
                    System.out.println();
                    break;
                }
            }
        }

        return false;
    }

    @Override
    State delta(State currentState, int bit) {
//        return currentState.getOutEdges().get(bit).getState();
        return currentState.next(bit);
    }

}
