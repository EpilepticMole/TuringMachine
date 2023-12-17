import java.util.ArrayList;

public class ProblemDataBase {
    public static void fillProblems(ArrayList<Problem> problems) {
        /* 
        * SOLO -- CLASSIQUE -- FACILE
        */

        /* 4 VERIFICATEURS */
        // △ = 3
        Criterion A = new Criterion(new int[]{2}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{3}));

        // ◯ is odd
        Criterion B = new Criterion(new int[]{7}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // △ > ◯ and △ > ☐
        Criterion C = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯','☐'}));

        // Only one even number
        Criterion D = new Criterion(new int[]{17}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1}));

        Criterion[] criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Classique", "Facile", 4, criterions, new int[]{3,2,1}));


        /* 
        * SOLO -- CLASSIQUE -- STANDARD
        */



        /* 
        * SOLO -- CLASSIQUE -- DIFFICILE
        */


        /* 
        * SOLO -- EXTREME -- FACILE
        */


        /* 
        * SOLO -- EXTREME -- STANDARD
        */


        /* 
        * SOLO -- EXTREME -- DIFFICILE
        */


        /* 
        * SOLO -- CAUCHEMAR -- FACILE
        */


        /* 
        * SOLO -- CAUCHEMAR -- STANDARD
        */


        /* 
        * SOLO -- CAUCHEMAR -- DIFFICILE
        */
    }
}
