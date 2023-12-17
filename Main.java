import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Problem> problems = new ArrayList<Problem>();

        ProblemDataBase.fillProblems(problems);

        for (Problem problem : problems) {
            //System.out.println(problem.verify('A', new int[]{3, 2, 1}));
        }
    }
}