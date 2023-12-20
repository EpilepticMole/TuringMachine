public class Problem {
<<<<<<< HEAD
    public String type,mode,difficulty;
    public final int nb_verifications;
    public final Verificator[] verificators;
    private int[] solution;

=======
    public final String type,mode,difficulty;
    public final int nb_verifications;

    public final Verificator[] verificators;

    private int[] solution;

    /**
     * Represents a problem with a specific type, mode, difficulty, verificators, and his solution.
     */
>>>>>>> d5b271ca35e691c6f135fa9f989d43b2c3ded226
    public Problem(String type, String mode, String difficulty, int nb_verifications, Verificator[] verificators, int[] solution) {
        this.type = type;
        this.mode = mode;
        this.difficulty = difficulty;
        this.nb_verifications = nb_verifications;
        this.verificators = verificators;
        this.solution = solution;
    }

<<<<<<< HEAD
    public boolean check(int[] sequence) {  
=======
    /**
     * Checks if the given sequence matches the solution of the problem.
     * 
     * @param sequence the sequence to be checked
     * @return true if the sequence matches the solution, false otherwise
     */
    public boolean check(int[] sequence) {
>>>>>>> d5b271ca35e691c6f135fa9f989d43b2c3ded226
        if(sequence.length != solution.length) return false;
        
        boolean ret = true;
        for (int i = 0; i < sequence.length; i++) {
            if(sequence[i] != solution[i]) ret = false;
        }
        return ret;
    }
<<<<<<< HEAD
=======

    /**
     * Verifies the given sequence using the specified verificator.
     *
     * @param verificator the character representing the verificator to use
     * @param sequence the sequence to be verified
     * @return true if the sequence is verified successfully, false otherwise
     */
>>>>>>> d5b271ca35e691c6f135fa9f989d43b2c3ded226
    public boolean verify(char verificator, int[] sequence) {
        switch(verificator) {
            case 'A':
                if(verificators.length >= 1) {
                    return verificators[0].verify(sequence);
                }
                break;
            case 'B':
                if(verificators.length >= 2) {
                    return verificators[1].verify(sequence);
                }
                break;
            case 'C':
                if(verificators.length >= 3) {
                    return verificators[2].verify(sequence);
                }
                break;
            case 'D':
                if(verificators.length >= 4) {
                    return verificators[3].verify(sequence);
                }
                break;
            case 'E':
                if(verificators.length >= 5) {
                    return verificators[4].verify(sequence);
                }
                break;
            case 'F':
                if(verificators.length >= 6) {
                    return verificators[5].verify(sequence);
                }
                break;
        }
        return false;
    }
}