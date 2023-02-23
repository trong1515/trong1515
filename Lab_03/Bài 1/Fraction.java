package Lab_03;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(Fraction f){
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    } 
    public Fraction add(Fraction f){
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    public Fraction sub(Fraction f){
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    public Fraction mul(Fraction f){
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.numerator;
        result.denominator = this.denominator * f.denominator;
        return result;
    }
    public Fraction div(Fraction f){
        Fraction result = new Fraction();
        result.numerator = this.numerator * f.denominator;
        result.denominator = this.denominator * f.numerator;
        return result;
    }
    public void reducer(){
        int gcd = 1;
        int min = Math.min(this.numerator, this.denominator);
        for(int i = 1; i <= min; i++){
            if(this.numerator % i == 0 && this.denominator % i == 0){
                gcd = i;
            }
        }
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public int getnumerator() {
        return this.numerator;
    }

    public void setnumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getdenominator() {
        return this.denominator;
    }

    public void setdenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return "{" +
            " numerator='" + getnumerator() + "'" +
            ", denominator='" + getdenominator() + "'" +
            "}";
    }


}
