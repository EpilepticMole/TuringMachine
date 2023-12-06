
public class Main {
    public static void main(String[] args) {

        Criterion c = new Criterion(new int[]{1},'=', new GrowthComparison(), new NumberComparison(new  int[]{1}));

        System.out.println(c.verify(new int[]{4,5,6}));
    }
}