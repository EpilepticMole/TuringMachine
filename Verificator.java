/**
 * The Verificator class represents a verificator object that checks if a given sequence of numbers satisfies a certain condition that can be coded with the Comparison interface.
 */
public class Verificator {

    public final int[] cards;

    private char op;

    private Comparison left_compare, right_compare;

    /**
     * Constructs a Verificator object with the specified parameters.
     * 
     * @param cards         the criterion cards associated to this verificator
     * @param op            the operator character (≤, <, >, ≥, =)
     * @param left_compare  the left comparison object
     * @param right_compare the right comparison object
     * 
     * In a comparison like △ < 4, the left comparison is the symbol △ and the right comparison is the number 4 with operator <.
     * 
     */
    public Verificator(int[] cards, char op, Comparison left_compare, Comparison right_compare) {
        this.cards = cards;
        this.op = op;
        this.left_compare = left_compare;
        this.right_compare = right_compare;
    }

    /**
     * Verifies if the given sequence satisfies the condition specified by the Verificator object.
     * 
     * @param sequence the sequence of numbers to verify
     * @return true if the sequence satisfies the condition, false otherwise
     */
    public boolean verify(int[] sequence) {

        boolean ret = true;

        if(op == '=') ret = false;

        // The left comparison object is converted to an integer thanks to the getLeftComparison method
        int l = left_compare.getLeftComparison(sequence);

        // The right comparison object is converted to an integer thanks to the getRightComparison method
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