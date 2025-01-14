public class DFA extends Automaton {

    public DFA(int[] input) {
        super(input);
    }

    @Override
    boolean simulateInput() {
        for (int inp : this.input) {
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

}
