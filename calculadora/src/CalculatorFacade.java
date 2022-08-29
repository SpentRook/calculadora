public class CalculatorFacade {

    private float a;
    private float b;
    // private Addition addition;
    private Substraction substraction;
    private Multiplication multiplication;
    
    public CalculatorFacade(float a, float b){
        this.a = a;
        this.b = b;
        // this.addition = new Addition();
        this.substraction = new Substraction();
        this.multiplication = new Multiplication();
    }

    // public float additionOperation(){
    //     return this.addition.run(this.a, this.b);
    // }

    public float substractionOperation(){
        return this.substraction.run(this.a, this.b);
    }

    public float multiplicationOperation(){
        return this.multiplication.run(this.a, this.b);
    }
}
