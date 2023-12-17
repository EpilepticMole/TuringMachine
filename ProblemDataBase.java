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

        /* 4 VERIFICATEURS */
        // ☐ is odd
        A = new Criterion(new int[]{6}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{1,3,5}));

        // no threes
        B = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // ◯ > △ and ◯ > ☐
        C = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // Two even numbers
        D = new Criterion(new int[]{17}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{2}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Classique", "Facile", 4, criterions, new int[]{2,1,4}));



        /* 5 VERIFICATEURS */
        // △ = 3
        A = new Criterion(new int[]{2}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{3}));

        // no ones
        B = new Criterion(new int[]{8}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        // ◯ > △
        C = new Criterion(new int[]{12}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△'}));

        // ☐ < ◯ and ☐ < △
        D = new Criterion(new int[]{14}, '<', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯','△'}));

        // number of evens < number of odds
        Criterion E = new Criterion(new int[]{16}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Classique", "Facile", 5, criterions, new int[]{3,2,5}));

        /* 5 VERIFICATEURS */
        // ☐ is even
        A = new Criterion(new int[]{6}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{2,4}));

        // no ones
        B = new Criterion(new int[]{8}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        // ☐ > ◯
        C = new Criterion(new int[]{13}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        // △ > ◯ and △ > ☐
        D = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯','☐'}));

        // one even number
        E = new Criterion(new int[]{17}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Classique", "Facile", 5, criterions, new int[]{5,4,3}));



        /* 6 VERIFICATEURS */
        // ☐ < 3
        A = new Criterion(new int[]{3}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // ◯ is odd
        B = new Criterion(new int[]{7}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // no threes
        C = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // △ = ☐
        D = new Criterion(new int[]{11}, '=', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'☐'}));

        // ◯ > △ and ◯ > ☐
        E = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // number of evens > number of odds
        Criterion F = new Criterion(new int[]{16}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Facile", 6, criterions, new int[]{2,2,5}));

        /* 6 VERIFICATEURS */
        // ☐ < 3
        A = new Criterion(new int[]{3}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // △ is odd
        B = new Criterion(new int[]{5}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{1,3,5}));

        // no threes
        C = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // ☐ = ◯
        D = new Criterion(new int[]{13}, '=', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        // △ > ◯ and △ > ☐
        E = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯','☐'}));

        // number of evens > number of odds
        F = new Criterion(new int[]{16}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Facile", 6, criterions, new int[]{5,2,2}));

        /* 6 VERIFICATEURS */
        // ☐ > 3
        A = new Criterion(new int[]{3}, '>', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // ◯ is odd
        B = new Criterion(new int[]{7}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // no threes
        C = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // △ = ☐
        D = new Criterion(new int[]{11}, '=', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'☐'}));

        // ◯ < △ and ◯ < ☐
        E = new Criterion(new int[]{14}, '<', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // number of evens > number of odds
        F = new Criterion(new int[]{16}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Facile", 6, criterions, new int[]{4,4,1}));





        /* 
        * SOLO -- CLASSIQUE -- STANDARD
        */

        /* 4 VERIFICATEURS */
        // △ = ◯
        A = new Criterion(new int[]{12}, '=', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯'}));

        // ☐ > △ and ☐ > ◯
        B = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'△','◯'}));

        // two evens
        C = new Criterion(new int[]{17}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{2}));

        // △ + ☐ < 6
        D = new Criterion(new int[]{19}, '<', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Classique", "Standard", 4, criterions, new int[]{2,3,2}));

        /* 4 VERIFICATEURS */
        // ☐ < 4
        A = new Criterion(new int[]{4}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{4}));

        // no threes
        B = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // number of evens < number of odds
        C = new Criterion(new int[]{16}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // triplet of same numbers
        D = new Criterion(new int[]{20}, '=', new RepetitionFinder(), new NumberComparison(new int[]{3}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Classique", "Standard", 4, criterions, new int[]{1,1,1}));



        /* 5 VERIFICATEURS */
        // one four
        A = new Criterion(new int[]{10}, '=', new NumberComparison(new int[]{4}), new NumberComparison(new int[]{1}));

        // △ > ◯
        B = new Criterion(new int[]{12}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯'}));

        // △ + ☐ + ◯ is even
        C = new Criterion(new int[]{18}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{2,4,6,8,10,12,14}));

        // △ + ☐ < 6
        D = new Criterion(new int[]{19}, '<', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        // no pairs of same numbers
        E = new Criterion(new int[]{21}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0,3}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Classique", "Standard", 5, criterions, new int[]{4,1,3}));

        /* 5 VERIFICATEURS */
        // △ = 3
        A = new Criterion(new int[]{2}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{3}));

        // ◯ > △
        B = new Criterion(new int[]{12}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△'}));

        // one even number
        C = new Criterion(new int[]{17}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1}));

        // △ + ☐ > 6
        D = new Criterion(new int[]{19}, '>', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        // neither increasing nor decreasing
        E = new Criterion(new int[]{22}, '=', new GrowthComparison(), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Classique", "Standard", 5, criterions, new int[]{3,5,4}));



        /* 6 VERIFICATEURS */
        // △ < 3
        A = new Criterion(new int[]{2}, '<', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{3}));

        // ◯ is odd
        B = new Criterion(new int[]{7}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // no threes
        C = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // ◯ > △ and ◯ > ☐
        D = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // one even number
        E = new Criterion(new int[]{17}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1}));

        // neither increasing nor decreasing
        F = new Criterion(new int[]{22}, '=', new GrowthComparison(), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Standard", 6, criterions, new int[]{2,1,5}));

        /* 6 VERIFICATEURS */
        // ◯ is even
        A = new Criterion(new int[]{7}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{2,4}));

        // no ones
        B = new Criterion(new int[]{8}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        // △ > ◯ and △ > ☐
        C = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯','☐'}));

        // number of evens > number of odds
        D = new Criterion(new int[]{16}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // no pairs of same numbers
        E = new Criterion(new int[]{21}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0,3}));

        // neither increasing nor decreasing
        F = new Criterion(new int[]{22}, '=', new GrowthComparison(), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Standard", 6, criterions, new int[]{5,2,4}));

        /* 6 VERIFICATEURS */
        // ☐ is odd
        A = new Criterion(new int[]{6}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{1,3,5}));

        // one three
        B = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{1}));

        // ◯ > △ and ◯ > ☐
        C = new Criterion(new int[]{15}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // △ + ☐ + ◯ is odd
        D = new Criterion(new int[]{18}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{1,3,5,7,9,11,13,15}));

        // no repetitions
        E = new Criterion(new int[]{20}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0}));

        // neither increasing nor decreasing
        F = new Criterion(new int[]{22}, '=', new GrowthComparison(), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Standard", 6, criterions, new int[]{3,1,5}));


        /* 
        * SOLO -- CLASSIQUE -- DIFFICILE
        */

        /* 4 VERIFICATEURS */
        // ☐ is odd
        A = new Criterion(new int[]{6}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{1,3,5}));

        // ◯ < 3
        B = new Criterion(new int[]{26}, '<', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{3}));

        // ☐ > 3
        C = new Criterion(new int[]{32}, '>', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // △ < ◯ and △ < ☐
        D = new Criterion(new int[]{42}, '<', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯','☐'}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Classique", "Difficile", 4, criterions, new int[]{1,5,2}));

        /* 4 VERIFICATEURS */
        // two threes
        A = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{2}));

        // ◯ > 1
        B = new Criterion(new int[]{39}, '>', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1}));

        // ☐ > ◯
        C = new Criterion(new int[]{44}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        // △ > ◯
        D = new Criterion(new int[]{48}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯'}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Classique", "Difficile", 4, criterions, new int[]{3,3,2}));



        /* 5 VERIFICATEURS */
        // number of evens < number of odds
        A = new Criterion(new int[]{16}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // 2 consecutive increasing numbers
        B = new Criterion(new int[]{24}, '=', new ConsecutiveFinder(1), new NumberComparison(new int[]{2}));

        // △ <= ◯ and △ <= ☐
        C = new Criterion(new int[]{34}, '≤', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯','☐'}));

        // ◯ > 1
        D = new Criterion(new int[]{39}, '>', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1}));

        // ☐ > ◯
        E = new Criterion(new int[]{48}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Classique", "Difficile", 5, criterions, new int[]{3,4,3}));

        /* 5 VERIFICATEURS */
        // one three
        A = new Criterion(new int[]{9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{1}));

        // ☐ < △ and ☐ < ◯
        B = new Criterion(new int[]{14}, '<', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'△','◯'}));

        // △ + ☐ + ◯ > 6
        C = new Criterion(new int[]{23}, '>', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{6}));

        // 2 consecutive increasing numbers
        D = new Criterion(new int[]{24}, '=', new ConsecutiveFinder(1), new NumberComparison(new int[]{2}));

        // no fours
        E = new Criterion(new int[]{47}, '=', new NumberComparison(new int[]{4}), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Classique", "Difficile", 5, criterions, new int[]{5,2,3}));



        /* 6 VERIFICATEURS */
        // number of evens < number of odds
        A = new Criterion(new int[]{16}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // △ + ☐ + ◯ is even
        B = new Criterion(new int[]{18}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{2,4,6,8,10,12,14}));

        // no consecutives values
        C = new Criterion(new int[]{25}, '=', new ConsecutiveFinder(0), new NumberComparison(new int[]{0}));





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
