/**
 * The Comparison interface represents a comparison object wich can be symbols △, ☐, ◯ or numbers.
 * It provides methods to convert the object to integers given a given sequence.
 */
public interface Comparison {
    /**
     * Returns the left comparison value associated to the given sequence.
     *
     * @param sequence the integer sequence to test
     * @return the left comparison associated value
     */
    public abstract int getLeftComparison(int[] sequence);

    /**
     * Returns the right comparison values associated to the given sequence.
     *
     * @param sequence the integer sequence to test
     * @return the right comparison associated values
     */
    public abstract int[] getRightComparison(int[] sequence);
}

/**
 * This class represents a color comparison implementation (△, ☐, ◯).
 * It implements the Comparison interface.
 */
class ColorComparison implements Comparison {

    private char[] colors;

    /**
     * Constructs a ColorComparison object with the given colors.
     * @param colors an array of characters representing colors (△, ☐, ◯)
     */
    public ColorComparison(char[] colors) {
        this.colors = colors;
    }

    /**
     * Returns the sum of the values of the @param colors in the given sequence.
     * @param sequence an array of integers representing a sequence
     * @return the sum of the left comparison
     */
    public int getLeftComparison(int[] sequence) {
        return sum(sequence);
    }

    /**
     * Returns an array of integers representing the values of the @param colors in the given sequence.
     * @param sequence an array of integers representing a sequence
     * @return an array of integers representing the right comparison
     */
    public int[] getRightComparison(int[] sequence) {
        int[] ret = new int[colors.length];
        for (int i = 0; i < colors.length; i++) {
            switch (colors[i]) {
                case '△':
                    ret[i] = sequence[0];
                    break;
                
                case '☐':
                    ret[i] = sequence[1];
                    break;

                case '◯':
                    ret[i] = sequence[2];
                    break;
            }
        }
        return ret;
    }

    /**
     * Returns the sum of the values of the @param colors in the given sequence.
     * @param sequence an array of integers representing a sequence
     * @return the sum
     */
    private int sum(int[] sequence) {
        int s = 0;
        for(char c : colors) {
            switch (c) {
                case '△':
                    s += sequence[0];
                    break;
                
                case '☐':
                    s += sequence[1];
                    break;

                case '◯':
                    s += sequence[2];
                    break;
            }
        }
        return s;
    }
}

/**
 * This class represents a number comparison (1, 2, 3, 4, 5).
 * It implements the Comparison interface.
 */
class NumberComparison implements Comparison {

    protected int[] numbers;

    private boolean count;

    /**
     * Constructs a NumberComparison object with a number set.
     * The count flag is set to false by default.
     * 
     * @param numbers the numbers
     */
    public NumberComparison(int[] numbers) {
        this.numbers = numbers;
        this.count = false;
    }

    /**
     * Constructs a NumberComparison object with a number set and the count flag.
     * 
     * @param numbers the numbers
     * @param count   the flag indicating whether to count the numbers in @param numbers on the right comparison
     */
    public NumberComparison(int[] numbers, boolean count) {
        this.numbers = numbers;
        this.count = count;
    }

    /**
     * Returns the number of occurences of the @param numbers in the given sequence.
     * 
     * @param sequence the sequence of numbers to test
     * @return the count
     */
    public int getLeftComparison(int[] sequence) {
        return count(sequence);
    }

    /**
     * Returns the sequence without changes if the count flag is false,
     * otherwise returns the number of occurences of the @param numbers in the given sequence.
     * 
     * @param sequence the sequence of numbers to test
     * @return the sequence or count
     */
    public int[] getRightComparison(int[] sequence) {
        if(count) {
            return new int[] {count(sequence)};
        }
        return numbers;
    }

    /**
     * Returns the number of occurences of the @param numbers in the given sequence.
     * 
     * @param sequence the sequence of numbers to test
     * @return the count
     */
    protected int count(int[] sequence) {
        int cnt = 0;
        for(int i : numbers) {
            for(int j : sequence) {
                if(i==j) cnt++;
            }
        }
        return cnt;
    }
}

/**
 * This class extends the NumberComparison class and provides a method to count the number of repetitions in the given sequence (Only the left comparison method is used).
 */
class RepetitionFinder extends NumberComparison {

    public RepetitionFinder() {
        super(null);
    }

    /**
     * Returns the number of repetitions in the given sequence as the left comparison.
     * 
     * @param sequence the sequence of integers
     * @return the number of repetitions
     */
    public int getLeftComparison(int[] sequence) {
        return countRepetitions(sequence);
    }

    /**
     * Counts the number of repetitions in the given sequence.
     * It returns 0 if there are no repetitions, 1 if there is 1 repetition and 3 if there are 2 repetitions.
     * @param sequence the sequence of integers
     * @return the number of repetitions
     */
    private int countRepetitions(int[] sequence) {
        int cnt = 0;
        for (int i = 0; i < sequence.length; i++) {
            for(int j = i+1; j < sequence.length; j++) {
                if(sequence[i] == sequence[j]) cnt++;
            }
        }
        return cnt;
    }
}

/**
 * This class represents a ConsecutiveFinder, which is a subclass of NumberComparison.
 * It is used to find consecutive numbers in a given sequence based on wether we want the numbers in increasing or decreasing order.
 */
class ConsecutiveFinder extends NumberComparison {

    private int growth;

    /**
     * Constructs of the growth value.
     * If the growth value is negative, the sequence is expected to have decreasing consecutive numbers.
     * If the growth value is positive, the sequence is expected to have increasing consecutive numbers.
     * If the growth value is zero, the sequence is expected to have either increasing or decreasing consecutive numbers.
     * @param growth the growth value
     */
    public ConsecutiveFinder(int growth) {
        super(null);
        if(growth < 0) {
            this.growth = -1;
        } else if(growth > 0) {
            this.growth = 1;
        } else {
            this.growth = 0;
        }
    }

    /**
     * The left comparison value represents the number of consecutive numbers in the sequence.
     * If the growth value is zero, the method counts consecutive numbers in both increasing and decreasing directions.
     * @param sequence the sequence of numbers
     * @return the number of consecutive numbers
     */
    public int getLeftComparison(int[] sequence) {
        if(growth == 0) {
            this.growth = -1;
            int dec = countConsecutives(sequence);
            this.growth = 1;
            int gro = countConsecutives(sequence);
            if(dec == 3 || gro == 3) {
                return 3;
            } else if(dec == 2 || gro == 2) {
                return 2;
            } else {
                return 1;
            }
        }
        return countConsecutives(sequence);
    }

    /**
     * Counts the number of consecutive numbers in the given sequence based on the growth value.
     * It returns 1 if there are no consecutive numbers, 2 if there are 2 consecutive numbers and 3 if there are 3 consecutive numbers.
     * @param sequence the sequence of numbers
     * @return the count of consecutive numbers
     */
    private int countConsecutives(int[] sequence) {
        int cnt = 1;
        for (int i = 0; i < sequence.length - 1; i++) {
            if(sequence[i + 1] == sequence[i] + this.growth) {
                cnt++;
            }
        }
        return cnt;
    }
}

/**
 * This class determines wether the given sequence is increasing, decreasing or not monotonous
 * It extends the NumberComparison class.
 */
class GrowthComparison extends NumberComparison {

    public GrowthComparison() {
        super(null);
    }

    /**
     * Determines wether the given sequence is increasing, decreasing or not monotonous
     * Returns -1 for decreasing, 0 for not monotonous, and 1 for increasing.
     *
     * @param sequence the sequence of numbers to compare
     * @return the left comparison result
     */
    public int getLeftComparison(int[] sequence) {
        int verif = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i + 1] > sequence[i]) verif++;
            if (sequence[i + 1] < sequence[i]) verif--;
        }
        return (int) verif / (sequence.length - 1);
    }
}

