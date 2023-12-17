public interface Comparison {
    public abstract int getLeftComparison(int[] sequence);
    public abstract int[] getRightComparison(int[] sequence);
}

class ColorComparison implements Comparison {

    private char[] colors;

    public ColorComparison(char[] colors) {
        this.colors = colors;
    }

    public int getLeftComparison(int[] sequence) {
        return sum(sequence);
    }

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

class NumberComparison implements Comparison {

    protected int[] numbers;

    private boolean count;

    public NumberComparison(int[] numbers) {
        this.numbers = numbers;
        this.count = false;
    }

    public NumberComparison(int[] numbers, boolean count) {
        this.numbers = numbers;
        this.count = count;
    }

    public int getLeftComparison(int[] sequence) {
        return count(sequence);
    }

    public int[] getRightComparison(int[] sequence) {
        if(count) {
            return new int[] {count(sequence)};
        }
        return numbers;
    }

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

class RepetitionFinder extends NumberComparison {

    public RepetitionFinder() {
        super(null);
    }

    public int getLeftComparison(int[] sequence) {
        return countRepetitions(sequence);
    }

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

class ConsecutiveFinder extends NumberComparison {

    private int growth;

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

class GrowthComparison extends NumberComparison {

    public GrowthComparison() {
        super(null);
    }

    public int getLeftComparison(int[] sequence) { // returns -1 for decay, 0 for not monotonous and 1 for growth
        int verif = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if(sequence[i + 1] > sequence[i]) verif++;
            if(sequence[i + 1] < sequence[i]) verif--;
        }
        return (int) verif / (sequence.length - 1);
    }
}
