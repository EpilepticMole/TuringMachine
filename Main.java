
public class Main {
    public static void main(String[] args) {

        Criterion c = new Criterion(new int[]{1},'=', new ColorComparison(new char[]{'△','◯'}), new NumberComparison(new  int[]{2,4}));

        System.out.println(c.verify(new int[]{3,2,1}));
    }
}