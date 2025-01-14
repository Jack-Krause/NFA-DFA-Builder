public class DFA extends Automaton {


    @Override
    boolean simulateInput() {
        for (int inp : this.input) {
            for (int i = 0; i < 32; i++) {
                int bit = (inp >> i) & 1;
                
                System.out.println(bit);

                if ((inp >> (i + 1)) == 0) break;
            }
        }

        return false;
    }

}
