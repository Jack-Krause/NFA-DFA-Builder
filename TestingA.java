public class TestingA {

    public static void main(String[] args) {
        int[] testInput = { 0b10001, 0b10, 0b0001 };

        Automaton a = new DFA(testInput);
        a.simulateInput();


    }
}
