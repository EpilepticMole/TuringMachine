public class Problem {
    public String type,mode,difficulty,nb_verifications;

    private Criterion[] criterions;

    private int[] solution;

    public Problem(String type, String mode, String difficulty, String nb_verifications, Criterion[] criterions, int[] solution) {
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
}