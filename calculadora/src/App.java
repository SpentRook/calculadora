public class App {
    public static void main(String[] args) throws Exception {
        CalculatorFacade myCalculator = new CalculatorFacade(3, 2);
        // System.out.println(myCalculator.additionOperation());
        System.out.println(myCalculator.substractionOperation());
        System.out.println(myCalculator.multiplicationOperation());
    }
}
