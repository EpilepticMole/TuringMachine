public class Verificator {

    public final int[] cards;

    private char op;

    private Comparison left_compare, right_compare;

    public Verificator(int[] cards, char op, Comparison left_compare, Comparison right_compare) {
        this.cards = cards;
        this.op = op;
        this.left_compare = left_compare;
        this.right_compare = right_compare;
    }

    public boolean verify(int[] sequence) {

        boolean ret = true;

        if(op == '=') ret = false;

        int l = left_compare.getLeftComparison(sequence);

        for(int r : right_compare.getRightComparison(sequence)) {
            switch (op) {
                case '≤':
                    if(l > r) ret = false;
                    break;
                case '<':
                    if(l >= r) ret = false;
                    break;
                case '>':
                    if(l <= r) ret = false;
                    break;
                case '≥':
                    if(l < r) ret = false;
                    break;
                
                case '=':
                    if(l == r) ret = true;
                    break;

                default:
                    ret = false;
            }
        }
        return ret;
    }
}