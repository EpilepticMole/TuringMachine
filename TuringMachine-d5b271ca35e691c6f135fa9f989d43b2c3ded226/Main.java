import java.util.ArrayList;

public class Main {

    /**
     * The list of problems.
     */
    private static ArrayList<Problem> problems = new ArrayList<Problem>();

    /**
    * Randomly selects a problem from the database based on the given criteria.
    *
    * @param type           the type of problem
    * @param mode           the mode of problem
    * @param difficulty     the difficulty level of problem
    * @param nb_verifications the number of verifications for the problem
    * @return a randomly selected problem from the database, or null if no matching problem found
    */
    private static Problem selectProblem(String type, String mode, String difficulty, int nb_verifications) {
        ArrayList<Problem> problem_set = new ArrayList<Problem>();
        for (Problem problem : problems) {
            if(problem.type.equals(type) && problem.mode.equals(mode) && problem.difficulty.equals(difficulty) && problem.nb_verifications == nb_verifications) {
                problem_set.add(problem);
            }
        }
        if(problem_set.size() == 0) return null;
        return problem_set.get((int)(Math.random() * problem_set.size()));
    }

    public static void main(String[] args) {

        ProblemDataBase.fillProblems(problems);

        Problem problem = selectProblem("Solo", "Classique", "Standard", 6);
    }
}