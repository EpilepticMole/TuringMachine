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
        C = new Criterion(new int[]{25}, '=', new ConsecutiveFinder(0), new NumberComparison(new int[]{1}));

        // ◯ > 3
        D = new Criterion(new int[]{40}, '>', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{3}));

        // ◯ > △
        E = new Criterion(new int[]{43}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△'}));

        // no ones
        F = new Criterion(new int[]{45}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Difficile", 6, criterions, new int[]{2,5,5}));

        /* 6 VERIFICATEURS */
        // △ > 1
        A = new Criterion(new int[]{1}, '>', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{1}));

        // △ + ☐ + ◯ is odd
        B = new Criterion(new int[]{18}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{1,3,5,7,9,11,13,15}));

        // no consecutives values
        C = new Criterion(new int[]{25}, '=', new ConsecutiveFinder(0), new NumberComparison(new int[]{1}));

        // △ < 4
        D = new Criterion(new int[]{27}, '<', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{4}));

        // ◯ = 3
        E = new Criterion(new int[]{29}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{3}));

        // ☐ > ◯
        F = new Criterion(new int[]{44}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Difficile", 6, criterions, new int[]{3,5,3}));

        /* 6 VERIFICATEURS */
        // no pairs of same numbers
        A = new Criterion(new int[]{21}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0,3}));

        // no increasing or decreasing sequence
        B = new Criterion(new int[]{22}, '=', new GrowthComparison(), new NumberComparison(new int[]{0}));

        // ☐ < 4
        C = new Criterion(new int[]{27}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{4}));

        // ☐ is odd
        D = new Criterion(new int[]{33}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{1,3,5}));

        // △ + ☐ + ◯ is multiple of 5
        E = new Criterion(new int[]{36}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{5,10,15}));

        // ◯ > △
        F = new Criterion(new int[]{48}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△'}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Classique", "Difficile", 6, criterions, new int[]{4,1,5}));






        /* 
        * SOLO -- EXTREME -- FACILE
        */

        /* 4 VERIFICATEURS */
        // two even numbers
        A = new Criterion(new int[]{17,11}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{2}));

        // △ is odd
        B = new Criterion(new int[]{5,19}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{1,3,5}));

        // one three
        C = new Criterion(new int[]{20,9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{1}));

        // ☐ < △ and ☐ < ◯
        D = new Criterion(new int[]{1,14}, '<', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'△','◯'}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Extreme", "Facile", 4, criterions, new int[]{3,2,4}));

        

        /* 5 VERIFICATEURS */
        // △ > ☐ and △ > ◯
        A = new Criterion(new int[]{15,9}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'☐','◯'}));

        // no ones
        B = new Criterion(new int[]{8,6}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        // ☐ < 4
        C = new Criterion(new int[]{4,23}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{4}));

        // number of evens < number of odds
        D = new Criterion(new int[]{16,19}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // ☐ > ◯
        E = new Criterion(new int[]{1,13}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Extreme", "Facile", 5, criterions, new int[]{5,3,2}));



        /* 6 VERIFICATEURS */
        // △ is odd
        A = new Criterion(new int[]{5,21}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{1,3,5}));

        // △ < ☐ and △ < ◯
        B = new Criterion(new int[]{12,14}, '<', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'☐','◯'}));

        // ☐ = ◯
        C = new Criterion(new int[]{24,13}, '=', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        // no threes
        D = new Criterion(new int[]{1,9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // ☐ > 3
        E = new Criterion(new int[]{15,3}, '>', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // number of evens > number of odds
        F = new Criterion(new int[]{16,25}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Extreme", "Facile", 6, criterions, new int[]{1,4,4}));






        /* 
        * SOLO -- EXTREME -- STANDARD
        */

        /* 4 VERIFICATEURS */
        // one pair of same numbers
        A = new Criterion(new int[]{3,21}, '=', new RepetitionFinder(), new NumberComparison(new int[]{1}));

        // no ones
        B = new Criterion(new int[]{8,10}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        // △ + ☐ = 6
        C = new Criterion(new int[]{19,22}, '=', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        // △ + ☐ + ◯ is odd
        D = new Criterion(new int[]{18,7}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{1,3,5,7,9,11,13,15}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Extreme", "Standard", 4, criterions, new int[]{3,3,5}));



        /* 5 VERIFICATEURS */
        // ◯ > ☐ and ◯ > △
        A = new Criterion(new int[]{6,15}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'☐','△'}));

        // number of evens < number of odds
        B = new Criterion(new int[]{16,22}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // △ = 1
        C = new Criterion(new int[]{1,13}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{1}));

        // △ + ☐ + ◯ is odd
        D = new Criterion(new int[]{18,23}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{1,3,5,7,9,11,13,15}));

        // no repetitions
        E = new Criterion(new int[]{11,20}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Extreme", "Standard", 5, criterions, new int[]{1,3,5}));



        /* 6 VERIFICATEURS */
        // one three
        A = new Criterion(new int[]{9,8}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{1}));

        // ◯ > △ and ◯ > ☐
        B = new Criterion(new int[]{15,6}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // neither increasing nor decreasing
        C = new Criterion(new int[]{22,18}, '=', new GrowthComparison(), new NumberComparison(new int[]{0}));

        // no pairs of same numbers
        D = new Criterion(new int[]{21,16}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0,3}));

        // △ + ☐ < 6
        E = new Criterion(new int[]{19,7}, '<', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        // △ is even
        F = new Criterion(new int[]{5,2}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{2,4}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Extreme", "Standard", 6, criterions, new int[]{2,1,3}));







        /* 
        * SOLO -- EXTREME -- DIFFICILE
        */

        /* 4 VERIFICATEURS */
        // two consecutives increasing numbers
        A = new Criterion(new int[]{24,11}, '=', new ConsecutiveFinder(1), new NumberComparison(new int[]{2}));

        // ☐ is even
        B = new Criterion(new int[]{25,6}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{2,4}));

        // ☐ < △ and ☐ < ◯
        C = new Criterion(new int[]{2,42}, '<', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'△','◯'}));

        // no threes
        D = new Criterion(new int[]{45,9}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Extreme", "Difficile", 4, criterions, new int[]{5,4,5}));


        /* 5 VERIFICATEURS */
        // ◯ is odd
        A = new Criterion(new int[]{33,19}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // ☐ + ◯ = 6
        B = new Criterion(new int[]{7,38}, '=', new ColorComparison(new char[]{'☐','◯'}), new NumberComparison(new int[]{6}));

        // no increasing consecutive numbers
        C = new Criterion(new int[]{24,14}, '=', new ConsecutiveFinder(1), new NumberComparison(new int[]{1}));

        // △ > ◯
        D = new Criterion(new int[]{48,3}, '>', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'◯'}));

        // △ = 4
        E = new Criterion(new int[]{30,12}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{4}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Extreme", "Difficile", 5, criterions, new int[]{4,3,3}));


        /* 6 VERIFICATEURS */
        // two even numbers
        A = new Criterion(new int[]{17,10}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{2}));

        // △ > 3
        B = new Criterion(new int[]{2,25}, '>', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{3}));

        // ◯ = 4
        C = new Criterion(new int[]{30,16}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{4}));

        // no increasing consecutive numbers
        D = new Criterion(new int[]{24,20}, '=', new ConsecutiveFinder(1), new NumberComparison(new int[]{1}));

        // ☐ < 4
        E = new Criterion(new int[]{19,27}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{4}));

        // no ones
        F = new Criterion(new int[]{3,45}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Extreme", "Difficile", 6, criterions, new int[]{5,2,4}));







        /* 
        * SOLO -- CAUCHEMAR -- FACILE
        */

        /* 4 VERIFICATEURS */
        // ☐ < 3
        A = new Criterion(new int[]{3,6,10,16}, '<', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // ☐ is odd
        B = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{1,3,5}));

        // number of evens > number of odds
        C = new Criterion(new int[]{}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // no fours
        D = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{4}), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Cauchemar", "Facile", 4, criterions, new int[]{2,1,2}));


        /* 5 VERIFICATEURS */
        // △ < ☐ and △ < ◯
        A = new Criterion(new int[]{4,9,13,14,17}, '<', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'☐','◯'}));

        // two even numbers
        B = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{2}));

        // ☐ = 4
        C = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{4}));

        // no threes
        D = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));

        // ☐ = ◯
        E = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Cauchemar", "Facile", 5, criterions, new int[]{1,4,4}));


        /* 6 VERIFICATEURS */
        // △ > 3
        A = new Criterion(new int[]{2,7,9,11,14,16}, '>', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{3}));

        // ◯ is odd
        B = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // △ = ☐
        C = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△'}), new ColorComparison(new char[]{'☐'}));

        // ◯ < △ and ◯ < ☐
        D = new Criterion(new int[]{}, '<', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // number of evens > number of odds
        E = new Criterion(new int[]{}, '>', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // no threes
        F = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{0}));








        /* 
        * SOLO -- CAUCHEMAR -- STANDARD
        */

        /* 4 VERIFICATEURS */
        // △ > 1
        A = new Criterion(new int[]{1,9,18,22}, '>', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{1}));

        // △ + ☐ + ◯ is odd
        B = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{1,3,5,7,9,11,13,15}));

        // increasing sequence
        C = new Criterion(new int[]{}, '=', new GrowthComparison(), new NumberComparison(new int[]{1}));

        // one three
        D = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{3}), new NumberComparison(new int[]{1}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Cauchemar", "Standard", 4, criterions, new int[]{2,3,4}));


        /* 5 VERIFICATEURS */
        // ◯ is even
        A = new Criterion(new int[]{3,7,8,13,19}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{2,4}));

        // ☐ > ◯
        B = new Criterion(new int[]{}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'◯'}));

        // ☐ > 3
        C = new Criterion(new int[]{}, '>', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{3}));

        // no ones
        D = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{1}), new NumberComparison(new int[]{0}));

        // △ + ☐ = 6
        E = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Cauchemar", "Standard", 5, criterions, new int[]{2,4,2}));


        /* 6 VERIFICATEURS */
        // △ + ☐ + ◯ is even
        A = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{2,4,6,8,10,12,14}));

        // one four
        B = new Criterion(new int[]{}, '=', new NumberComparison(new int[]{4}), new NumberComparison(new int[]{1}));

        // ◯ > △ and ◯ > ☐
        C = new Criterion(new int[]{}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // △ is even
        D = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{2,4}));

        // △ + ☐ < 6
        E = new Criterion(new int[]{}, '<', new ColorComparison(new char[]{'△','☐'}), new NumberComparison(new int[]{6}));

        // no repetitions
        F = new Criterion(new int[]{}, '=', new RepetitionFinder(), new NumberComparison(new int[]{0}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Cauchemar", "Standard", 6, criterions, new int[]{4,1,5}));







        /* 
        * SOLO -- CAUCHEMAR -- DIFFICILE
        */

        /* 4 VERIFICATEURS */
        // number of evens < number of odds
        A = new Criterion(new int[]{16,21,40,42}, '<', new NumberComparison(new int[]{2,4}), new NumberComparison(new int[]{1,3,5}, true));

        // ◯ = 3
        B = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{3}));

        // ◯ > △ and ◯ > ☐
        C = new Criterion(new int[]{}, '>', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'△','☐'}));

        // one pair of same numbers
        D = new Criterion(new int[]{}, '=', new RepetitionFinder(), new NumberComparison(new int[]{1}));

        criterions = new Criterion[]{A, B, C, D};
        problems.add(new Problem("Solo", "Cauchemar", "Difficile", 4, criterions, new int[]{1,1,3}));


        /* 5 VERIFICATEURS */
        // ☐ + ◯ = 4
        A = new Criterion(new int[]{18,24,26,33,37}, '=', new ColorComparison(new char[]{'☐','◯'}), new NumberComparison(new int[]{4}));

        // ◯ < 3
        B = new Criterion(new int[]{}, '<', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{3}));

        // no increasing consecutive numbers
        C = new Criterion(new int[]{}, '=', new ConsecutiveFinder(1), new NumberComparison(new int[]{1}));

        // △ + ☐ + ◯ is even
        D = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{2,4,6,8,10,12,14}));

        // ☐ is odd
        E = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'☐'}), new NumberComparison(new int[]{1,3,5}));

        criterions = new Criterion[]{A, B, C, D, E};
        problems.add(new Problem("Solo", "Cauchemar", "Difficile", 5, criterions, new int[]{4,3,1}));


        /* 6 VERIFICATEURS */
        // ◯ <= ☐ and ◯ <= △
        A = new Criterion(new int[]{}, '≤', new ColorComparison(new char[]{'◯'}), new ColorComparison(new char[]{'☐','△'}));

        // △ + ☐ + ◯ > 6
        B = new Criterion(new int[]{}, '>', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{6}));

        // △ < 4
        C = new Criterion(new int[]{}, '<', new ColorComparison(new char[]{'△'}), new NumberComparison(new int[]{4}));

        // △ + ☐ + ◯ is multiple of 3
        D = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'△','☐','◯'}), new NumberComparison(new int[]{3,6,9,12,15}));

        // ◯ is odd
        E = new Criterion(new int[]{}, '=', new ColorComparison(new char[]{'◯'}), new NumberComparison(new int[]{1,3,5}));

        // ☐ > △
        F = new Criterion(new int[]{}, '>', new ColorComparison(new char[]{'☐'}), new ColorComparison(new char[]{'△'}));

        criterions = new Criterion[]{A, B, C, D, E, F};
        problems.add(new Problem("Solo", "Cauchemar", "Difficile", 6, criterions, new int[]{3,5,1}));
    }
}
