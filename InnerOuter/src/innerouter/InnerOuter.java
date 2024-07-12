package innerouter;

public class InnerOuter {

    public static void main(String[] args) {
        int outerVariable = 5;
        InnerOuter outerInstance = new InnerOuter();
        Multiplier Multi = new Multiplier();
        Multi.MultiplyByTwo(outerVariable);
    }

    static class Multiplier {

        public void MultiplyByTwo(int num1) {
            int result = num1 * 2;
            System.out.println("Result: " + result);
        }
    }
}
