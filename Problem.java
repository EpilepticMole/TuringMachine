public class Problem {
    public final String type,mode,difficulty;
    public final int nb_verifications;

    public final Verificator[] verificators;

    private int[] solution;

    public Problem(String type, String mode, String difficulty, int nb_verifications, Verificator[] verificators, int[] solution) {
        this.type = type;
        this.mode = mode;
        this.difficulty = difficulty;
        this.nb_verifications = nb_verifications;
        this.verificators = verificators;
        this.solution = solution;
    }

    public boolean check(int[] sequence) {
        if(sequence.length != solution.length) return false;
        
        boolean ret = true;
        for (int i = 0; i < sequence.length; i++) {
            if(sequence[i] != solution[i]) ret = false;
        }
        return ret;
    }

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