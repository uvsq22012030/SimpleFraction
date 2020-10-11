public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int i, int j) {
        numerator = i;
        if (j == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        denominator = j;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }


    public String getRationnel() {
        return (numerator + "/" + denominator);
    }

    @Override
    public String toString() {
        return numerator + ((denominator != 1) ? "/" + denominator : "");
    }
}
