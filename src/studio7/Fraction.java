package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 0;
	}
	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}
	public String sum(Fraction f2)
	{
		int num = (this.numerator * f2.denominator) + (f2.numerator * this.denominator);
		int den = (this.denominator * f2.denominator);
		return num + "/" + den;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction r = new Fraction(1, 2);
		System.out.print(r.sum(new Fraction(1, 4)));
	}

}
