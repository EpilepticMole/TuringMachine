public class Problem {
    public final String type,mode,difficulty;
    public final int nb_verifications;

    private Criterion[] criterions;

    private int[] solution;

    public Problem(String type, String mode, String difficulty, int nb_verifications, Criterion[] criterions, int[] solution) {
        this.type = type;
        this.mode = mode;
        this.difficulty = difficulty;
        this.nb_verifications = nb_verifications;
        this.criterions = criterions;
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
                if(criterions.length >= 1) {
                    return criterions[0].verify(sequence);
                }
                break;
            case 'B':
                if(criterions.length >= 2) {
                    return criterions[1].verify(sequence);
                }
                break;
            case 'C':
                if(criterions.length >= 3) {
                    return criterions[2].verify(sequence);
                }
                break;
            case 'D':
                if(criterions.length >= 4) {
                    return criterions[3].verify(sequence);
                }
                break;
            case 'E':
                if(criterions.length >= 5) {
                    return criterions[4].verify(sequence);
                }
                break;
            case 'F':
                if(criterions.length >= 6) {
                    return criterions[5].verify(sequence);
                }
                break;
        }
        return false;
    }
}