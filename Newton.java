public class Newton {

    private double n;
    private double guess;
    double e = 0.000001;



    //constructors
    public Newton(double n1, double g1) {
        n = n1;
        guess = g1;
        calculateResult();
    }
    //accessors


    public double getN(){
        return n;
    }

    public double getGuess(){
        return guess;
    }

    public void calculateResult(){
    double newGuess = ((n/ guess) + guess)/2;
    while ((Math.abs(guess - newGuess) > e)) {
        guess = newGuess;
    newGuess = ((n/ guess) + guess)/2;
    }
    guess = newGuess;

    }
}
